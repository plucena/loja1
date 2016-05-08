package net.mybluemix.dao;

import net.mybluemix.entity.MateriaPrima;

public class MateriaPrimaDAO extends BaseDAO<MateriaPrima> {

	public MateriaPrimaDAO() {
		super(MateriaPrima.class);
		// TODO Auto-generated constructor stub
	}

	public MateriaPrima find(int  sku) {
		javax.persistence.TypedQuery<MateriaPrima> query = manager.createQuery(
		        "SELECT c FROM MateriaPrima c WHERE c.sku = :sku", MateriaPrima.class);
		    return query.setParameter("sku", sku).getSingleResult();
	}
	
}
