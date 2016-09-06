/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Document;
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
public class DocumentMetierIT
{
    
    public DocumentMetierIT()
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
     * Test of saveDocument method, of class DocumentMetier.
     */
    @Test
    public void testSaveDocument()
    {
        System.out.println("saveDocument");
        Document d = null;
        DocumentMetier instance = new DocumentMetierImpl();
        Document expResult = null;
        Document result = instance.saveDocument(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listDocuments method, of class DocumentMetier.
     */
    @Test
    public void testListDocuments()
    {
        System.out.println("listDocuments");
        DocumentMetier instance = new DocumentMetierImpl();
        List<Document> expResult = null;
        List<Document> result = instance.listDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class DocumentMetier.
     */
    @Test
    public void testGetDocument()
    {
        System.out.println("getDocument");
        Long id = null;
        DocumentMetier instance = new DocumentMetierImpl();
        Document expResult = null;
        Document result = instance.getDocument(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DocumentMetierImpl implements DocumentMetier
    {

        public Document saveDocument(Document d)
        {
            return null;
        }

        public List<Document> listDocuments()
        {
            return null;
        }

        public Document getDocument(Long id)
        {
            return null;
        }
    }
    
}
