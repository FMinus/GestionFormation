/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;
import org.GestionFormation.metier.RoleUtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
@RequestMapping(value = "/roles")
public class RoleUtilisateurRestService
{
    @Autowired
    private RoleUtilisateurMetier roleUtilisateurMetier;
    
    @RequestMapping(value = "list" , method = RequestMethod.GET)
    public List<RoleUtilisateur> listRoleUtilisateur()
    {
        return roleUtilisateurMetier.listRoleUtilisateur();
    }
    
    @RequestMapping(value = "getList" , method = RequestMethod.GET)
    public List<RoleUtilisateur> findRolesUtilisateur(String nomRole)
    {
        return roleUtilisateurMetier.findRolesUtilisateur(nomRole);
    }
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public RoleUtilisateur saveRoleUtilisateur(@RequestBody RoleUtilisateur r)
    {
        return roleUtilisateurMetier.saveRoleUtilisateur(r);
    }
    
    
    @RequestMapping(value = "get" , method = RequestMethod.GET)
    public RoleUtilisateur getRoleUtilisateur(String nom)
    {
        return roleUtilisateurMetier.getRoleUtilisateur(nom);
    }
}
