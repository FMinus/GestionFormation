/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

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
public class FormateurRestServiceIT
{
    
    public FormateurRestServiceIT()
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
     * Test of saveFormateur method, of class FormateurRestService.
     */
    @Test
    public void testSaveFormateur()
    {
        System.out.println("saveFormateur");
        Formateur f = null;
        FormateurRestService instance = new FormateurRestService();
        Formateur expResult = null;
        Formateur result = instance.saveFormateur(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listFormateur method, of class FormateurRestService.
     */
    @Test
    public void testListFormateur()
    {
        System.out.println("listFormateur");
        FormateurRestService instance = new FormateurRestService();
        List<Formateur> expResult = null;
        List<Formateur> result = instance.listFormateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
