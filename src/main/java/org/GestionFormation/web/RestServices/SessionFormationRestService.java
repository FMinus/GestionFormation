/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package org.GestionFormation.web.RestServices;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.DataOutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.GestionFormation.entities.Document;
import org.GestionFormation.entities.Formateur;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.SessionFormation;
import org.GestionFormation.metier.DocumentMetier;
import org.GestionFormation.metier.FormateurMetier;
import org.GestionFormation.metier.FormationMetier;
import org.GestionFormation.metier.SessionFormationMetier;
import org.GestionFormation.metier.UtilisateurMetier;
import org.GestionFormation.web.config.authentication.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Ayoub
 */
@RestController
@RequestMapping(value = "/sessionFormations")
@PropertySource(value="classpath:application.properties")
public class SessionFormationRestService
{
    @Autowired
    private SessionFormationMetier sessionFormationMetier;
    
    @Autowired
    private FormateurMetier formateurMetier;
    
    @Autowired
    private FormationMetier formationMetier;
    
    @Autowired
    private DocumentMetier documentMetier;
    
    @Autowired
    private UtilisateurMetier utilisateurMetier;
    
    @Value("${uploads.documents}")
    String rootDirectory;
    
    @RequestMapping(value = "ajout" , method = RequestMethod.POST)
    public @ResponseBody SessionFormation saveSessionFormation(@RequestParam(value = "session") String sf,@RequestParam(value = "file") MultipartFile file) throws IOException
    {
        
        ObjectMapper mapper = new ObjectMapper();
        SessionFormation sessionFormation = mapper.readValue(sf, SessionFormation.class);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        System.out.println("session :"+sessionFormation);
        
        List<Document> listDoc = new ArrayList<>();
        List<SessionFormation> listSFormateur = new ArrayList<>();
        List<SessionFormation> listSFormation = new ArrayList<>();
        
        //Save Session
        
        
        
        
        //***********************throws formateur not found exception
        Formateur formateur = formateurMetier.findFormateurByIdUser(sessionFormation.getFormateur().getFormateur().getIdUtilisateur());
        if(formateur == null)
        {
            formateur = new Formateur();
            formateur.setFormateur(utilisateurMetier.getUtilisateur(sessionFormation.getFormateur().getFormateur().getIdUtilisateur()));
            formateurMetier.saveFormateur(formateur);
        }
        sessionFormation.setFormateur(formateur);
        
        sessionFormation = sessionFormationMetier.saveSessionFormation(sessionFormation);
        
        
        //******************* throws formation not found exception
        Formation formation = formationMetier.getFormation(sessionFormation.getFormation().getIdFormation());
        sessionFormation.setFormation(formation);
        //add session to formation
        if(formation.getSessionFormations() != null)
        {
            listSFormation = (List<SessionFormation>) formation.getSessionFormations();
        }
        
        listSFormation.add(sessionFormation);
        formation.setSessionFormations(listSFormation);
        
        
        //**************************add session to formateur
        if(formateur.getSessionFormations() != null)
        {
            listSFormateur = (List<SessionFormation>) formateur.getSessionFormations();
        }
        
        listSFormateur.add(sessionFormation);
        formateur.setSessionFormations(listSFormateur);
        
        formateurMetier.saveFormateur(formateur);
        formationMetier.saveFormation(formation);
        
        

        
        try
        {
            File path = new File(rootDirectory + sessionFormation.getFormation().getNomFormation() + '/' +"Session "+sdf.format(sessionFormation.getDateSession())+"/");
            path.mkdirs();

            file.transferTo(new File(path+"/"+file.getOriginalFilename()));
        } 
        catch (IllegalStateException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        return sessionFormation;
        
    }
    
    @RequestMapping(value = "list" , method = RequestMethod.GET)
    public List<SessionFormation> listSessionFormations()
    {
        return sessionFormationMetier.listSessionFormations();
    }
    
    @RequestMapping(value = "documents" , method = RequestMethod.GET)
    public List<Document> listSessionFormationDocuments(Long idSession)
    {
        return (List<Document>) sessionFormationMetier.getSessionFormations(idSession).getDocuments();
    }
    
    @RequestMapping(value = "pageByNomFormation" , method = RequestMethod.GET)
    public Page<SessionFormation> listSessionFormationsByNomFormation(@RequestParam(name ="nomFormation",defaultValue="") String nomFormation,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue ="5") int size)
    {
        Page<SessionFormation> pageP = sessionFormationMetier.findByNomFormation(nomFormation,new PageRequest(page,size));
        if(!pageP.hasContent())
            System.out.println("empty");
        
        return pageP;
    }
    
    @RequestMapping(value = "pageByEmail" , method = RequestMethod.GET)
    public Page<SessionFormation> listSessionFormationsByEmail(@RequestParam(name ="email",defaultValue="") String email,@RequestParam(name = "page",defaultValue = "0") int page,@RequestParam(name = "size",defaultValue ="5") int size)
    {
        Page<SessionFormation> pageP = sessionFormationMetier.findByEmailFormateur(email,new PageRequest(page,size));
        if(!pageP.hasContent())
            System.out.println("empty");
        
        return pageP;
    }
    
}
