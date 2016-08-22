/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.SessionFormationRepository;
import org.GestionFormation.entities.SessionFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class SessionFormationMetierImpl implements SessionFormationMetier
{
    @Autowired
    private SessionFormationRepository sessionFormationRepository;
    
    @Override
    public SessionFormation saveSessionFormation(SessionFormation sf)
    {
        return sessionFormationRepository.save(sf);
    }

    @Override
    public List<SessionFormation> listSessionFormations()
    {
        return sessionFormationRepository.findAll();
    }

    @Override
    public SessionFormation getSessionFormations(Long idFormation)
    {
        SessionFormation sessionFormation = sessionFormationRepository.findOne(idFormation);
        
        if(sessionFormation == null)
            throw new RuntimeException("Session de Formation Inexistante");
        
        return sessionFormation;
    }
    
    
}
