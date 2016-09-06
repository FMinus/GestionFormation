/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.models;

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
public class ResultIT
{
    
    public ResultIT()
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
     * Test of getData method, of class Result.
     */
    @Test
    public void testGetData()
    {
        System.out.println("getData");
        Result instance = new Result();
        Object expResult = null;
        Object result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Result.
     */
    @Test
    public void testSetData()
    {
        System.out.println("setData");
        Object data = null;
        Result instance = new Result();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Result.
     */
    @Test
    public void testGetMessage()
    {
        System.out.println("getMessage");
        Result instance = new Result();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class Result.
     */
    @Test
    public void testSetMessage()
    {
        System.out.println("setMessage");
        String message = "";
        Result instance = new Result();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class Result.
     */
    @Test
    public void testIsStatus()
    {
        System.out.println("isStatus");
        Result instance = new Result();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Result.
     */
    @Test
    public void testSetStatus()
    {
        System.out.println("setStatus");
        boolean status = false;
        Result instance = new Result();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
