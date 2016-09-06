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
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

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
    
    @Query("select e from Utilisateur e where role = Utilisateur")
    public List<Utilisateur> findUtilisateursOnly();
    
    @Query("select e from Utilisateur e where role = 'Collaborateur'")
    public List<Utilisateur> findCollaborateursOnly();
    
     @Query("select e from Utilisateur e where e.emailUtilisateur = :email")
    public List<Utilisateur> findByEmail(@Param("email")String email);
    
    @Query("select e from Utilisateur e where role = Utilisateur and (e.nomUtilisateur like :x or e.prenomUtilisateur like :x)")
    public Page<Utilisateur> findPageUtilisateursOnly(@Param("x") String mc,Pageable pageable);
    
    @Query("select e from Utilisateur e where role = Utilisateur")
    public List<Utilisateur> listUtilisateursOnly();
    
    @Query("select u from Utilisateur u where u.emailUtilisateur=?1 and u.passwordUtilisateur= ?2 and role = Utilisateur") 
    public Utilisateur login(String emailUtilisateur,String passwordUtilisateur);
    
    @Modifying
    @Query("UPDATE Utilisateur u SET u.urlPhotoUtilisateur = ?2 WHERE u.idUtilisateur = ?1")
    public void updateUrlPhotoUtilisateur(Long idUtilisateur, String urlPhotoUtilisateur);
    
    @Query("select u from Utilisateur u where u.emailUtilisateur=?1")
    public Utilisateur findUserByEmailUtilisateur(String email);
    
    public Utilisateur findFirstByOrderByEmailUtilisateurAsc(String email);
    
    public Utilisateur findFirstByEmailUtilisateur(String email);

    @Modifying
    @Query("UPDATE Utilisateur u SET u.passwordUtilisateur = ?1 WHERE u.idUtilisateur = ?2")
    public void updatePassword(String newPassword, Long id);
    
     @PreAuthorize("hasRole('ROLE_ADMIN')")
     @Override
     Utilisateur save(Utilisateur u);
}
