/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.SessionFormation;

/**
 *
 * @author Ayoub
 */
public interface SessionFormationMetier
{
    public SessionFormation saveSessionFormation(SessionFormation sf);
    public List<SessionFormation> listSessionFormations();
    public SessionFormation getSessionFormations(Long idFormation);
    
}
