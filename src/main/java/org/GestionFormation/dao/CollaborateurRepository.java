/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.Collaborateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ayoub
 */
@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur,Long>
{
//    @Query("select c from Collaborateur c fetch join c.collaborateur.nomUtilisateur like :x or c.collaborateur.prenomUtilisateur like :x")
//    public Page<Collaborateur> findCollaborateur(@Param("x") String mc,Pageable pageable);
    
//    @Query("select col from Collaborateur col fetch join col.collaborateur as user where user.emailUtilisateur := x")
//    public Collaborateur findOneCollaborateur(@Param("x") String mc);
    
    //public Collaborateur findFirstByEmailUtilisateur(String email);
    
    public Collaborateur findByCollaborateurEmailUtilisateur(String emailUtilisateur);
    public Page<Collaborateur> findByCollaborateurEmailUtilisateur(String mc,Pageable pageable);
    public Collaborateur findByFormationsNomFormation(String nomFormation);
    public List<Collaborateur> findByConfirmationInscription(boolean isConfirmed);
}
