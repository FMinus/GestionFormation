/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.RestServices;

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
public class DocumentRestServiceIT
{
    
    public DocumentRestServiceIT()
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
     * Test of saveDocument method, of class DocumentRestService.
     */
    @Test
    public void testSaveDocument()
    {
        System.out.println("saveDocument");
        Document d = null;
        DocumentRestService instance = new DocumentRestService();
        Document expResult = null;
        Document result = instance.saveDocument(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listDocuments method, of class DocumentRestService.
     */
    @Test
    public void testListDocuments()
    {
        System.out.println("listDocuments");
        DocumentRestService instance = new DocumentRestService();
        List<Document> expResult = null;
        List<Document> result = instance.listDocuments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
