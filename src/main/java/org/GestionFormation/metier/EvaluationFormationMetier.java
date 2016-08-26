/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.metier;

import java.util.List;
import org.GestionFormation.entities.EvaluationFormation;

/**
 *
 * @author Ayoub
 */
public interface EvaluationFormationMetier
{
    public List<EvaluationFormation> listEvaluationFormations();
    public EvaluationFormation saveEvaluationFormation(EvaluationFormation evaluationFormation);
}
