/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

import java.util.List;
import org.GestionFormation.entities.Administrateur;
import org.GestionFormation.metier.AdministrateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
public class AdministrateurRestService
{
    @Autowired
    private AdministrateurMetier administrateurMetier;
    
    @RequestMapping(value = "/adminstrateurs" , method = RequestMethod.POST)
    public Administrateur saveAdministrateur(@RequestBody Administrateur a)
    {
        return administrateurMetier.saveAdministrateur(a);
    }
    
    @RequestMapping(value = "/adminstrateurs" , method = RequestMethod.GET)
    public List<Administrateur> listAdministrateurs()
    {
        return administrateurMetier.listAdministrateurs();
    }
    
}
