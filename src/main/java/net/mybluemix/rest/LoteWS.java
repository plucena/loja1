package net.mybluemix.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.mybluemix.dao.LoteDAO;
import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.entity.Lote;
import net.mybluemix.entity.MateriaPrima;

import com.google.gson.Gson;

@Path("lote")
@Produces(MediaType.APPLICATION_JSON)

public class LoteWS {

	
	 @POST
		@Path("/lote/add/{sku}")
		@Consumes("application/json")
	    public void addLot(String json, @PathParam("sku") Integer sku) throws Exception{
	    	Long lsku  = new Long(sku);
	    	Gson gson = new Gson();
			Lote lote =  gson.fromJson(json, Lote.class);
			LoteDAO ldao = new LoteDAO();
			ldao.create(lote);
	    	MateriaPrimaDAO mpd = new MateriaPrimaDAO();
	    	MateriaPrima mp = mpd.find(sku);
	    	//if(mp!=null)
	    	//	mp.addLotes(lote);
	    	//mpd.update(mp, lsku);
	    }
	
	
}
