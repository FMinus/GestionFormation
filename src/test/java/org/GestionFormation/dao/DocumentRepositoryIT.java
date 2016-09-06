/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

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
public class DocumentRepositoryIT
{
    
    public DocumentRepositoryIT()
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
     * Test of findByName method, of class DocumentRepository.
     */
    @Test
    public void testFindByName()
    {
        System.out.println("findByName");
        String docName = "";
        DocumentRepository instance = new DocumentRepositoryImpl();
        Document expResult = null;
        Document result = instance.findByName(docName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DocumentRepositoryImpl implements DocumentRepository
    {

        public Document findByName(String docName)
        {
            return null;
        }
    }
    
}
