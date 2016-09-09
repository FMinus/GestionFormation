/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.Date;
import org.GestionFormation.entities.Formation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ayoub
 */
@Repository
public interface FormationRepository extends JpaRepository<Formation,Long>
{
   
    public Formation findByNomFormation(String docName);
    
    
    @Query("select e from Formation e where e.nomFormation like :x")
    public Page<Formation> findAllByName(@Param("x") String mc,Pageable pageable);
    
    public Formation findFirstByNomFormation(String nomFormation);
    
    //TODO formation of collab 
    @Query("select f from Formation f where f.dateFormation between :min and :max")
    public Page<Formation> findFormationDateBetween(@Param("min") Date min,@Param("max") Date max,Pageable pageable);
}
