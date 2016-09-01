/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config.authentication;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Ayoub
 */
public class SecurityUtils
{
    
    
    
    
    
    public byte [] hashGenerator(String message) throws UnsupportedEncodingException, NoSuchAlgorithmException
    {
        byte[] bytesOfMessage = message.getBytes("UTF-8");
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] thedigest = md.digest(bytesOfMessage);
        
        return thedigest;
    }
    
    public StringBuffer SHAHasher(String message) throws NoSuchAlgorithmException
    {
        

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(message.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < byteData.length; i++) 
        {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        return sb;
    }
}
