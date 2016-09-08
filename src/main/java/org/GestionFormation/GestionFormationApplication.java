package org.GestionFormation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.GestionFormation.dao.CollaborateurRepository;
import org.GestionFormation.dao.DocumentRepository;
import org.GestionFormation.dao.FormateurRepository;
import org.GestionFormation.dao.FormationRepository;
import org.GestionFormation.dao.ResponsableFormationRepository;
import org.GestionFormation.dao.SessionFormationRepository;
import org.GestionFormation.entities.Collaborateur;
import org.GestionFormation.entities.Document;
import org.GestionFormation.entities.Formation;
import org.GestionFormation.entities.ResponsableFormation;
import org.GestionFormation.entities.SessionFormation;
import org.GestionFormation.entities.Utilisateur;
import org.GestionFormation.web.mail.ConfirmerInscription;
import org.GestionFormation.web.mail.SimpleConfirmerInscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class GestionFormationApplication
{
    
    
    @Transactional
    public static void main(String[] args) throws ParseException
    {
        ApplicationContext ctx = SpringApplication.run(GestionFormationApplication.class, args);
        
//        CollaborateurRepository collaborateurRepository = ctx.getBean(CollaborateurRepository.class);
//        FormateurRepository formateurRepository = ctx.getBean(FormateurRepository.class);
//        FormationRepository formationRepository = ctx.getBean(FormationRepository.class);
//        ResponsableFormationRepository responsableFormationRepository = ctx.getBean(ResponsableFormationRepository.class);
//        SessionFormationRepository sessionFormationRepository = ctx.getBean(SessionFormationRepository.class);
//        DocumentRepository documentRepository = ctx.getBean(DocumentRepository.class);
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        /*
        Document doc1 = new Document("doc1", df.parse("1991-11-01"), null);
        Document doc2 = new Document("doc2", df.parse("1992-11-02"), null);
        Document doc3 = new Document("doc3", df.parse("1993-11-03"), null);
        Document doc4 = new Document("doc4", df.parse("1994-11-04"), null);
        
        //save
//        documentRepository.save(doc1);
//        documentRepository.save(doc2);
//        documentRepository.save(doc3);
//        documentRepository.save(doc4);
//        
        
        List<Document> doc1_fetchAll = documentRepository.findAll();
        //System.out.println("all docs : "+doc1_fetchAll);
        
        
        //Document doc2_fetch = documentRepository.findByName("doc2");
        //System.out.println("doc 2 fetch : "+doc2_fetch);
        
        Formation formation1 = new Formation("formation1", "dessc1", df.parse("2000-12-21"), null, null, null);
        
        //save
        //formationRepository.save(formation1);
        
        //Formation formation1_fetch = formationRepository.findByName("formation1");
        //Formation formation1_fetch = formationRepository.findOne(Long.valueOf(1));
        List<Formation> formation_fetchAll = formationRepository.findAll();
        
        //System.out.println("formation1 fetch : "+formation_fetchAll.get(0).getNomFormation());
        /*
        for(Formation f : formation_fetchAll)
        {
            System.out.println("formation : "+f.getNomFormation()+" , "+f.getDateFormation());
        }
        
        ResponsableFormation responsableFormation1 = new ResponsableFormation(formation_fetchAll, "ayb", "ayb", df.parse("2000-12-21"), "123", "123mail.com");
        
        responsableFormationRepository.save(responsableFormation1);
        
        List<ResponsableFormation> responsableFormation1_fetchAll = responsableFormationRepository.findByName("ayb");
        System.out.println("result fetch responsable formation : "+responsableFormation1_fetchAll);
        /*
        for(ResponsableFormation r : responsableFormation1_fetchAll)
        {
            System.out.println("resultat fetch resp formation : "+r.getNom()+" "+r.getPrenom());
        }
        
        formation_fetchAll.get(0).setResponsableFormation(responsableFormation1_fetchAll.get(0));
        
        //save
        formation_fetchAll.get(0).setResponsableFormation(responsableFormation1_fetchAll.get(0));
        
        //save
        //formationRepository.save( formation_fetchAll.get(0));
        
        SessionFormation sessionFormation1 = new SessionFormation(df.parse("2000-12-21"), formation1, doc1_all, null);
        
        sessionFormationRepository.save(sessionFormation1);
        
        */
        //SessionFormation sessionFormation = sessionFormationRepository.findAll().get(0);
        /*
        for(Document d : doc1_all)
        {
        d.setSessionFormation(sessionFormation);
        documentRepository.save(d);
        }
        */
        
        //sessionFormation.setDocuments(doc1_all);
        //sessionFormationRepository.save(sessionFormation);
        
        //System.out.println("sessions : "+sessionFormation);
        //Document doc3_fetch = doc;
        //Document doc4_fetch = doc;
        
        
    }
}
