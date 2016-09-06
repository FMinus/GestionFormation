/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Formateur;
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
public class FormateurMetierIT
{
    
    public FormateurMetierIT()
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
     * Test of saveFormateur method, of class FormateurMetier.
     */
    @Test
    public void testSaveFormateur()
    {
        System.out.println("saveFormateur");
        Formateur f = null;
        FormateurMetier instance = new FormateurMetierImpl();
        Formateur expResult = null;
        Formateur result = instance.saveFormateur(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listFormateur method, of class FormateurMetier.
     */
    @Test
    public void testListFormateur()
    {
        System.out.println("listFormateur");
        FormateurMetier instance = new FormateurMetierImpl();
        List<Formateur> expResult = null;
        List<Formateur> result = instance.listFormateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FormateurMetierImpl implements FormateurMetier
    {

        public Formateur saveFormateur(Formateur f)
        {
            return null;
        }

        public List<Formateur> listFormateur()
        {
            return null;
        }
    }
    
}
