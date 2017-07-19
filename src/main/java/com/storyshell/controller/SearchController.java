package com.storyshell.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import com.storyshell.dao.StudentDao;
import com.storyshell.dao.StudentRepositoryImpl;
import com.storyshell.model.Student;
import com.storyshell.searchservice.GenericExceptionMapper;

@Component
@Path("/users")
public class SearchController {

	@Inject
	private StudentDao studentDao;

	@GET
	@Path("/userdetail")
	@Produces("application/json")
	public Response getStudentDetail() throws Exception{
		Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);
		//studentDao = new StudentRepositoryImpl();
		//try{
		studentDao.saveStudent(student);
		Student result = studentDao.findStudent("Eng2015001");
		return Response.status(Status.OK).entity(student).build();
		//}catch(Exception e){
		//	e.printStackTrace();			
		//}
		//return Response.status(Status.NOT_ACCEPTABLE).entity(student).build();
	}
}
