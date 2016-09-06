/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import org.GestionFormation.entities.Collaborateur;
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
public class CollaborateurRepositoryIT
{
    
    public CollaborateurRepositoryIT()
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
     * Test of findCollaborateur method, of class CollaborateurRepository.
     */
    @Test
    public void testFindCollaborateur()
    {
        System.out.println("findCollaborateur");
        String mc = "";
        Pageable pageable = null;
        CollaborateurRepository instance = new CollaborateurRepositoryImpl();
        Page<Collaborateur> expResult = null;
        Page<Collaborateur> result = instance.findCollaborateur(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOneCollaborateur method, of class CollaborateurRepository.
     */
    @Test
    public void testFindOneCollaborateur()
    {
        System.out.println("findOneCollaborateur");
        String mc = "";
        CollaborateurRepository instance = new CollaborateurRepositoryImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.findOneCollaborateur(mc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFirstByEmailUtilisateur method, of class CollaborateurRepository.
     */
    @Test
    public void testFindFirstByEmailUtilisateur()
    {
        System.out.println("findFirstByEmailUtilisateur");
        String email = "";
        CollaborateurRepository instance = new CollaborateurRepositoryImpl();
        Collaborateur expResult = null;
        Collaborateur result = instance.findFirstByEmailUtilisateur(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CollaborateurRepositoryImpl implements CollaborateurRepository
    {

        public Page<Collaborateur> findCollaborateur(String mc, Pageable pageable)
        {
            return null;
        }

        public Collaborateur findOneCollaborateur(String mc)
        {
            return null;
        }

        public Collaborateur findFirstByEmailUtilisateur(String email)
        {
            return null;
        }
    }
    
}
