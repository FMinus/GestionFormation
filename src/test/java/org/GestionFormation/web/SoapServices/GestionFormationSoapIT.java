/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.SoapServices;

import org.GestionFormation.entities.Collaborateur;
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
public class GestionFormationSoapIT
{
    
    public GestionFormationSoapIT()
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
     * Test of getCollaborateur method, of class GestionFormationSoap.
     */
    @Test
    public void testGetCollaborateur()
    {
        System.out.println("getCollaborateur");
        GestionFormationSoap instance = new GestionFormationSoap();
        Collaborateur expResult = null;
        Collaborateur result = instance.getCollaborateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
