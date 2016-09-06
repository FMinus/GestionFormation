/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import org.GestionFormation.entities.Administrateur;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.Utilisateur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ayoub
 */
public class UserClassesConverterIT
{
    
    public UserClassesConverterIT()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of userToCollaborateur method, of class UserClassesConverter.
     */
    @Test
    public void testUserToCollaborateur()
    {
        System.out.println("userToCollaborateur");
        Utilisateur u = null;
        Collaborateur expResult = null;
        Collaborateur result = UserClassesConverter.userToCollaborateur(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userToResponsableFormation method, of class UserClassesConverter.
     */
    @Test
    public void testUserToResponsableFormation()
    {
        System.out.println("userToResponsableFormation");
        Utilisateur u = null;
        ResponsableFormation expResult = null;
        ResponsableFormation result = UserClassesConverter.userToResponsableFormation(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userToFormateur method, of class UserClassesConverter.
     */
    @Test
    public void testUserToFormateur()
    {
        System.out.println("userToFormateur");
        Utilisateur u = null;
        Formateur expResult = null;
        Formateur result = UserClassesConverter.userToFormateur(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userToAdministrateur method, of class UserClassesConverter.
     */
    @Test
    public void testUserToAdministrateur()
    {
        System.out.println("userToAdministrateur");
        Utilisateur u = null;
        Administrateur expResult = null;
        Administrateur result = UserClassesConverter.userToAdministrateur(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
