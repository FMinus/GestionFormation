/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

import java.util.Collection;
import java.util.Date;
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
public class SessionFormationIT
{
    
    public SessionFormationIT()
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
     * Test of getFormation method, of class SessionFormation.
     */
    @Test
    public void testGetFormation()
    {
        System.out.println("getFormation");
        SessionFormation instance = new SessionFormation();
        Formation expResult = null;
        Formation result = instance.getFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormation method, of class SessionFormation.
     */
    @Test
    public void testSetFormation()
    {
        System.out.println("setFormation");
        Formation formation = null;
        SessionFormation instance = new SessionFormation();
        instance.setFormation(formation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdSession method, of class SessionFormation.
     */
    @Test
    public void testGetIdSession()
    {
        System.out.println("getIdSession");
        SessionFormation instance = new SessionFormation();
        Long expResult = null;
        Long result = instance.getIdSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSession method, of class SessionFormation.
     */
    @Test
    public void testSetIdSession()
    {
        System.out.println("setIdSession");
        Long idSession = null;
        SessionFormation instance = new SessionFormation();
        instance.setIdSession(idSession);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateSession method, of class SessionFormation.
     */
    @Test
    public void testGetDateSession()
    {
        System.out.println("getDateSession");
        SessionFormation instance = new SessionFormation();
        Date expResult = null;
        Date result = instance.getDateSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateSession method, of class SessionFormation.
     */
    @Test
    public void testSetDateSession()
    {
        System.out.println("setDateSession");
        Date dateSession = null;
        SessionFormation instance = new SessionFormation();
        instance.setDateSession(dateSession);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocuments method, of class SessionFormation.
     */
    @Test
    public void testGetDocuments()
    {
        System.out.println("getDocuments");
        SessionFormation instance = new SessionFormation();
        Collection<Document> expResult = null;
        Collection<Document> result = instance.getDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocuments method, of class SessionFormation.
     */
    @Test
    public void testSetDocuments()
    {
        System.out.println("setDocuments");
        Collection<Document> documents = null;
        SessionFormation instance = new SessionFormation();
        instance.setDocuments(documents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAbsences method, of class SessionFormation.
     */
    @Test
    public void testGetAbsences()
    {
        System.out.println("getAbsences");
        SessionFormation instance = new SessionFormation();
        Collection<Absence> expResult = null;
        Collection<Absence> result = instance.getAbsences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAbsences method, of class SessionFormation.
     */
    @Test
    public void testSetAbsences()
    {
        System.out.println("setAbsences");
        Collection<Absence> absences = null;
        SessionFormation instance = new SessionFormation();
        instance.setAbsences(absences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormateur method, of class SessionFormation.
     */
    @Test
    public void testGetFormateur()
    {
        System.out.println("getFormateur");
        SessionFormation instance = new SessionFormation();
        Formateur expResult = null;
        Formateur result = instance.getFormateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormateur method, of class SessionFormation.
     */
    @Test
    public void testSetFormateur()
    {
        System.out.println("setFormateur");
        Formateur formateur = null;
        SessionFormation instance = new SessionFormation();
        instance.setFormateur(formateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SessionFormation.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        SessionFormation instance = new SessionFormation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
