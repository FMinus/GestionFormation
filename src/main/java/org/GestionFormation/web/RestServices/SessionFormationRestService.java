/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.SessionFormation;
import org.GestionFormation.metier.SessionFormationMetier;
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
@RequestMapping(value = "/sessionFormations")
public class SessionFormationRestService
{
    @Autowired
    private SessionFormationMetier sessionFormationMetier;
    
    @RequestMapping(value = "/ajout" , method = RequestMethod.POST)
    public SessionFormation saveSessionFormation(@RequestBody SessionFormation sf)
    {
        return sessionFormationMetier.saveSessionFormation(sf);
    }
    
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public List<SessionFormation> listSessionFormations()
    {
        return sessionFormationMetier.listSessionFormations();
    }
    
}
