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
        
        if(col == null)
            throw new RuntimeException("Collaborateur Innexistant"); 
        
        return col;
    }

    @Override
    public Collaborateur ajoutFormation(Long idFormation,Long idCollaborateur)
    {
        Formation formation = formationMetier.getFormations(idFormation);
        Collaborateur col = getCollaborateur(idCollaborateur);
        
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
    public List<Formation> getFormationsOfCollab(Long idCollab)
    {
        Collaborateur col = getCollaborateur(idCollab);
        
        if(col.getFormations() == null)
            throw new RuntimeException("collaborateur n'as pas de formations");
        
        return (List<Formation>) col.getFormations();
    }

    @Override
    public Collaborateur ajoutCollaborateur(Long idUser, Long idFormation)
    {
        Utilisateur utilisateur = utilisateurMetier.getUtilisateur(idUser);
        Formation formation = formationMetier.getFormations(idFormation);
        
        if(utilisateur == null)
            throw new RuntimeException("Utilisateur Inexistant");
        
        if(formation == null)
            throw new RuntimeException("Formation Innexistant"); 
        
        Collaborateur col = UserClassesConverter.userToCollaborateur(utilisateur);
        
        col.getFormations().add(formation);
        formation.getCollaborateurs().add(col);
        
        formationMetier.saveFormation(formation);
        
        return saveCollaborateur(col);
                
    }
    /*
    public Collaborateur userToCollaborateur(Utilisateur u)
    {
        Collaborateur col = new Collaborateur();
        
        col.setNomUtilisateur(u.getNomUtilisateur());
        col.setPrenomUtilisateur(u.getPrenomUtilisateur());
        col.setEmailUtilisateur(u.getEmailUtilisateur());
        col.setJoinDate(u.getJoinDate());
        col.setPasswordUtilisateur(u.getPasswordUtilisateur());
        col.setUrlPhotoUtilisateur(u.getUrlPhotoUtilisateur());
        
        List<Formation> listF = new ArrayList<>();
        col.setFormations(listF);
        
        return col;
        
    }
    */
    @Override
    public Page<Collaborateur> findCollaborateur(String mc, Pageable pageable)
    {
        return collaborateurRepository.findCollaborateur(mc, pageable);
    }

    @Override
    public Page<Collaborateur> findAllCollaborateur(Pageable pgbl)
    {
        return collaborateurRepository.findAll(pgbl);
    }

    @Override
    public Page<Collaborateur> findCollaborateurOnly(String mc, Pageable pageable)
    {
        return collaborateurRepository.findCollaborateur(mc,pageable);
    }
}
