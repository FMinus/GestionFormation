/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.services.RestServices;

import java.util.List;
import org.GestionFormation.entities.Absence;
import org.GestionFormation.metier.AbsenceMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
public class AbsenceRestService
{
    @Autowired 
    private AbsenceMetier absenceMetier;
    
    
    @RequestMapping(value = "/absences" , method = RequestMethod.GET)
    public List<Absence> listAbsences()
    {
        return absenceMetier.listAbsences();
    }
    
    
    
}
