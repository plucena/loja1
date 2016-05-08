package net.mybluemix.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.entity.MateriaPrima;


@Path("materiaprima")
@Produces(MediaType.APPLICATION_JSON)

public class MateriaPrimaWS {

    @GET
    public MateriaPrima employeeList(){
    	MateriaPrimaDAO mpd = new MateriaPrimaDAO();
    	List<MateriaPrima> mpl = mpd.createQuery("Select a From MateriaPrima a", MateriaPrima.class);
    	return  mpl.get(0);
    }
    
    //@Path("{name}")
   /*
    public String sayHello(@PathParam("name") String name){
        StringBuilder stringBuilder = new StringBuilder("SandBox | Hello ");
        stringBuilder.append(name).append("!");
        return stringBuilder.toString();
    }
    */
    
    
  


}
