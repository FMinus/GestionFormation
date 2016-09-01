/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.SecurityUtils;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.GestionFormation.web.config.authentication.SecurityUtils;
import org.junit.Test;

/**
 *
 * @author Ayoub
 */
public class SecurityUtilsTest
{
    @Test
    public void testHasher() throws UnsupportedEncodingException, NoSuchAlgorithmException 
    {
        // The reader is initialized and bound to the input data
        String v1 = "java";
        String v2 = "java";
        
        SecurityUtils securityUtils = new SecurityUtils();
        
        byte[] hashV1 = securityUtils.hashGenerator(v1);
        byte[] hashV2 = securityUtils.hashGenerator(v2);
        
        StringBuffer sb1 = securityUtils.SHAHasher(v1);
        StringBuffer sb2 = securityUtils.SHAHasher(v2);
        
        
        
        System.out.println("hash 1 : "+hashV1);
        System.out.println("hash 2 : "+hashV2);
        
        System.out.println("hash 1 : "+sb1.toString());
        System.out.println("hash 2 : "+sb2.toString());
        
        if(sb1.equals(sb2))
            System.out.println("equals");
        
        
        if(Arrays.equals(hashV1, hashV2))
            System.out.println("equals");
    }
}
