package net.mybluemix.dao;

import java.util.List;

import javax.persistence.EntityTransaction;

import net.mybluemix.entity.Fornecedor;
import net.mybluemix.entity.Lote;
import net.mybluemix.entity.MateriaPrima;
import net.mybluemix.transferobject.LoteTO;

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
	
	public Lote find(Long  sku) {
		javax.persistence.TypedQuery<Lote> query = manager.createQuery(
		        "SELECT c FROM Lote c WHERE c.sku = :sku", Lote.class);
		    return query.setParameter("sku", sku).getSingleResult();
	}
	
	public Lote find(Long  sku, float quantidade) {
		try {
		String squery = "SELECT c FROM Lote c WHERE c.materiaPrima.sku =" + sku + " AND c.status = 'EM_ESTOQUE' AND c.quantidade >= " + quantidade; 
		System.out.println("**************************");
		System.out.println(squery);
		System.out.println("**************************");

		javax.persistence.TypedQuery<Lote> query = manager.createQuery(squery, Lote.class);
		return query.getSingleResult();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void create(LoteTO loteto) throws Exception{
		Fornecedor f = new FornecedorDAO().find(loteto.cnpj);
		MateriaPrima m = new MateriaPrimaDAO().find(loteto.materiaprima_sku);	
		Lote lote = new Lote(loteto.sku, loteto.preco, f, m, loteto.status, loteto.quantidade, loteto.unidade);
		super.create(lote);
	}

	
	public void update(LoteTO loteto) throws Exception{
		Fornecedor f = new FornecedorDAO().find(loteto.cnpj);
		MateriaPrima m = new MateriaPrimaDAO().find(loteto.materiaprima_sku);	
		EntityTransaction tx = manager.getTransaction();
    	tx.begin();
		Lote lote =  manager.find(Lote.class, loteto.sku);
		lote.setPreco(loteto.preco);
		lote.setStatus(loteto.status);
		if(f!=null) lote.setFornecedor(f);
		if(m!=null) lote.setMateriaPrima(m);
		lote.setQuantidade(loteto.quantidade);
		lote.setUnidade(loteto.unidade);
    	tx.commit();
	}
}
