/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Ayoub
 */
public class SecurityConfigIT
{
    
    public SecurityConfigIT()
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
     * Test of configure method, of class SecurityConfig.
     */
    @Test
    public void testConfigure() throws Exception
    {
        System.out.println("configure");
        HttpSecurity http = null;
        SecurityConfig instance = new SecurityConfig();
        instance.configure(http);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of customAuthenticationProvider method, of class SecurityConfig.
     */
    @Test
    public void testCustomAuthenticationProvider()
    {
        System.out.println("customAuthenticationProvider");
        SecurityConfig instance = new SecurityConfig();
        AuthenticationProvider expResult = null;
        AuthenticationProvider result = instance.customAuthenticationProvider();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of customUserDetailsService method, of class SecurityConfig.
     */
    @Test
    public void testCustomUserDetailsService()
    {
        System.out.println("customUserDetailsService");
        SecurityConfig instance = new SecurityConfig();
        UserDetailsService expResult = null;
        UserDetailsService result = instance.customUserDetailsService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
