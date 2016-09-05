/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.SessionFormation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Ayoub
 */
public interface FormationMetier
{
    public Formation saveFormation(Formation f);
    public List<Formation> listFormations();
    public Formation getFormations(Long id);
    public List<Collaborateur> getCollaborateurs(Long idFormation); 
    public List<SessionFormation> getSessionFormations(Long idFormation);
    public Formation ajoutSession(Long idFormation,Long idSessionFormation);
    public Page<Formation> findFormations(String mc,Pageable pageable);
}
