/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.metier.ResponsableFormationMetier;
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
public class ResponsableFormationRestService
{
    @Autowired
    private ResponsableFormationMetier responsableFormationMetier;
    
    @RequestMapping(value = "/responsableformations" , method = RequestMethod.POST)
    public ResponsableFormation saveResponsableFormation(@RequestBody ResponsableFormation r)
    {
        return responsableFormationMetier.saveResponsableFormation(r);
    }
    
    @RequestMapping(value = "/responsableformations" , method = RequestMethod.GET)
    public List<ResponsableFormation> listResponsableFormation()
    {
        return responsableFormationMetier.listResponsableFormation();
    }
    
    
    
}
