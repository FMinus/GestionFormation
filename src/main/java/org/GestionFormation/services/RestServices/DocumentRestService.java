/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.services.RestServices;

import java.util.List;
import org.GestionFormation.entities.Document;
import org.GestionFormation.metier.DocumentMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
public class DocumentRestService
{
    @Autowired
    private DocumentMetier documentMetier;
    
    @RequestMapping(value = "/documents" , method = RequestMethod.POST)
    public Document saveDocument(@RequestBody Document d)
    {
        return documentMetier.saveDocument(d);
    }
    
    @RequestMapping(value = "/documents" , method = RequestMethod.GET)
    public List<Document> listDocuments()
    {
        return documentMetier.listDocuments();
    }
    
}
