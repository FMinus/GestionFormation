/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import java.util.List;
import org.GestionFormation.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Ayoub
 */
public interface DocumentRepository extends JpaRepository<Document,Long>
{
    
    @Query("select d from Document d where d.nomDocument = ?")
    public Document findByName(String docName);
    
}
