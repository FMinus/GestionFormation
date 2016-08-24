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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
@RequestMapping(value = "/utilisateurs")
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
    
    @RequestMapping(value = "{id}" , method = RequestMethod.GET)
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
    
    @RequestMapping(value = "listUtilisateurs")
    public Page<Utilisateur> listUtilisateurs(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size)
    {
        //return utilisateurMetier.findUtilisateurs("%"+mc+"%",new PageRequest(page,5));
        return utilisateurMetier.findAllUtilisateurs(new PageRequest(page,size));
    }
}
