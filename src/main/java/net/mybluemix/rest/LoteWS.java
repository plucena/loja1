package net.mybluemix.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.mybluemix.dao.FornecedorDAO;
import net.mybluemix.dao.LoteDAO;
import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.Lote;
import net.mybluemix.entity.MateriaPrima;
import net.mybluemix.transferobject.LoteTO;

import com.google.gson.Gson;

@Path("lote")
@Produces(MediaType.APPLICATION_JSON)

public class LoteWS {

	@GET
	public List<Lote> listAll(){
		LoteDAO fd = new LoteDAO();
		return fd.findAll();
	}
	
	@GET
    @Path("{sku}")
    public Lote  Lote(@PathParam("sku") Long sku){
    	LoteDAO mpd = new LoteDAO();
    	return mpd.find(sku);
    }
	
	
	@POST
	@Path("/create")
	@Consumes("application/json")
    public void create(String json) throws Exception{
    	Gson gson = new Gson();
		LoteTO mp =  gson.fromJson(json, LoteTO.class);
    	LoteDAO mpd = new LoteDAO();
    	mpd.create(mp);
    }
    

	@POST
	@Path("/update")
	@Consumes("application/json")
    public void update(String json) throws Exception{
    	Gson gson = new Gson();
		LoteTO mp =  gson.fromJson(json, LoteTO.class);
    	LoteDAO mpd = new LoteDAO();
    	mpd.update(mp);
    }


	
}
