/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.RoleUtilisateur;
import org.GestionFormation.entities.Utilisateur;
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
public class UtilisateurMetierIT
{
    
    public UtilisateurMetierIT()
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
     * Test of saveUtilisateur method, of class UtilisateurMetier.
     */
    @Test
    public void testSaveUtilisateur()
    {
        System.out.println("saveUtilisateur");
        Utilisateur u = null;
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.saveUtilisateur(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUtilisateurs method, of class UtilisateurMetier.
     */
    @Test
    public void testListUtilisateurs()
    {
        System.out.println("listUtilisateurs");
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.listUtilisateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUtilisateursOnly method, of class UtilisateurMetier.
     */
    @Test
    public void testListUtilisateursOnly()
    {
        System.out.println("listUtilisateursOnly");
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.listUtilisateursOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUsersOnly method, of class UtilisateurMetier.
     */
    @Test
    public void testListUsersOnly()
    {
        System.out.println("listUsersOnly");
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.listUsersOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPageUtilisateursOnly method, of class UtilisateurMetier.
     */
    @Test
    public void testFindPageUtilisateursOnly()
    {
        System.out.println("findPageUtilisateursOnly");
        String mc = "";
        Pageable pageable = null;
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.findPageUtilisateursOnly(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilisateur method, of class UtilisateurMetier.
     */
    @Test
    public void testGetUtilisateur()
    {
        System.out.println("getUtilisateur");
        Long idUtilisateur = null;
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.getUtilisateur(idUtilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByFullName method, of class UtilisateurMetier.
     */
    @Test
    public void testFindByFullName()
    {
        System.out.println("findByFullName");
        String nom = "";
        String prenom = "";
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.findByFullName(nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUtilisateurs method, of class UtilisateurMetier.
     */
    @Test
    public void testFindUtilisateurs()
    {
        System.out.println("findUtilisateurs");
        String mc = "";
        Pageable pageable = null;
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.findUtilisateurs(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAllUtilisateurs method, of class UtilisateurMetier.
     */
    @Test
    public void testFindAllUtilisateurs()
    {
        System.out.println("findAllUtilisateurs");
        Pageable pgbl = null;
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.findAllUtilisateurs(pgbl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UtilisateurMetier.
     */
    @Test
    public void testLogin()
    {
        System.out.println("login");
        String email = "";
        String password = "";
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.login(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRoleToUser method, of class UtilisateurMetier.
     */
    @Test
    public void testAddRoleToUser()
    {
        System.out.println("addRoleToUser");
        Long idUser = null;
        String role = "";
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.addRoleToUser(idUser, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoles method, of class UtilisateurMetier.
     */
    @Test
    public void testGetRoles()
    {
        System.out.println("getRoles");
        Long idUser = null;
        UtilisateurMetier instance = new UtilisateurMetierImpl();
        List<RoleUtilisateur> expResult = null;
        List<RoleUtilisateur> result = instance.getRoles(idUser);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UtilisateurMetierImpl implements UtilisateurMetier
    {

        public Utilisateur saveUtilisateur(Utilisateur u)
        {
            return null;
        }

        public List<Utilisateur> listUtilisateurs()
        {
            return null;
        }

        public List<Utilisateur> listUtilisateursOnly()
        {
            return null;
        }

        public List<Utilisateur> listUsersOnly()
        {
            return null;
        }

        public Page<Utilisateur> findPageUtilisateursOnly(String mc, Pageable pageable)
        {
            return null;
        }

        public Utilisateur getUtilisateur(Long idUtilisateur)
        {
            return null;
        }

        public List<Utilisateur> findByFullName(String nom, String prenom)
        {
            return null;
        }

        public Page<Utilisateur> findUtilisateurs(String mc, Pageable pageable)
        {
            return null;
        }

        public Page<Utilisateur> findAllUtilisateurs(Pageable pgbl)
        {
            return null;
        }

        public Utilisateur login(String email, String password)
        {
            return null;
        }

        public Utilisateur addRoleToUser(Long idUser, String role)
        {
            return null;
        }

        public List<RoleUtilisateur> getRoles(Long idUser)
        {
            return null;
        }
    }
    
}
