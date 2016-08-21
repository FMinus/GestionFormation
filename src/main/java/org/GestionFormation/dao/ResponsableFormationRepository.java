/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.ResponsableFormation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ayoub
 */
public interface ResponsableFormationRepository extends JpaRepository<ResponsableFormation,Long>
{
    @Query("select r from ResponsableFormation r where r.nom=?")
    public List<ResponsableFormation> findByName(String name);
}
