package com.example.ex1;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/api")
public class Conversor {
    
	@GET
	@Path("/km")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String ConverteParaMilha(){
		double km = 10.0;
		double milha = km / 1.609;
        String resultado = Double.toString(milha);		
		return resultado;
	}
	@POST
	@Path("/kn")
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Object ConverteParaKm(@FormParam("kn") final double kn){
		double km  = (kn / 1.852);
        Object resultado = km;
		return resultado;
	}
	
}   