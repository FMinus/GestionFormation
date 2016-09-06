/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import org.GestionFormation.entities.Formation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Ayoub
 */
public interface FormationRepository extends JpaRepository<Formation,Long>
{
    @Query("select f from Formation f where f.nomFormation = ?")
    public Formation findByName(String docName);
    
    
    @Query("select f from Formation f where f.nomFormation = ?")
    public Page<Formation> findAllByName2(@Param("x") String mc,Pageable pageable);
    
    @Query("select e from Formation e where e.nomFormation like :x")
    public Page<Formation> findAllByName(@Param("x") String mc,Pageable pageable);
    
    //TODO formation of collab 
    
}
