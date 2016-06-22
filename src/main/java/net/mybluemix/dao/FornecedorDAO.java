package net.mybluemix.dao;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
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

	public Fornecedor find(String cnpj) {
		TypedQuery<Fornecedor> query = manager.createQuery(
		        "SELECT c FROM Fornecedor c WHERE c.cnpj = :cnpj", Fornecedor.class);
		    return query.setParameter("cnpj", cnpj).getSingleResult();
	}
	
	
	public void update(Fornecedor f, String key) throws Exception {
    	EntityTransaction tx = manager.getTransaction();
    	tx.begin();
    	Fornecedor fbd = manager.find(Fornecedor.class, key);
    	fbd.update(f);
    	tx.commit();
    }
}
