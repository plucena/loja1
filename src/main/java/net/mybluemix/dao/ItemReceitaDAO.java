package net.mybluemix.dao;

import javax.persistence.TypedQuery;

import net.mybluemix.entity.*;

public class ItemReceitaDAO extends BaseDAO<ItemReceita> {

	public ItemReceitaDAO (Class<ItemReceita> classType) {
		super(classType);
		// TODO Auto-generated constructor stub
	}
	
	
	public ItemReceitaDAO() {
		// TODO Auto-generated constructor stub
		super(ItemReceita.class);

	}
	
	
	public ItemReceita find(Long id) {
		TypedQuery<ItemReceita> query = manager.createQuery(
		        "SELECT c FROM 	ItemReceita c WHERE c.id = :id", ItemReceita.class);
		    return query.setParameter("id", id).getSingleResult();
	}
	
	
}
