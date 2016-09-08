/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.Date;
import java.util.List;
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
    public Formation getFormation(Long id);
    public Formation ajoutSession(Long idFormation,SessionFormation sessionFormation);
    public Page<Formation> findFormations(String mc,Pageable pageable);
    public Formation findFormationByName(String nomFormation);
    public Page<Formation> findFormationDateBetween(Date min,Date max,Pageable pageable);
    public void deleteFormation(Formation f);
}
