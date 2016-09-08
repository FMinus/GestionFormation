/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.dao.CollaborateurRepository;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    
    @Autowired
    private FormationMetier formationMetier;
    
    @Autowired
    private UtilisateurMetier utilisateurMetier;


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
        
//        if(col == null)
//            throw new RuntimeException("Collaborateur Innexistant"); 
        
        return col;
    }

    @Override
    public Collaborateur ajoutFormation(Long idFormation,Long idUtilisateur)
    {
        Formation formation = formationMetier.getFormation(idFormation);
        Utilisateur user = utilisateurMetier.getUtilisateur(idUtilisateur);
        
        Collaborateur col = findCollaborateurByEmail(user.getEmailUtilisateur());
        
        if(col == null)
            col = new Collaborateur(user, null, null);
        
        //unnecessary : exception will be thrown in formationRepository
        if(formation == null)
            throw new RuntimeException("Formation Innexistant"); 
        
        List<Formation> listF = new ArrayList<>();
        List<Collaborateur> listC = new ArrayList<>();
        
        if(col.getFormations() != null)
        {
            listF =  (List<Formation>) col.getFormations();
        }
        if(formation.getCollaborateurs() != null)
        {
            listF =  (List<Formation>) col.getFormations();
        }
        
        listF.add(formation);
        listC.add(col);
        
        col.setFormations(listF);
        formation.setCollaborateurs(listC);
        
        saveCollaborateur(col);
        formationMetier.saveFormation(formation);
        
        return col;
    }

    

    
    @Override
    public Page<Collaborateur> findCollaborateur(String mc, Pageable pageable)
    {
        return collaborateurRepository.findByCollaborateurEmailUtilisateur(mc, pageable);
    }

    @Override
    public Page<Collaborateur> findAllCollaborateur(Pageable pgbl)
    {
        return collaborateurRepository.findAll(pgbl);
    }

    

    @Override
    public Collaborateur findCollaborateurByEmail(String email)
    {
        return collaborateurRepository.findByCollaborateurEmailUtilisateur(email);
    }

    
}
