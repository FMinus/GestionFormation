/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Formateur;

/**
 *
 * @author Ayoub
 */
public interface FormateurMetier
{
    public Formateur saveFormateur(Formateur f);
    public List<Formateur> listFormateur();
    public Formateur findFormateurByEmail(String email);
}
