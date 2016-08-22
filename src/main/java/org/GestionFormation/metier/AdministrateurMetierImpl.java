/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.AdministrateurRepository;
import org.GestionFormation.entities.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ayoub
 */
@Service
public class AdministrateurMetierImpl implements AdministrateurMetier
{
    @Autowired
    private AdministrateurRepository administrateurRepository;

    @Override
    public Administrateur saveAdministrateur(Administrateur a)
    {
        return administrateurRepository.save(a);
    }

    @Override
    public List<Administrateur> listAdministrateurs()
    {
        return administrateurRepository.findAll();
    }
    
    
}
