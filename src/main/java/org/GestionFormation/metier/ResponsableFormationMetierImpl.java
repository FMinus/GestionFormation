/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.dao.ResponsableFormationRepository;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.Utilisateur;
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
    
     @Autowired
    private FormationMetier formationMetier;
    
    @Autowired
    private UtilisateurMetier utilisateurMetier;

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
    
    @Override
    public ResponsableFormation getResponsableFormation(Long idResponsable)
    {
        ResponsableFormation responsableFormation = responsableFormationRepository.getOne(idResponsable);
        
        if(responsableFormation == null)
            throw new RuntimeException("ResponsableFormation innexistant");
        
        return responsableFormation;
    }
    
    @Override
    public ResponsableFormation findByEmail(String email)
    {
        return responsableFormationRepository.findByResponsableFormationEmailUtilisateur(email);
    }

    @Override
    public ResponsableFormation ajoutFormation(Long idFormation, Long idResp)
    {
        ResponsableFormation responsableFormation = getResponsableFormation(idResp);
        Formation formation = formationMetier.getFormation(idFormation);
        
        formation.setResponsableFormation(responsableFormation);
        formationMetier.saveFormation(formation);
         
        List<Formation> listF = new ArrayList<>();
        
        if(responsableFormation.getFormations()!= null)
            listF = (List<Formation>) responsableFormation.getFormations();
        
        listF.add(formation);
        
        return responsableFormationRepository.save(responsableFormation);
        
    }

    @Override
    public void supprimerResponsableFormation(ResponsableFormation responsableFormation)
    {
        responsableFormationRepository.delete(responsableFormation);
    }

    @Override
    public ResponsableFormation updateResponsableFormation(ResponsableFormation responsableFormation, Utilisateur newResponsable)
    {
        //rechecking if all exists:
        getResponsableFormation(responsableFormation.getIdResp());
        utilisateurMetier.getUtilisateur(newResponsable.getIdUtilisateur());
        
        responsableFormation.setResponsableFormation(newResponsable);
        
        return responsableFormationRepository.save(responsableFormation);
    }

    
    
    
}
