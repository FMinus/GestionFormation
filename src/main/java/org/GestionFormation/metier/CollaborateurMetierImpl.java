/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.CollaborateurRepository;
import org.GestionFormation.entities.Collaborateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class CollaborateurMetierImpl implements CollaborateurMetier
{
    @Autowired
    private CollaborateurRepository collaborateurRepository;

    @Override
    public Collaborateur saveCollaborateur(Collaborateur collaborateur)
    {
        return collaborateurRepository.save(collaborateur);
    }

    @Override
    public List<Collaborateur> listCollaborateur()
    {
        return collaborateurRepository.findAll();
    }

    @Override
    public Collaborateur getCollaborateur(Long idCollaborateur)
    {
        Collaborateur col = collaborateurRepository.findOne(idCollaborateur);
        
        if(col == null)
            throw new RuntimeException("Collaborateur Innexistant"); 
        
        return col;
    }
    
}
