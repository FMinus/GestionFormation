/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;
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
public class RoleUtilisateurRepositoryIT
{
    
    public RoleUtilisateurRepositoryIT()
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
     * Test of findByRoleName method, of class RoleUtilisateurRepository.
     */
    @Test
    public void testFindByRoleName()
    {
        System.out.println("findByRoleName");
        String roleName = "";
        RoleUtilisateurRepository instance = new RoleUtilisateurRepositoryImpl();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.findByRoleName(roleName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RoleUtilisateurRepositoryImpl implements RoleUtilisateurRepository
    {

        public List<RoleUtilisateur> findByRoleName(String roleName)
        {
            return null;
        }
    }
    
}
