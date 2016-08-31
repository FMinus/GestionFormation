/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.web.config.toDelete.handlers;

import ch.qos.logback.core.net.ObjectWriter;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ayoub
 */
@Component
@Path("/news")
public class NewsEntryResource
{
//    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private NewsEntryDao newsEntryDao;
//
//	@Autowired
//	private ObjectMapper mapper;
//
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String list() throws JsonGenerationException, JsonMappingException, IOException
//	{
//		this.logger.info("list()");
//
//		ObjectWriter viewWriter;
//		if (this.isAdmin()) {
//			viewWriter = this.mapper.writerWithView(JsonViews.Admin.class);
//		} else {
//			viewWriter = this.mapper.writerWithView(JsonViews.User.class);
//		}
//		List<NewsEntry> allEntries = this.newsEntryDao.findAll();
//
//		return viewWriter.writeValueAsString(allEntries);
//	}
//
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("{id}")
//	public NewsEntry read(@PathParam("id") Long id)
//	{
//		this.logger.info("read(id)");
//
//		NewsEntry newsEntry = this.newsEntryDao.find(id);
//		if (newsEntry == null) {
//			throw new WebApplicationException(404);
//		}
//		return newsEntry;
//	}
//
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public NewsEntry create(NewsEntry newsEntry)
//	{
//		this.logger.info("create(): " + newsEntry);
//
//		return this.newsEntryDao.save(newsEntry);
//	}
//
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("{id}")
//	public NewsEntry update(@PathParam("id") Long id, NewsEntry newsEntry)
//	{
//		this.logger.info("update(): " + newsEntry);
//
//		return this.newsEntryDao.save(newsEntry);
//	}
//
//	@DELETE
//	@Produces(MediaType.APPLICATION_JSON)
//	@Path("{id}")
//	public void delete(@PathParam("id") Long id)
//	{
//		this.logger.info("delete(id)");
//
//		this.newsEntryDao.delete(id);
//	}
//
//	private boolean isAdmin()
//	{
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		Object principal = authentication.getPrincipal();
//		if ((principal instanceof String) && ((String) principal).equals("anonymousUser")) {
//			return false;
//		}
//		UserDetails userDetails = (UserDetails) principal;
//
//		return userDetails.getAuthorities().contains(Role.ADMIN);
//	}

}
