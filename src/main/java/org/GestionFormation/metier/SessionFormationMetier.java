/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.SessionFormation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Ayoub
 */
public interface SessionFormationMetier
{
    public SessionFormation saveSessionFormation(SessionFormation sf);
    public List<SessionFormation> listSessionFormations();
    public SessionFormation getSessionFormations(Long idFormation);
    
    public List<SessionFormation> findByNomFormation(String nomFormation);
    public Page<SessionFormation> findByNomFormation(String nomFormation,Pageable pageable);
    
    public List<SessionFormation> findByEmailFormateur(String email);
    public Page<SessionFormation> findByEmailFormateur(String email,Pageable pageable);
    
}
