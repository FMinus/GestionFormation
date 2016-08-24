/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.controller.administrateur;

import java.util.List;
import javax.validation.Valid;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String saveUtilisateur(@ModelAttribute("user") @Valid Utilisateur u,Model model,BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            System.out.println("has errors");
            
            
            
            return "/admin/formAjout";
        }
        
        for(ObjectError e : bindingResult.getAllErrors())
            {
                System.out.println("error "+e);
            }
            
        
        //utilisateurMetier.saveUtilisateur(u);
        System.out.println("user "+u);
        
        
        return "/admin/formAjout";
    }
    
    @RequestMapping(value = "formAjout")
    public String getForm()
    {
        return "/administrateur/ajoutUtilisateur";
    }
    
    @RequestMapping(value = "listUsers" , method = RequestMethod.GET)
    public String listUtilisateurs(@ModelAttribute("model") ModelMap model)
    {
        model.addAttribute("users", utilisateurMetier.listUtilisateurs());
        return "/administrateur/listUtilisateurs";
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
