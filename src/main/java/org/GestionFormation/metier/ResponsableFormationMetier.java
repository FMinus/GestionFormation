/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.Utilisateur;

/**
 *
 * @author Ayoub
 */

public interface ResponsableFormationMetier
{
    public ResponsableFormation saveResponsableFormation(ResponsableFormation r);
    public ResponsableFormation getResponsableFormation(Long idResponsable);
    public List<ResponsableFormation> listResponsableFormation();
    public ResponsableFormation findByEmail(String email);
    public ResponsableFormation findByIdUtilisateur(Long idUtilisateur);
    public ResponsableFormation ajoutFormation(Long idFormation,Long idResp);
    public void supprimerResponsableFormation(ResponsableFormation responsableFormation);
    public ResponsableFormation updateResponsableFormation(ResponsableFormation responsableFormation,Utilisateur newResponsable);
    
}
