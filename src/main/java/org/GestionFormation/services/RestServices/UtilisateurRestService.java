/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.services.RestServices;

import java.util.List;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
public class UtilisateurRestService
{
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @RequestMapping(value = "/utilisateurs" , method = RequestMethod.POST)
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur u)
    {
        return utilisateurMetier.saveUtilisateur(u);
    }

    @RequestMapping(value = "/utilisateurs" , method = RequestMethod.GET)
    public List<Utilisateur> listUtilisateurs()
    {
        return utilisateurMetier.listUtilisateurs();
    }
    
    @RequestMapping(value = "/utilisateurs/{id}" , method = RequestMethod.GET)
    public Utilisateur getUtilisateur(@PathVariable Long id)
    {
        return utilisateurMetier.getUtilisateur(id);
    }
    
    //FIXME 
    @RequestMapping(value = "/utilisateurs/{nom}?{prenom}" , method = RequestMethod.GET)
    public List<Utilisateur> getUtilisateurByFullName(@PathVariable String prenom,@PathVariable String nom)
    {
        return utilisateurMetier.findByFullName(nom, prenom);
    }
}
