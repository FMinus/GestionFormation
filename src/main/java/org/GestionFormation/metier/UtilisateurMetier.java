/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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
    public Page<Utilisateur> findUtilisateurs(String mc,Pageable pageable);
     public Page<Utilisateur> findAllUtilisateurs(Pageable pgbl);
}
