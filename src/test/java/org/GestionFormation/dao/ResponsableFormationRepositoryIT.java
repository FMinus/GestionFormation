/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.ResponsableFormation;
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
public class ResponsableFormationRepositoryIT
{
    
    public ResponsableFormationRepositoryIT()
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
     * Test of findByName method, of class ResponsableFormationRepository.
     */
    @Test
    public void testFindByName()
    {
        System.out.println("findByName");
        String name = "";
        ResponsableFormationRepository instance = new ResponsableFormationRepositoryImpl();
        List<ResponsableFormation> expResult = null;
        List<ResponsableFormation> result = instance.findByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ResponsableFormationRepositoryImpl implements ResponsableFormationRepository
    {

        public List<ResponsableFormation> findByName(String name)
        {
            return null;
        }
    }
    
}
