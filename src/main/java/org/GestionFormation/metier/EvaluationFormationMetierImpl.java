/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.dao.EvaluationFormationRepository;
import org.GestionFormation.entities.EvaluationFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ayoub
 */
@Service
@Transactional
public class EvaluationFormationMetierImpl implements EvaluationFormationMetier
{
    @Autowired
    private EvaluationFormationRepository evaluationFormationRepository;
    

    @Override
    public List<EvaluationFormation> listEvaluationFormations()
    {
        return evaluationFormationRepository.findAll();
    }

    @Override
    public EvaluationFormation saveEvaluationFormation(EvaluationFormation evaluationFormation)
    {
        return evaluationFormationRepository.save(evaluationFormation);
    }
    
}
