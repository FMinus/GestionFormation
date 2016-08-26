/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.services.RestServices;

import java.util.List;
import org.GestionFormation.entities.EvaluationFormation;
import org.GestionFormation.metier.EvaluationFormationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ayoub
 */
@RestController
@RequestMapping(value = "evaluationFormation")
public class EvaluationFormationRestService
{
    @Autowired
    private EvaluationFormationMetier evaluationFormationMetier;
    
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<EvaluationFormation> listEvaluationFormations()
    {
        return evaluationFormationMetier.listEvaluationFormations();
    }
    
    @RequestMapping(value = "ajout",method = RequestMethod.POST)
    public EvaluationFormation saveEvaluationFormation(EvaluationFormation evaluationFormation)
    {
        return evaluationFormationMetier.saveEvaluationFormation(evaluationFormation);
    }
    
}
