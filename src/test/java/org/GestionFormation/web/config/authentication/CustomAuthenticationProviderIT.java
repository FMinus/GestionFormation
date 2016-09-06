/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config.authentication;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Ayoub
 */
public class CustomAuthenticationProviderIT
{
    
    public CustomAuthenticationProviderIT()
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
     * Test of authenticate method, of class CustomAuthenticationProvider.
     */
    @Test
    public void testAuthenticate()
    {
        System.out.println("authenticate");
        Authentication authentication = null;
        CustomAuthenticationProvider instance = new CustomAuthenticationProvider();
        Authentication expResult = null;
        Authentication result = instance.authenticate(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of supports method, of class CustomAuthenticationProvider.
     */
    @Test
    public void testSupports()
    {
        System.out.println("supports");
        Class authentication = null;
        CustomAuthenticationProvider instance = new CustomAuthenticationProvider();
        boolean expResult = false;
        boolean result = instance.supports(authentication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserDetailsService method, of class CustomAuthenticationProvider.
     */
    @Test
    public void testSetUserDetailsService()
    {
        System.out.println("setUserDetailsService");
        UserDetailsService customUserDetailsService = null;
        CustomAuthenticationProvider instance = new CustomAuthenticationProvider();
        instance.setUserDetailsService(customUserDetailsService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadUserAuthorities method, of class CustomAuthenticationProvider.
     */
    @Test
    public void testLoadUserAuthorities()
    {
        System.out.println("loadUserAuthorities");
        String username = "";
        CustomAuthenticationProvider instance = new CustomAuthenticationProvider();
        List<GrantedAuthority> expResult = null;
        List<GrantedAuthority> result = instance.loadUserAuthorities(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
