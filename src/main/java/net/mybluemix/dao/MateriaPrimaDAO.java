package net.mybluemix.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.MateriaPrima;

public class MateriaPrimaDAO extends BaseDAO<MateriaPrima> {

	public MateriaPrimaDAO() {
		super(MateriaPrima.class);
		// TODO Auto-generated constructor stub
	}

	public MateriaPrima find(int  sku) {
		javax.persistence.TypedQuery<MateriaPrima> query = manager.createQuery(
		        "SELECT c FROM MateriaPrima c WHERE c.sku = :sku", MateriaPrima.class);
		    return query.setParameter("sku", new Long(sku)).getSingleResult();
	}

	public List<MateriaPrima> findAll(){
		return this.createQuery("Select a From MateriaPrima a", MateriaPrima.class);  
	}
	
	public void update(MateriaPrima f, Long key) throws Exception {
    	EntityTransaction tx = manager.getTransaction();
    	tx.begin();
    	MateriaPrima m = manager.find(MateriaPrima.class, key);
    	m.update(f);
    	tx.commit();
    }
}
