package net.mybluemix.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;  
import javax.ws.rs.POST;
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.entity.MateriaPrima;


@Path("materiaprima")
@Produces(MediaType.APPLICATION_JSON)

public class MateriaPrimaWS {

    @GET
    public List<MateriaPrima> MateriaPrimaList(){
    	MateriaPrimaDAO mpd = new MateriaPrimaDAO();
    	List<MateriaPrima> mpl = mpd.createQuery("Select a From MateriaPrima a", MateriaPrima.class);
    	return  mpl;
    }
    
    @GET
    @Path("{sku}")
    public MateriaPrima  MateriaPrima(@PathParam("sku") String sku){
    	int x = Integer.parseInt(sku);
    	MateriaPrimaDAO mpd = new MateriaPrimaDAO();
    	return mpd.find(x);
    }


    @POST
	@Path("/create")
	@Consumes("application/json")
    public void create(String json) throws Exception{
    	Gson gson = new Gson();
		MateriaPrima mp =  gson.fromJson(json, MateriaPrima.class);
    	MateriaPrimaDAO mpd = new MateriaPrimaDAO();
    	mpd.create(mp);
    }
    
  


}
