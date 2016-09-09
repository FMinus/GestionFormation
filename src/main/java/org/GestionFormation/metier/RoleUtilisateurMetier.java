/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;

/**
 *
 * @author Ayoub
 */
public interface RoleUtilisateurMetier
{
    public List<RoleUtilisateur> listRoleUtilisateur();
    public List<RoleUtilisateur> findRolesUtilisateur(String nomRole);
    public RoleUtilisateur saveRoleUtilisateur(RoleUtilisateur r);
    public RoleUtilisateur saveNewRoleUtilisateur(String nom,String Desc);
    public RoleUtilisateur getRoleUtilisateur(String nom);
    public RoleUtilisateur findRoleUtilisateurByName(String nom);
    
}
