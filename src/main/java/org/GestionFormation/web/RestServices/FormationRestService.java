/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.SessionFormation;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.metier.CollaborateurMetier;
import org.GestionFormation.metier.FormateurMetier;
import org.GestionFormation.metier.FormationMetier;
import org.GestionFormation.metier.ResponsableFormationMetier;
import org.GestionFormation.metier.UserClassesConverter;
import org.GestionFormation.metier.UtilisateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
@RequestMapping(value = "/formations")
public class FormationRestService
{
    @Autowired
    private FormationMetier formationMetier;
    
    @Autowired 
    private ResponsableFormationMetier responsableFormationMetier;
    
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    @Autowired
    private FormateurMetier formateurMetier;
            
    @Autowired
    private UtilisateurMetier utilisateurMetier;        

   
    @RequestMapping(value = "get" , method = RequestMethod.GET)
    public Formation getFormations(@RequestParam(name = "idFormation") Long id)
    {
        return formationMetier.getFormations(id);
    }
    
     @RequestMapping(value = "getCollabs" , method = RequestMethod.GET)
    public List<Collaborateur> getCollaborateurs(@RequestParam(name = "idFormation") Long idFormation)
    {
        return formationMetier.getCollaborateurs(idFormation);
    }
    
     @RequestMapping(value = "getSessions" , method = RequestMethod.GET)
    public List<SessionFormation> getSessionFormations(@RequestParam(name = "idFormation") Long idFormation)
    {
        return formationMetier.getSessionFormations(idFormation);
    }
    
    
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public Formation saveFormation(@RequestBody Formation f)
    {
        return formationMetier.saveFormation(f);
    }
    
    @RequestMapping(value = "list" , method = RequestMethod.GET)
    public List<Formation> listFormation()
    {
        return formationMetier.listFormations();
    }
    
    @RequestMapping(value = "collabs" , method = RequestMethod.GET)
    public List<Collaborateur> listCollaborateurs(@RequestParam(name = "idFormation") Long idForm)
    {
        return formationMetier.getCollaborateurs(idForm);
    }
    
     @RequestMapping(value = "ajoutSession" , method = RequestMethod.GET)
    public Formation ajoutSession(@RequestParam(name = "idFormation") Long idForm,@RequestParam("idSession") Long idSession )
    {
        return formationMetier.ajoutSession(idForm, idSession);
    }
    
    @RequestMapping(value = "creer" , method = RequestMethod.POST)
    public void creerFormations(@RequestBody Formation f)
    {
        List<Collaborateur> listCol = new ArrayList<>();
        Utilisateur u;
        
        for(Collaborateur col : f.getCollaborateurs())
        {
            u = utilisateurMetier.getUtilisateur(col.getIdUtilisateur());
            listCol.add(UserClassesConverter.userToCollaborateur(u));
        }
        
        List<Formateur> listFormateurs = new ArrayList<>();
        
        ResponsableFormation resp = UserClassesConverter.userToResponsableFormation(utilisateurMetier.getUtilisateur(f.getResponsableFormation().getIdUtilisateur()));
        
        f.setCollaborateurs(listCol);
        f.setResponsableFormation(resp);
        
        responsableFormationMetier.saveResponsableFormation(resp);
        for(Collaborateur col : listCol)
        {
             collaborateurMetier.saveCollaborateur(col);
        }
        
        for(Formateur form : listFormateurs)
        {
           formateurMetier.saveFormateur(form);
        }

        Formation formation = formationMetier.saveFormation(f);
    }
}
