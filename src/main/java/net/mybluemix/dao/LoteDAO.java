package net.mybluemix.dao;

import java.util.List;

import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.Lote;

public class LoteDAO extends BaseDAO<Lote> {

	public LoteDAO(Class<Lote> classType) {
		super(classType);
		// TODO Auto-generated constructor stub
	}


	public LoteDAO() {
		// TODO Auto-generated constructor stub
		super(Lote.class);

	}
	
	public List<Lote> findAll(){
		return this.createQuery("Select a From Lote a", Lote.class);  
	}
}
