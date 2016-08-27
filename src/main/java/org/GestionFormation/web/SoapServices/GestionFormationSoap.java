/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.SoapServices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.metier.CollaborateurMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ayoub
 */
@WebService
@Component
public class GestionFormationSoap
{
    @Autowired
    private CollaborateurMetier collaborateurMetier;
    
    @WebMethod
    public Collaborateur getCollaborateur()
    {
        //TODO
        return null;
    }
}
