/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.entities;

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
public class DocumentIT
{
    
    public DocumentIT()
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
     * Test of getIdDocument method, of class Document.
     */
    @Test
    public void testGetIdDocument()
    {
        System.out.println("getIdDocument");
        Document instance = new Document();
        Long expResult = null;
        Long result = instance.getIdDocument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdDocument method, of class Document.
     */
    @Test
    public void testSetIdDocument()
    {
        System.out.println("setIdDocument");
        Long idDocument = null;
        Document instance = new Document();
        instance.setIdDocument(idDocument);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomDocument method, of class Document.
     */
    @Test
    public void testGetNomDocument()
    {
        System.out.println("getNomDocument");
        Document instance = new Document();
        String expResult = "";
        String result = instance.getNomDocument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomDocument method, of class Document.
     */
    @Test
    public void testSetNomDocument()
    {
        System.out.println("setNomDocument");
        String nomDocument = "";
        Document instance = new Document();
        instance.setNomDocument(nomDocument);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAjout method, of class Document.
     */
    @Test
    public void testGetDateAjout()
    {
        System.out.println("getDateAjout");
        Document instance = new Document();
        Date expResult = null;
        Date result = instance.getDateAjout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAjout method, of class Document.
     */
    @Test
    public void testSetDateAjout()
    {
        System.out.println("setDateAjout");
        Date dateAjout = null;
        Document instance = new Document();
        instance.setDateAjout(dateAjout);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionFormation method, of class Document.
     */
    @Test
    public void testGetSessionFormation()
    {
        System.out.println("getSessionFormation");
        Document instance = new Document();
        SessionFormation expResult = null;
        SessionFormation result = instance.getSessionFormation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionFormation method, of class Document.
     */
    @Test
    public void testSetSessionFormation()
    {
        System.out.println("setSessionFormation");
        SessionFormation sessionFormation = null;
        Document instance = new Document();
        instance.setSessionFormation(sessionFormation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Document.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Document instance = new Document();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
