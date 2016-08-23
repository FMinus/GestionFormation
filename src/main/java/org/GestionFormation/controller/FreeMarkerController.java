/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Ayoub
 */
@Controller
public class FreeMarkerController
{
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld(@ModelAttribute("model") ModelMap model)
    {
        List<car> carList = new ArrayList<>();
        
        carList.add(new car("lamborgini","lampo"));
        carList.add(new car("911","allahu akbar"));
        
         model.addAttribute("carList", carList);
         model.addAttribute("test", "mytest");
         
        //System.out.println("carlist "+carList);
        return "helloworld";
    }
}

