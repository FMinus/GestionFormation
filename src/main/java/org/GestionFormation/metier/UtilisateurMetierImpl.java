/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.metier;

import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.dao.UtilisateurRepository;
import org.GestionFormation.entities.RoleUtilisateur;
import org.GestionFormation.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class UtilisateurMetierImpl implements UtilisateurMetier
{
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    
    @Autowired
    private RoleUtilisateurMetier roleUtilisateurMetier;
    
    @Override
    public Utilisateur saveUtilisateur(Utilisateur u)
    {
        return utilisateurRepository.save(u);
    }
    
    @Override
    public List<Utilisateur> listUtilisateurs()
    {
        return utilisateurRepository.findAll();
    }
    
    @Override
    public Utilisateur getUtilisateur(Long idUtilisateur)
    {
        Utilisateur user = utilisateurRepository.findOne(idUtilisateur);
        
        if(user==null)
            throw new RuntimeException("Utilisateur Innexistant");
        
        return user;
    }
    
    @Override
    public List<Utilisateur> findByFullName(String nom, String prenom)
    {
        return utilisateurRepository.findByFullName(nom, prenom);
    }
    
    @Override
    public Page<Utilisateur> findUtilisateurs(String mc, Pageable pageable)
    {
        return utilisateurRepository.findUtilisateur(mc, pageable);
    }
    
    @Override
    public Page<Utilisateur> findAllUtilisateurs(Pageable pgbl)
    {
        return  utilisateurRepository.findAll(pgbl);
    }
    
    @Override
    public List<Utilisateur> listUtilisateursOnly()
    {
        return  utilisateurRepository.listUtilisateursOnly();
    }
    
    
    
    /*
    @Override
    public Page<Utilisateur> pageUtilisateursOnly(Pageable pgbl)
    {
    return  utilisateurRepository.findPageUtilisateursOnly(pgbl);
    }
    */
    
    @Override
    public List<Utilisateur> listUsersOnly()
    {
        //List<Utilisateur> employees = utilisateurRepository.createNamedQuery("getAllUsers", Utilisateur.class)
        //        .getResultList();
        return null;
        
    }

    @Override
    public Page<Utilisateur> findPageUtilisateursOnly(String mc, Pageable pageable)
    {
       return utilisateurRepository.findPageUtilisateursOnly(mc, pageable);
    }

    @Override
    public Utilisateur login(String email, String password)
    {
        Utilisateur user = utilisateurRepository.login(email, password);
        
        if(user==null)
        {
            System.out.println("failed login with : "+ email+ " : "+password);
            throw new RuntimeException("Utilisateur Innexistant");
        }
            
        
        return user;
    }

    @Override
    public Utilisateur addRoleToUser(Long idUser,String role)
    {
        Utilisateur u = getUtilisateur(idUser);
        RoleUtilisateur r = roleUtilisateurMetier.getRoleUtilisateur(role);
        
        List<RoleUtilisateur> roleUtilisateur = new ArrayList<>();
        
        if(u.getRoles()!= null)
        {
            roleUtilisateur = (List<RoleUtilisateur>) u.getRoles();
        }
        
        roleUtilisateur.add(r);
        u.setRoles(roleUtilisateur);
        
        return utilisateurRepository.save(u);
    }

    @Override
    public List<RoleUtilisateur> getRoles(Long idUser)
    {
        Utilisateur user = getUtilisateur(idUser);
        return (List<RoleUtilisateur>) user.getRoles();
    }
    
}
