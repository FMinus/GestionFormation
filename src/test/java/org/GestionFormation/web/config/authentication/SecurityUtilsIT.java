/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config.authentication;

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
public class SecurityUtilsIT
{
    
    public SecurityUtilsIT()
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
     * Test of hashGenerator method, of class SecurityUtils.
     */
    @Test
    public void testHashGenerator() throws Exception
    {
        System.out.println("hashGenerator");
        String message = "";
        SecurityUtils instance = new SecurityUtils();
        byte[] expResult = null;
        byte[] result = instance.hashGenerator(message);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SHAHasher method, of class SecurityUtils.
     */
    @Test
    public void testSHAHasher() throws Exception
    {
        System.out.println("SHAHasher");
        String message = "";
        SecurityUtils instance = new SecurityUtils();
        StringBuffer expResult = null;
        StringBuffer result = instance.SHAHasher(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
