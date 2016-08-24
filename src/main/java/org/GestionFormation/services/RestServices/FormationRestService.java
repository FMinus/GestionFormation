/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.services.RestServices;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.metier.FormateurMetier;
import org.GestionFormation.metier.FormationMetier;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/formations")
public class FormationRestService
{
    @Autowired
    private FormationMetier formationMetier;
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public Formation saveFormation(@RequestBody Formation f)
    {
        return formationMetier.saveFormation(f);
    }
    
    @RequestMapping(value = "list" , method = RequestMethod.GET)
    public List<Formation> listFormation()
    {
        return formationMetier.listFormations();
    }
    
    @RequestMapping(value = "collabs" , method = RequestMethod.GET)
    public List<Collaborateur> listCollaborateurs(@RequestParam(name = "idFormation") Long idForm)
    {
        return formationMetier.getCollaborateurs(idForm);
    }
}
