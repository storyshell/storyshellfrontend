package com.storyshell.searchservice;

import java.io.Serializable;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class GenericExceptionMapper implements ExceptionMapper<Throwable>,Serializable{

	public Response toResponse(Throwable exception) {
		// TODO Auto-generated method stub
		return Response.serverError().entity(exception.getMessage()).build();
	}

}
