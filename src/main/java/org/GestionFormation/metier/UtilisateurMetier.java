/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Utilisateur;

/**
 *
 * @author Ayoub
 */
public interface UtilisateurMetier
{
    public Utilisateur saveUtilisateur(Utilisateur u);
    public List<Utilisateur> listUtilisateurs();
    public Utilisateur getUtilisateur(Long idUtilisateur);
    public List<Utilisateur> findByFullName(String nom,String prenom);
}
