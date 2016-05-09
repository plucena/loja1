package net.mybluemix.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.mybluemix.dao.FornecedorDAO;
import net.mybluemix.entity.Fornecedor;

@Path("fornecedor")
@Produces(MediaType.APPLICATION_JSON)

public class FornecedorWS {

	
	@GET
	public List<Fornecedor> listAll(){
		FornecedorDAO fd = new FornecedorDAO();
		return fd.findAll();
	}
}
