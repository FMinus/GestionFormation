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
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.SessionFormation;
import org.GestionFormation.entities.Utilisateur;
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
    
    @Autowired 
    private ResponsableFormationMetier responsableFormationMetier;
    
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
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
    public void deleteFormation(Long  idFormation)
    {
        Formation formation = getFormation(idFormation);
        
        List<Collaborateur> listCol = (List<Collaborateur>) formation.getCollaborateurs();
        ResponsableFormation resp = formation.getResponsableFormation();
        
        if(resp != null)
        {
            resp.getFormations().remove(formation);
        }
        
        if(listCol != null)
        {
            for(Collaborateur col : listCol)
            {
                col.getFormations().remove(formation);
            }
        }
        
        formationRepository.delete(formation);
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

    @Override
    public Formation createFormation(Formation f)
    {
        List<Collaborateur> listCol = new ArrayList<>();
        Utilisateur user;
        
        System.out.println("nom formation "+f.getNomFormation());
        System.out.println("desc "+f.getDescription());
        System.out.println("resp "+f.getResponsableFormation().getResponsable().getIdUtilisateur());
        for(Collaborateur col : f.getCollaborateurs())
        {
            System.out.println("colaborateur : "+col.getCollaborateur().getIdUtilisateur());
        }
        
        
        for(Collaborateur col : f.getCollaborateurs())
        {
            user = utilisateurMetier.getUtilisateur(col.getCollaborateur().getIdUtilisateur());
            
            if(col.getFormations() == null)
            {
                col.setFormations(new ArrayList<Formation>());
            }
            
            col.getFormations().add(f);
            collaborateurMetier.saveCollaborateur(col);
            
            listCol.add(col);
        }
        
        ResponsableFormation resp = responsableFormationMetier.findByIdUtilisateur(f.getResponsableFormation().getResponsable().getIdUtilisateur());
        
        if(resp == null)
            resp = new ResponsableFormation();
        
        List<Formation> listFresp = new ArrayList<>();
        if(resp.getFormations()!=null)
        {
            listFresp = (List<Formation>) resp.getFormations();
        }
        listFresp.add(f);
        resp.setResponsable(utilisateurMetier.getUtilisateur(f.getResponsableFormation().getResponsable().getIdUtilisateur()));
        responsableFormationMetier.saveResponsableFormation(resp);
        
        
        
        f.setCollaborateurs(listCol);
        f.setResponsableFormation(resp);
        
       return formationRepository.save(f);
        
    }
    
    
}
