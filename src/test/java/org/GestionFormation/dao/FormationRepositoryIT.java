/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import org.GestionFormation.entities.Formation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Ayoub
 */
public class FormationRepositoryIT
{
    
    public FormationRepositoryIT()
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
     * Test of findByName method, of class FormationRepository.
     */
    @Test
    public void testFindByName()
    {
        System.out.println("findByName");
        String docName = "";
        FormationRepository instance = new FormationRepositoryImpl();
        Formation expResult = null;
        Formation result = instance.findByName(docName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllByName2 method, of class FormationRepository.
     */
    @Test
    public void testFindAllByName2()
    {
        System.out.println("findAllByName2");
        String mc = "";
        Pageable pageable = null;
        FormationRepository instance = new FormationRepositoryImpl();
        Page<Formation> expResult = null;
        Page<Formation> result = instance.findAllByName2(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllByName method, of class FormationRepository.
     */
    @Test
    public void testFindAllByName()
    {
        System.out.println("findAllByName");
        String mc = "";
        Pageable pageable = null;
        FormationRepository instance = new FormationRepositoryImpl();
        Page<Formation> expResult = null;
        Page<Formation> result = instance.findAllByName(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFirstByNomFormation method, of class FormationRepository.
     */
    @Test
    public void testFindFirstByNomFormation()
    {
        System.out.println("findFirstByNomFormation");
        String nomFormation = "";
        FormationRepository instance = new FormationRepositoryImpl();
        Formation expResult = null;
        Formation result = instance.findFirstByNomFormation(nomFormation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FormationRepositoryImpl implements FormationRepository
    {

        public Formation findByName(String docName)
        {
            return null;
        }

        public Page<Formation> findAllByName2(String mc, Pageable pageable)
        {
            return null;
        }

        public Page<Formation> findAllByName(String mc, Pageable pageable)
        {
            return null;
        }

        public Formation findFirstByNomFormation(String nomFormation)
        {
            return null;
        }
    }
    
}
