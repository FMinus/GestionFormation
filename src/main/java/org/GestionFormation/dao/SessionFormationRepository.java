/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import org.GestionFormation.entities.SessionFormation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ayoub
 */
public interface SessionFormationRepository extends JpaRepository<SessionFormation,Long>
{
    
}
