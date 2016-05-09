package net.mybluemix.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import net.mybluemix.dao.FornecedorDAO;
import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.MateriaPrima;

@Path("fornecedor")
@Produces(MediaType.APPLICATION_JSON)

public class FornecedorWS {

	
	@GET
	public List<Fornecedor> listAll(){
		FornecedorDAO fd = new FornecedorDAO();
		return fd.findAll();
	}
	
	@GET
    @Path("{cnpj}")
    public Fornecedor  Fornecedor(@PathParam("cnpj") String cnpj){
		FornecedorDAO fd = new FornecedorDAO();
    	return fd.find(cnpj);
    }
	
		@POST
		@Path("/create")
		@Consumes("application/json")
	    public void create(String json) throws Exception{
	    	Gson gson = new Gson();
			Fornecedor f=  gson.fromJson(json, Fornecedor.class);
	    	FornecedorDAO fd = new FornecedorDAO();
	    	fd.create(f);
	    }
	    
}
