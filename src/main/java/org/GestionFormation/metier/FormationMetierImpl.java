/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.GestionFormation.dao.FormationRepository;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.Formation;
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
    public Formation getFormation(Long id)
    {
        Formation f = formationRepository.findOne(id);
        
        if(f == null)
            throw new RuntimeException("Formation Inexistante");
        
        return f;
    }
    
    @Override
    public Page<Formation> findFormations(String mc, Pageable pageable)
    {
        return formationRepository.findAllByName(mc,pageable);
    }

    @Override
    public Formation findFormationByName(String mc)
    {
        return formationRepository.findFirstByNomFormation(mc);
    }

    @Override
    public void deleteFormation(Formation f)
    {
        formationRepository.delete(f);
    }

    @Override
    public Formation ajoutSession(Long idFormation, SessionFormation sessionFormation)
    {
        Formation formation = getFormation(idFormation);
        
        sessionFormation.setFormation(formation);
        sessionFormationMetier.saveSessionFormation(sessionFormation);
        
        List<SessionFormation> listS = new ArrayList<>();
        
        if(formation.getSessionFormations()!=null)
            listS = (List<SessionFormation>) formation.getSessionFormations();
        
        listS.add(sessionFormation);
        
        formation.setSessionFormations(listS);
        
        return formationRepository.save(formation);
    }

    @Override
    public Page<Formation> findFormationDateBetween(Date min, Date max, Pageable pageable)
    {
        return formationRepository.findFormationDateBetween(min, max, pageable);
    }
    
    
}
