/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
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
public class UtilisateurRepositoryIT
{
    
    public UtilisateurRepositoryIT()
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
     * Test of findByFullName method, of class UtilisateurRepository.
     */
    @Test
    public void testFindByFullName()
    {
        System.out.println("findByFullName");
        String nom = "";
        String prenom = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.findByFullName(nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUtilisateur method, of class UtilisateurRepository.
     */
    @Test
    public void testFindUtilisateur()
    {
        System.out.println("findUtilisateur");
        String mc = "";
        Pageable pageable = null;
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.findUtilisateur(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUtilisateursOnly method, of class UtilisateurRepository.
     */
    @Test
    public void testFindUtilisateursOnly()
    {
        System.out.println("findUtilisateursOnly");
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.findUtilisateursOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCollaborateursOnly method, of class UtilisateurRepository.
     */
    @Test
    public void testFindCollaborateursOnly()
    {
        System.out.println("findCollaborateursOnly");
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.findCollaborateursOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByEmail method, of class UtilisateurRepository.
     */
    @Test
    public void testFindByEmail()
    {
        System.out.println("findByEmail");
        String email = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.findByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPageUtilisateursOnly method, of class UtilisateurRepository.
     */
    @Test
    public void testFindPageUtilisateursOnly()
    {
        System.out.println("findPageUtilisateursOnly");
        String mc = "";
        Pageable pageable = null;
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Page<Utilisateur> expResult = null;
        Page<Utilisateur> result = instance.findPageUtilisateursOnly(mc, pageable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listUtilisateursOnly method, of class UtilisateurRepository.
     */
    @Test
    public void testListUtilisateursOnly()
    {
        System.out.println("listUtilisateursOnly");
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        List<Utilisateur> expResult = null;
        List<Utilisateur> result = instance.listUtilisateursOnly();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class UtilisateurRepository.
     */
    @Test
    public void testLogin()
    {
        System.out.println("login");
        String emailUtilisateur = "";
        String passwordUtilisateur = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.login(emailUtilisateur, passwordUtilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUrlPhotoUtilisateur method, of class UtilisateurRepository.
     */
    @Test
    public void testUpdateUrlPhotoUtilisateur()
    {
        System.out.println("updateUrlPhotoUtilisateur");
        Long idUtilisateur = null;
        String urlPhotoUtilisateur = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        instance.updateUrlPhotoUtilisateur(idUtilisateur, urlPhotoUtilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserByEmailUtilisateur method, of class UtilisateurRepository.
     */
    @Test
    public void testFindUserByEmailUtilisateur()
    {
        System.out.println("findUserByEmailUtilisateur");
        String email = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.findUserByEmailUtilisateur(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFirstByOrderByEmailUtilisateurAsc method, of class UtilisateurRepository.
     */
    @Test
    public void testFindFirstByOrderByEmailUtilisateurAsc()
    {
        System.out.println("findFirstByOrderByEmailUtilisateurAsc");
        String email = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.findFirstByOrderByEmailUtilisateurAsc(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findFirstByEmailUtilisateur method, of class UtilisateurRepository.
     */
    @Test
    public void testFindFirstByEmailUtilisateur()
    {
        System.out.println("findFirstByEmailUtilisateur");
        String email = "";
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.findFirstByEmailUtilisateur(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePassword method, of class UtilisateurRepository.
     */
    @Test
    public void testUpdatePassword()
    {
        System.out.println("updatePassword");
        String newPassword = "";
        Long id = null;
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        instance.updatePassword(newPassword, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class UtilisateurRepository.
     */
    @Test
    public void testSave()
    {
        System.out.println("save");
        Utilisateur u = null;
        UtilisateurRepository instance = new UtilisateurRepositoryImpl();
        Utilisateur expResult = null;
        Utilisateur result = instance.save(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UtilisateurRepositoryImpl implements UtilisateurRepository
    {

        public List<Utilisateur> findByFullName(String nom, String prenom)
        {
            return null;
        }

        public Page<Utilisateur> findUtilisateur(String mc, Pageable pageable)
        {
            return null;
        }

        public List<Utilisateur> findUtilisateursOnly()
        {
            return null;
        }

        public List<Utilisateur> findCollaborateursOnly()
        {
            return null;
        }

        public List<Utilisateur> findByEmail(String email)
        {
            return null;
        }

        public Page<Utilisateur> findPageUtilisateursOnly(String mc, Pageable pageable)
        {
            return null;
        }

        public List<Utilisateur> listUtilisateursOnly()
        {
            return null;
        }

        public Utilisateur login(String emailUtilisateur, String passwordUtilisateur)
        {
            return null;
        }

        public void updateUrlPhotoUtilisateur(Long idUtilisateur, String urlPhotoUtilisateur)
        {
        }

        public Utilisateur findUserByEmailUtilisateur(String email)
        {
            return null;
        }

        public Utilisateur findFirstByOrderByEmailUtilisateurAsc(String email)
        {
            return null;
        }

        public Utilisateur findFirstByEmailUtilisateur(String email)
        {
            return null;
        }

        public void updatePassword(String newPassword, Long id)
        {
        }

        public Utilisateur save(Utilisateur u)
        {
            return null;
        }
    }
    
}
