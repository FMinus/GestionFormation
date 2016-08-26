/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.UtilisateurRepository;
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
         return  utilisateurRepository.findUtilisateursOnly();
    }
    
    /*
    @Override
    public Page<Utilisateur> pageUtilisateursOnly(Pageable pgbl)
    {
        return  utilisateurRepository.findPageUtilisateursOnly(pgbl);
    }
    */
    
}
