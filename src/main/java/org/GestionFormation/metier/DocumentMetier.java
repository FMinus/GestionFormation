/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.Document;

/**
 *
 * @author Ayoub
 */
public interface DocumentMetier
{
    public Document saveDocument(Document d);
    public List<Document> listDocuments();
    public Document getDocument(Long id);
}
