/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.metier.CollaborateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
@RequestMapping(value = "/collaborateurs")
public class CollaborateurRestService
{
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public Collaborateur saveCollaborateur(@RequestBody Collaborateur collaborateur)
    {
        return collaborateurMetier.saveCollaborateur(collaborateur);
    }
    
    @RequestMapping(value = "list" , method = RequestMethod.GET)
    public List<Collaborateur> listCollaborateur()
    {
        return collaborateurMetier.listCollaborateur();
    }
    
    @RequestMapping(value = "ajoutFormation" , method = RequestMethod.GET)
    public Collaborateur ajoutFormationCollaborateur(@RequestParam(name = "idCollab") Long idcol,@RequestParam(name = "idFormation") Long idfor)
    {
        return collaborateurMetier.ajoutFormation(idfor, idcol);
    }
    
    @RequestMapping(value = "formations" , method = RequestMethod.GET)
    public List<Formation> listFormationsCollaborateur(@RequestParam(name = "idCollab") Long idcol)
    {
        return collaborateurMetier.getFormationsOfCollab(idcol);
    }
    
    @RequestMapping(value = "pageCollaborateurs")
    public Page<Collaborateur> listCollaborateur(@RequestParam(name = "page") int page,@RequestParam(name = "size") int size)
    {
        //return utilisateurMetier.findUtilisateurs("%"+mc+"%",new PageRequest(page,5));
        return collaborateurMetier.findAllCollaborateur(new PageRequest(page,size));
    }
    
    @RequestMapping(value = "pageCollaborateursOnly")
    public Page<Collaborateur> pageUtilisateursOnly(@RequestParam(name = "mc",defaultValue = "") String mc,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue ="5") int size)
    {
        return collaborateurMetier.findCollaborateur("%"+mc+"%",new PageRequest(page,size));
    }
}
