/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

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
public class AbsenceIT
{
    
    public AbsenceIT()
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
     * Test of getIdAbsence method, of class Absence.
     */
    @Test
    public void testGetIdAbsence()
    {
        System.out.println("getIdAbsence");
        Absence instance = new Absence();
        Long expResult = null;
        Long result = instance.getIdAbsence();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAbsence method, of class Absence.
     */
    @Test
    public void testSetIdAbsence()
    {
        System.out.println("setIdAbsence");
        Long idAbsence = null;
        Absence instance = new Absence();
        instance.setIdAbsence(idAbsence);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCollaborateur method, of class Absence.
     */
    @Test
    public void testGetCollaborateur()
    {
        System.out.println("getCollaborateur");
        Absence instance = new Absence();
        Collaborateur expResult = null;
        Collaborateur result = instance.getCollaborateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCollaborateur method, of class Absence.
     */
    @Test
    public void testSetCollaborateur()
    {
        System.out.println("setCollaborateur");
        Collaborateur collaborateur = null;
        Absence instance = new Absence();
        instance.setCollaborateur(collaborateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionFormation method, of class Absence.
     */
    @Test
    public void testGetSessionFormation()
    {
        System.out.println("getSessionFormation");
        Absence instance = new Absence();
        SessionFormation expResult = null;
        SessionFormation result = instance.getSessionFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionFormation method, of class Absence.
     */
    @Test
    public void testSetSessionFormation()
    {
        System.out.println("setSessionFormation");
        SessionFormation sessionFormation = null;
        Absence instance = new Absence();
        instance.setSessionFormation(sessionFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Absence.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Absence instance = new Absence();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
