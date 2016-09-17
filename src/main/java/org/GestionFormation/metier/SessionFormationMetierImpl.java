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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayoub
 */
@Service
@Transactional
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
    
    @Override
    public List<SessionFormation> findByNomFormation(String nomFormation)
    {
        return sessionFormationRepository.findByFormationNomFormation(nomFormation);
    }
    
    @Override
    public Page<SessionFormation> findByNomFormation(String nomFormation, Pageable pageable)
    {
        return sessionFormationRepository.findByFormationNomFormation(nomFormation, pageable);
    }
    
    @Override
    public List<SessionFormation> findByEmailFormateur(String email)
    {
        return sessionFormationRepository.findByFormateurFormateurEmailUtilisateur(email);
    }
    
    @Override
    public Page<SessionFormation> findByEmailFormateur(String email, Pageable pageable)
    {
        return sessionFormationRepository.findByFormateurFormateurEmailUtilisateur(email,pageable);    
    }
    
    
}
