package net.mybluemix.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import net.mybluemix.entity.Lote;
import net.mybluemix.entity.MateriaPrima;
import net.mybluemix.entity.Produto;
import net.mybluemix.entity.Receita;

public class ProdutoDAO extends BaseDAO<Produto> {
	
	public ProdutoDAO(Class<Produto> classType) {
		super(classType);
		// TODO Auto-generated constructor stub
	}

	public ProdutoDAO() {
		super(Produto.class);
	}

	public Produto find(Long  sku) {
		javax.persistence.TypedQuery<Produto> query = manager.createQuery(
		        "SELECT c FROM Produto c WHERE c.sku = :sku", Produto.class);
		    return query.setParameter("sku", sku).getSingleResult();
	}

	public List<Produto> findAll(){
		return this.createQuery("Select a From Produto a", Produto.class);  
	}
	
	public void update(Produto f, Long key) throws Exception {
    	EntityTransaction tx = manager.getTransaction();
    	tx.begin();
    	Produto m = manager.find(Produto.class, key);
    	m.update(f);
    	tx.commit();
    }
}
