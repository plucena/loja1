package net.mybluemix.dao;

import java.util.List;

import javax.ws.rs.GET;

import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.MateriaPrima;

public class FornecedorDAO extends BaseDAO{

	public FornecedorDAO() {
		super(Fornecedor.class);
		// TODO Auto-generated constructor stub
	}
	
	public List<Fornecedor> findAll(){
		return this.createQuery("Select a From Fornecedor a", Fornecedor.class);  
	}

}
