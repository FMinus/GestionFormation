/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/utilisateurs")
//@Secured(value = {"ROLE_ADMINISTRATEUR"})
public class UtilisateurRestService
{
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur u)
    {
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
    
    //FIXME
    @RequestMapping(value = "find" , method = RequestMethod.GET)
    public List<Utilisateur> getUtilisateurByFullName(@RequestParam(name = "prenom") String prenom,@RequestParam(name="nom") String nom)
    {
        return utilisateurMetier.findByFullName(nom, prenom);
    }
    
    @RequestMapping(value = "/listUtilisateurs-backed", method = RequestMethod.GET)
    public String Index(Model model,
                        @RequestParam(name = "page",defaultValue = "0") int p,
                        @RequestParam(name = "motCle",defaultValue = "") String mc)
    {
        //Page<Etudiant> pageEtudiants = etudiantRepository.findAll(new PageRequest(p,5));
        Page<Utilisateur> pageUtilisateurs = utilisateurMetier.findUtilisateurs("%"+mc+"%",new PageRequest(p,5));
        
        
        int pageCount = pageUtilisateurs.getTotalPages();
        int[] pages = new int[pageCount];
        
        for(int i=0 ; i<pageCount ; i++)
        {
            pages[i]=i;
        }
        //object accessble a travers la session
        model.addAttribute("pageUtilisateurs",pageUtilisateurs);
        model.addAttribute("pages",pages);
        model.addAttribute("pageCourante",p);
        model.addAttribute("motCle",mc);
        
        return "listUtilisateurs";
    }
    
    @RequestMapping(value = "pageUsers")
    public Page<Utilisateur> listUtilisateurs(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size)
    {
        //return utilisateurMetier.findUtilisateurs("%"+mc+"%",new PageRequest(page,5));
        return utilisateurMetier.findAllUtilisateurs(new PageRequest(page,size));
    }
    
    @RequestMapping(value = "pageUsersOnly")
    public Page<Utilisateur> pageUtilisateursOnly(@RequestParam(name = "mc",defaultValue = "") String mc,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue ="5") int size)
    {
        //return utilisateurMetier.findUtilisateurs("%"+mc+"%",new PageRequest(page,5));
        return utilisateurMetier.findPageUtilisateursOnly("%"+mc+"%",new PageRequest(page,size));
    }
    
    @RequestMapping(value="/login",method = RequestMethod.POST, consumes = "application/json; charset=UTF-8")
    public Utilisateur login(@RequestBody Utilisateur utilisateur)
    {
        System.out.println("login : "+utilisateur.getEmailUtilisateur()+ " " +utilisateur.getPasswordUtilisateur());
       return utilisateurMetier.login(utilisateur.getEmailUtilisateur(), utilisateur.getPasswordUtilisateur());
    }
}
