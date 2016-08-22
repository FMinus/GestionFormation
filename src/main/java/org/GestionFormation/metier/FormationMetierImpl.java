/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.FormationRepository;
import org.GestionFormation.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class FormationMetierImpl implements FormationMetier
{
    @Autowired
    private FormationRepository formationRepository;

    @Override
    public Formation saveFormation(Formation f)
    {
        return formationRepository.save(f);
    }

    @Override
    public List<Formation> listFormations()
    {
        return formationRepository.findAll();
    }

    @Override
    public Formation getFormations(Long id)
    {
        Formation f = formationRepository.findOne(id);
        
        if(f == null)
            throw new RuntimeException("Formation Inexistante");
        
        return f;
    }
    
    
}
