/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.SessionFormation;
import org.GestionFormation.metier.FormationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    
    

   
    @RequestMapping(value = "get" , method = RequestMethod.GET)
    public Formation getFormations(@RequestParam(name = "idFormation") Long id)
    {
        return formationMetier.getFormation(id);
    }
    
     @RequestMapping(value = "getCollabs" , method = RequestMethod.GET)
    public List<Collaborateur> getCollaborateurs(@RequestParam(name = "idFormation") Long idFormation)
    {
        return (List<Collaborateur>) formationMetier.getFormation(idFormation).getCollaborateurs(); 
    }
    
     @RequestMapping(value = "getSessions" , method = RequestMethod.GET)
    public List<SessionFormation> getSessionFormations(@RequestParam(name = "idFormation") Long idFormation)
    {
        return (List<SessionFormation>) formationMetier.getFormation(idFormation).getSessionFormations();
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
    
    
    @RequestMapping(value = "ajoutSession" , method = RequestMethod.GET)
    public Formation ajoutSession(@RequestParam(name = "idFormation") Long idForm,@RequestParam("idSession") Long idSession )
    {
        //return formationMetier.ajoutSession(idForm, idSession);
        //TODO
        return null;
    }
    
    @RequestMapping(value = "creer" , method = RequestMethod.POST)
    public void creerFormations(@RequestBody Formation f)
    {


        Formation formation = formationMetier.createFormation(f);
    }
    
    @RequestMapping(value = "pageFormations")
    public Page<Formation> pageFormations(@RequestParam(name = "mc",defaultValue = "") String mc,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue ="5") int size)
    {
        Page<Formation> pageF = formationMetier.findFormations("%"+mc+"%",new PageRequest(page,size));
        //System.out.println("get list"+formationMetier.listFormations());
        
//        for(Formation f : pageF)
//            System.out.println("formation"+f);
        
        return pageF;
    }
}
