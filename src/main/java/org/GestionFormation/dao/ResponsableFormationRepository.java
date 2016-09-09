/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.dao;

import org.GestionFormation.entities.ResponsableFormation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ayoub
 */
public interface ResponsableFormationRepository extends JpaRepository<ResponsableFormation,Long>
{
    public ResponsableFormation findByResponsableEmailUtilisateur(String emailUtilisateur);
    public ResponsableFormation findByResponsableIdUtilisateur(Long idUtilisateur);
    public Page<ResponsableFormation> findByResponsableEmailUtilisateur(String mc,Pageable pageable);
    public ResponsableFormation findByFormationsNomFormation(String nomFormation);

}
