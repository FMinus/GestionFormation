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
    
    @Query(value = "SELECT * FROM UTILISATEUR WHERE idUtilisateur = 1", nativeQuery = true)
    public List<Utilisateur> findUtilisateursOnly();
    
    /*
    @Query(value = "SELECT * FROM Utilisateur",
    countQuery = "SELECT count(*) FROM Utilisateur",
    nativeQuery = true)
    public Page<Utilisateur> findPageUtilisateursOnly(Pageable pageable);
    */
}
