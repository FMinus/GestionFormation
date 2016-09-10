/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Ayoub
 */
public interface CollaborateurMetier 
{
    public Collaborateur saveCollaborateur(Collaborateur collaborateur);
    public List<Collaborateur> listCollaborateur();
    public List<Formation> findFormationsCollabByEmail(String email);
    public Collaborateur getCollaborateur(Long idCollaborateur);
    public Collaborateur findCollaborateurByEmail(String email);
    public Collaborateur ajoutFormation(Long idFormation,Long idCollaborateur);
    public Page<Collaborateur> findCollaborateur(String mc,Pageable pageable);
    public Page<Collaborateur> findAllCollaborateur(Pageable pgbl);
}
