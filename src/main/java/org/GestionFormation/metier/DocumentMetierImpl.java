/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.DocumentRepository;
import org.GestionFormation.entities.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayoub
 */
@Service
@Transactional
public class DocumentMetierImpl implements DocumentMetier
{
    @Autowired
    private DocumentRepository documentRepository;
    
    @Override
    public Document saveDocument(Document d)
    {
        return documentRepository.save(d);
    }

    @Override
    public List<Document> listDocuments()
    {
        return documentRepository.findAll();
    }

    @Override
    public Document getDocument(Long id)
    {
        Document doc = documentRepository.findOne(id);
        
        if(doc == null)
            throw new RuntimeException("Document Inexistant");
        
        return doc;
    }
    
}
