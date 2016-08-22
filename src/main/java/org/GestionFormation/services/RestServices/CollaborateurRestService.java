/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.services.RestServices;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.metier.CollaborateurMetier;
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
public class CollaborateurRestService
{
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    @RequestMapping(value = "/collaborateurs" , method = RequestMethod.POST)
    public Collaborateur saveCollaborateur(@RequestBody Collaborateur collaborateur)
    {
        return collaborateurMetier.saveCollaborateur(collaborateur);
    }
    
    @RequestMapping(value = "/collaborateurs" , method = RequestMethod.GET)
    public List<Collaborateur> listCollaborateur()
    {
        return collaborateurMetier.listCollaborateur();
    }
    
}
