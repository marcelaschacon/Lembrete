package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("lembrete")
public class ListarRest {

	@GET
	@Path("listar")
	public Response helloWorld(){
		System.out.println("novo acesso");
		
		return Response.status(200).entity("HAHAHAHA").build();	
		
		
	}
}