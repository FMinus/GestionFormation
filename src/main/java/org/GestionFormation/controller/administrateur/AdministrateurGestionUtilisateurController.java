/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.controller.administrateur;

import java.util.List;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ayoub
 */
@Controller
@RequestMapping("/admin")
public class AdministrateurGestionUtilisateurController
{
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public Utilisateur saveUtilisateur(Utilisateur u)
    {
        return utilisateurMetier.saveUtilisateur(u);
    }
    
    @RequestMapping(value = "formAjout")
    public String getForm()
    {
        return "/administrateur/ajoutUtilisateur";
    }

    public List<Utilisateur> listUtilisateurs()
    {
        return utilisateurMetier.listUtilisateurs();
    }

    public Utilisateur getUtilisateur(Long idUtilisateur)
    {
        return utilisateurMetier.getUtilisateur(idUtilisateur);
    }

    public List<Utilisateur> findByFullName(String nom, String prenom)
    {
        return utilisateurMetier.findByFullName(nom, prenom);
    }

    public Page<Utilisateur> findUtilisateurs(String mc, Pageable pageable)
    {
        return utilisateurMetier.findUtilisateurs(mc, pageable);
    }

    public Page<Utilisateur> findAllUtilisateurs(Pageable pgbl)
    {
        return utilisateurMetier.findAllUtilisateurs(pgbl);
    }
}
