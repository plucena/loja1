package net.mybluemix.rest;

import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;  
import javax.ws.rs.POST;
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import net.mybluemix.dao.FornecedorDAO;
import net.mybluemix.dao.LoteDAO;
import net.mybluemix.dao.MateriaPrimaDAO;
import net.mybluemix.dao.ProdutoDAO;
import net.mybluemix.dao.ReceitaDAO;
import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.ItemReceita;
import net.mybluemix.entity.Lote;
import net.mybluemix.entity.MateriaPrima;
import net.mybluemix.entity.Receita;
import net.mybluemix.entity.Produto;
import net.mybluemix.transferobject.ProdutoTO;



@Path("produto")
@Produces(MediaType.APPLICATION_JSON)

public class ProdutoWS {

    @GET
    public List<Produto> ProdutoList(){
    	ProdutoDAO mpd = new ProdutoDAO();
    	List<Produto> mpl = mpd.findAll();
    	return  mpl;
    }
    
    @GET
    @Path("{sku}")
    public Produto  Produto(@PathParam("sku") Long sku){
    	ProdutoDAO mpd = new ProdutoDAO();
    	return mpd.find(sku);
    }

    

    @POST
	@Path("/create")
	@Consumes("application/json")
    public void create(String json) throws Exception{
    	Gson gson = new Gson();
		ProdutoTO mp =  gson.fromJson(json, ProdutoTO.class);
    	ProdutoDAO mpd = new ProdutoDAO();
    	mpd.create(mp);
    }
    
    @POST
	@Path("/update")
	@Consumes("application/json")
    public void update(String json) throws Exception{
    	Gson gson = new Gson();
		Produto f=  gson.fromJson(json, Produto.class);	
    	ProdutoDAO fd = new ProdutoDAO();
    	fd.update(f, f.getSku());
    }
    

   



}
