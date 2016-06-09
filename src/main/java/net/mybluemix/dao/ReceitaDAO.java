package net.mybluemix.dao;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityTransaction;

import net.mybluemix.entity.ItemReceita;
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

	public void create(ReceitaTO rt) throws Exception{
		try
		{
		List<ItemReceita> receita = new LinkedList<ItemReceita>();
		MateriaPrimaDAO mp = new MateriaPrimaDAO();
		ItemReceitaDAO ird = new ItemReceitaDAO();
		
		
		if(rt.receita != null)
			for(ItemReceita item: rt.receita) {
				//MateriaPrima m = mp.find(item.materiaPrima.getSku());
				MateriaPrima m = item.materiaPrima;
				ItemReceita itemr = new ItemReceita(item.quantidade, item.unidade, m);
				//ird.create(itemr);
				receita.add(itemr);
				// salva Item no BD
			}
		
		Receita r = new Receita(rt.nome, rt.tipo, rt.descricao, receita);
		new ReceitaDAO().create(r);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw(e);
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
