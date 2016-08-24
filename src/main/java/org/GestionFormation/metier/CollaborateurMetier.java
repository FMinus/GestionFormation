/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;

/**
 *
 * @author Ayoub
 */
public interface CollaborateurMetier 
{
    public Collaborateur saveCollaborateur(Collaborateur collaborateur);
    public List<Collaborateur> listCollaborateur();
    public Collaborateur getCollaborateur(Long idCollaborateur);
    public Collaborateur ajoutFormation(Long idFormation,Long idCollaborateur);
    public List<Formation> getFormationsOfCollab(Long idCollab);
}
