/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.SessionFormation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ayoub
 */
@Repository
public interface SessionFormationRepository extends JpaRepository<SessionFormation,Long>
{
    public List<SessionFormation> findByFormationNomFormation(String nomFormation);
    public Page<SessionFormation> findByFormationNomFormation(String nomFormation,Pageable pageable);
    
    public List<SessionFormation> findByFormateurFormateurEmailUtilisateur(String email);
    public Page<SessionFormation> findByFormateurFormateurEmailUtilisateur(String email,Pageable pageable);
    
}
