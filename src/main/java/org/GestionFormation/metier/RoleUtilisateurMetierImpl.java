/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.RoleUtilisateurRepository;
import org.GestionFormation.entities.RoleUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayoub
 */
@Service
@Transactional
public class RoleUtilisateurMetierImpl implements RoleUtilisateurMetier
{
    @Autowired
    private RoleUtilisateurRepository roleUtilisateurRepository;

    @Override
    public List<RoleUtilisateur> listRoleUtilisateur()
    {
        return roleUtilisateurRepository.findAll();
    }

    @Override
    public List<RoleUtilisateur> findRolesUtilisateur(String nomRole)
    {
        return roleUtilisateurRepository.findByRoleName(nomRole);
    }

    @Override
    public RoleUtilisateur saveRoleUtilisateur(RoleUtilisateur r)
    {
        return roleUtilisateurRepository.save(r);
    }

    @Override
    public RoleUtilisateur saveNewRoleUtilisateur(String nom, String Desc)
    {
        RoleUtilisateur r = new RoleUtilisateur(nom, Desc);
        return roleUtilisateurRepository.save(r);
    }

    @Override
    public RoleUtilisateur getRoleUtilisateur(String nom)
    {
        RoleUtilisateur role = roleUtilisateurRepository.findOne(nom);
        
        if(role==null)
            throw new RuntimeException("Role Innexistant");
        
        return role;
    }

    @Override
    public RoleUtilisateur findRoleUtilisateurByName(String nom)
    {
        return roleUtilisateurRepository.findFirstByNomRole(nom);
    }
    
}
