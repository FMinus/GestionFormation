/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.metier.FormateurMetier;
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
public class FormateurRestService
{
    @Autowired
    private FormateurMetier formateurMetier;
    
    @RequestMapping(value = "/formateurs" , method = RequestMethod.POST)
    public Formateur saveFormateur(@RequestBody Formateur f)
    {
        return formateurMetier.saveFormateur(f);
    }
    
    @RequestMapping(value = "/formateurs" , method = RequestMethod.GET)
    public List<Formateur> listFormateur()
    {
        return formateurMetier.listFormateur();
    }
    
}
