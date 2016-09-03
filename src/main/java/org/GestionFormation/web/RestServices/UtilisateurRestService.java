/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.RestServices;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.entities.RoleUtilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.GestionFormation.metier.RoleUtilisateurMetier;
import org.GestionFormation.web.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/utilisateurs")
//@Secured(value = {"ROLE_ADMINISTRATEUR"})
public class UtilisateurRestService
{
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @Autowired
    private RoleUtilisateurMetier roleUtilisateurMetier;
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur u)
    {
        //todo add hash for password 
        return utilisateurMetier.saveUtilisateur(u);
    }
    
    @RequestMapping(value = "list" , method = RequestMethod.GET)
    public List<Utilisateur> listUtilisateurs()
    {
        return utilisateurMetier.listUtilisateurs();
    }
    
    @RequestMapping(value = "listOnlyUsers" , method = RequestMethod.GET)
    public List<Utilisateur> listUtilisateursOnly()
    {
        return utilisateurMetier.listUtilisateursOnly();
    }
    
    @RequestMapping(value = "{id}" , method = RequestMethod.GET)
    public Utilisateur getUtilisateur(@PathVariable Long id)
    {
        return utilisateurMetier.getUtilisateur(id);
    }
    
    @RequestMapping(value = "getByCreds" , method = RequestMethod.POST)
    public Utilisateur getUtilisateur(@RequestBody Utilisateur utilisateur)
    {
        Utilisateur user = utilisateurMetier.login(utilisateur.getEmailUtilisateur(), utilisateur.getPasswordUtilisateur());
        return user;
    }
    
    //FIXME
    @RequestMapping(value = "find" , method = RequestMethod.GET)
    public List<Utilisateur> getUtilisateurByFullName(@RequestParam(name = "prenom") String prenom,@RequestParam(name="nom") String nom)
    {
        return utilisateurMetier.findByFullName(nom, prenom);
    }
    
    
    @RequestMapping(value = "pageUsers")
    public Page<Utilisateur> listUtilisateurs(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size)
    {
        return utilisateurMetier.findAllUtilisateurs(new PageRequest(page,size));
    }
    
    @PreAuthorize("hasRole('ROLE_ADMINISTRATEUR')")
    @Secured({"ROLE_REGULAR_USER","ROLE_ADMINISTRATEUR"})
    @RolesAllowed("ADMINISTRATEUR")
    @RequestMapping(value = "pageUsersOnly")
    public Page<Utilisateur> pageUtilisateursOnly(@RequestParam(name = "mc",defaultValue = "") String mc,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue ="5") int size)
    {
        return utilisateurMetier.findPageUtilisateursOnly("%"+mc+"%",new PageRequest(page,size));
    }
    
    @RequestMapping(value="/login",method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
    public Result login(@RequestBody Utilisateur utilisateur)
    {
        System.out.println("login : "+utilisateur.getEmailUtilisateur()+ " " +utilisateur.getPasswordUtilisateur());
        
        Utilisateur user = utilisateurMetier.login(utilisateur.getEmailUtilisateur(), utilisateur.getPasswordUtilisateur());
        
        
        
        Result r = new Result();
        r.setStatus(true);
        r.setMessage("");
        r.setData(user);
        return r;
    }
    
    @RequestMapping(value="/currentUser",method = RequestMethod.GET)
    public String getCurrentUser(HttpServletRequest request, HttpServletResponse response)
    {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        Object o = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        
        HttpSession session = request.getSession();
        
        System.out.println("current user : "+auth.getPrincipal());
        
        return name;
    }
    
    
    @RequestMapping(value = "/session", produces = MediaType.APPLICATION_JSON_VALUE)
    Map<String, String> helloUser(Principal principal)
    {
        Map<String, String> result = new HashMap<>();
        result.put("username", principal.getName());
        return result;
    }
                                                
    @RequestMapping("/logout")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void logout(HttpSession session) {
        session.invalidate();
    }
    
    @RequestMapping("user")
    public Principal user(Principal user)
    {
        return user;
    }
    
    @RequestMapping("roles")
    public List<RoleUtilisateur> getRoles(@RequestParam(value ="id") Long idUser)
    {
        return utilisateurMetier.getRoles(idUser);
    }
    
    @RequestMapping(value = "addRoleToUser",method = RequestMethod.POST)
    public Utilisateur addRoleToUser(@RequestBody Utilisateur u)
    {
        //TODO
        //System.out.println("adding to user"+idUser+" : the roles : "+roles);
        
        List<RoleUtilisateur> listRoles = new ArrayList<>();
        RoleUtilisateur role;
        
        if(u.getRoles()!= null)
        {
            for(RoleUtilisateur r : u.getRoles())
            {
                role = roleUtilisateurMetier.getRoleUtilisateur(r.getNomRole());
                listRoles.add(r);
            }
        }
        
        System.out.println("roles to add"+listRoles);
        
        Utilisateur user = utilisateurMetier.getUtilisateur(u.getIdUtilisateur());
        user.setRoles(listRoles);
        
        return utilisateurMetier.saveUtilisateur(user);
        
    }
}
