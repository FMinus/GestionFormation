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
    public Collaborateur ajoutCollaborateur(Long idUser,Long idFormation);
    public List<Collaborateur> listCollaborateur();
    public Collaborateur getCollaborateur(Long idCollaborateur);
    public Collaborateur getCollaborateurByEmail(String email);
    public Collaborateur findOneCollaborateurByEmail(String email);
    public Collaborateur ajoutFormation(Long idFormation,Long idCollaborateur);
    public List<Formation> getFormationsOfCollab(Long idCollab);
    public Page<Collaborateur> findCollaborateur(String mc,Pageable pageable);
    public Page<Collaborateur> findCollaborateurOnly(String mc,Pageable pageable);
    public Page<Collaborateur> findAllCollaborateur(Pageable pgbl);
}
