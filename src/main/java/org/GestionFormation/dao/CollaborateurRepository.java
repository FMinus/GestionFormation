/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ayoub
 */
public interface CollaborateurRepository extends JpaRepository<Collaborateur,Long>
{
    @Query("select c from Collaborateur c where c.nomUtilisateur like :x or c.prenomUtilisateur like :x")
    public Page<Collaborateur> findCollaborateur(@Param("x") String mc,Pageable pageable);
    
    @Query("select c from Collaborateur c where c.emailUtilisateur = :x")
    public Collaborateur findOneCollaborateur(@Param("x") String mc);
    
    
    //public Collaborateur findFirstemailUtilisateur(String email);
}
