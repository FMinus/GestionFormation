/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ayoub
 */
public interface RoleUtilisateurRepository extends JpaRepository<RoleUtilisateur, String>
{
    @Query("select r from RoleUtilisateur r where r.nomRole = :roleName")
    public List<RoleUtilisateur> findByRoleName(@Param("roleName")String roleName);
}
