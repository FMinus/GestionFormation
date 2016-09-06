/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.util.Collection;
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
public class FormateurIT
{
    
    public FormateurIT()
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
     * Test of getSessionFormations method, of class Formateur.
     */
    @Test
    public void testGetSessionFormations()
    {
        System.out.println("getSessionFormations");
        Formateur instance = new Formateur();
        Collection<SessionFormation> expResult = null;
        Collection<SessionFormation> result = instance.getSessionFormations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionFormations method, of class Formateur.
     */
    @Test
    public void testSetSessionFormations()
    {
        System.out.println("setSessionFormations");
        Collection<SessionFormation> sessionFormations = null;
        Formateur instance = new Formateur();
        instance.setSessionFormations(sessionFormations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Formateur.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Formateur instance = new Formateur();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
