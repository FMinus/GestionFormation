/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.ResponsableFormationRepository;
import org.GestionFormation.entities.ResponsableFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class ResponsableFormationMetierImpl implements ResponsableFormationMetier
{
    @Autowired
    private ResponsableFormationRepository responsableFormationRepository;
    
    @Override
    public ResponsableFormation saveResponsableFormation(ResponsableFormation r)
    {
        return responsableFormationRepository.save(r);
    }

    @Override
    public List<ResponsableFormation> listResponsableFormation()
    {
        return responsableFormationRepository.findAll();
    }
    
    
}
