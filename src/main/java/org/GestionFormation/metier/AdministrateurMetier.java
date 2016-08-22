/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Administrateur;

/**
 *
 * @author Ayoub
 */
public interface AdministrateurMetier
{
    public Administrateur saveAdministrateur(Administrateur a);
    public List<Administrateur> listAdministrateurs();
}
