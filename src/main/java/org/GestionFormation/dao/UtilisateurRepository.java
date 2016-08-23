/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;


import java.util.List;
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
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>
{
    @Query("select u from Utilisateur u where u.nomUtilisateur = :nom and u.prenomUtilisateur = :prenom")
    public List<Utilisateur> findByFullName(@Param("nom")String nom,@Param("prenom") String prenom);
    
    @Query("select e from Utilisateur e where e.nomUtilisateur like :x or e.prenomUtilisateur like :x")
    public Page<Utilisateur> findUtilisateur(@Param("x") String mc,Pageable pageable);
    
   
    
}
