/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.metier;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.dao.FormationRepository;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.SessionFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayoub
 */
@Service
@Transactional
public class FormationMetierImpl implements FormationMetier
{
    @Autowired
    private FormationRepository formationRepository;
    
    @Autowired
    private SessionFormationMetier sessionFormationMetier;
    
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
    
    @Override
    public List<Collaborateur> getCollaborateurs(Long idFormation)
    {
        Formation f = getFormations(idFormation);
        return (List<Collaborateur>) f.getCollaborateurs();
    }
    
    @Override
    public List<SessionFormation> getSessionFormations(Long idFormation)
    {
        Formation f = getFormations(idFormation);
        return (List<SessionFormation>) f.getSessionFormations();
    }
    
    

    @Override
    public Formation ajoutSession(Long idFormation,Long idsessionFormation)
    {
        Formation f = getFormations(idFormation);
        SessionFormation sessionFormation = sessionFormationMetier.getSessionFormations(idsessionFormation);
        
        List<SessionFormation> listS = new ArrayList<>();
        
        if(f.getSessionFormations()!=null)
        {
            listS = (List<SessionFormation>) f.getSessionFormations();
            
        }
        listS.add(sessionFormation);
        f.setSessionFormations(listS);
        
        sessionFormation.setFormation(f);
        
        return f;
    }
    
    
}
