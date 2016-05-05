package net.mybluemix.rest;

import javax.servlet.annotation.WebServlet;
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;


@Path("materiaprima")
public class RestExample {

    @GET
    public String employeeList(){
    	return "{'Ola'}";
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
