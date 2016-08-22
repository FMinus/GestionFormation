/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.AbsenceRepository;
import org.GestionFormation.entities.Absence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class AbsenceMetierImpl implements AbsenceMetier
{
    @Autowired
    private AbsenceRepository absenceRepository;

    @Override
    public List<Absence> listAbsences()
    {
        return absenceRepository.findAll();
    }
    
    
}
