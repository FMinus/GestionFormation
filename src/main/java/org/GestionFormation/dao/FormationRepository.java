/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ayoub
 */
public interface FormationRepository extends JpaRepository<Formation,Long>
{
    @Query("select f from Formation f where f.nomFormation = ?")
    public Formation findByName(String docName);
    
    @Query("select f from Formation f where f.nomFormation = ?")
    public List<Formation> findAllByName(String docName);
    
    @Override
    public Formation findOne(Long id);
    
}
