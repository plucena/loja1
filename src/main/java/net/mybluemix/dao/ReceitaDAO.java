package net.mybluemix.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import net.mybluemix.entity.Lote;
import net.mybluemix.entity.MateriaPrima;
import net.mybluemix.entity.Receita;
import net.mybluemix.transferobject.ReceitaTO;
import net.mybluemix.transferobject.ItemReceitaTO;


public class ReceitaDAO extends BaseDAO<Receita> {
	
	public ReceitaDAO(Class<Receita> classType) {
		super(classType);
		// TODO Auto-generated constructor stub
	}

	public ReceitaDAO() {
		super(Receita.class);
	}

	public void create(ReceitaTO rt){
		System.out.println(rt.nome);
		System.out.println(rt.descricao);
		System.out.println(rt.tipo);
		if(rt.receita != null)
			for(ItemReceitaTO item: rt.receita) {
				System.out.println(item.materiaPrima);
				System.out.println(item.quantidade);
				System.out.println(item.unidade);
			}				
	}
	
	public Receita find(Long  sku) {
		javax.persistence.TypedQuery<Receita> query = manager.createQuery(
		        "SELECT c FROM Receita c WHERE c.sku = :sku", Receita.class);
		    return query.setParameter("sku", sku).getSingleResult();
	}

	public List<Receita> findAll(){
		return this.createQuery("Select a From Receita a", Receita.class);  
	}
	
	public void update(Receita f, Long key) throws Exception {
    	EntityTransaction tx = manager.getTransaction();
    	tx.begin();
    	Receita m = manager.find(Receita.class, key);
    	m.update(f);
    	tx.commit();
    }
}
