package net.mybluemix.dao;

import java.util.List;

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
	
	
	public void create(LoteTO loteto) throws Exception{
		Fornecedor f = new FornecedorDAO().find(loteto.cnpj);
		MateriaPrima m = new MateriaPrimaDAO().find(loteto.materiaprima_sku);
		//public Lote(Long sku, float preco, Fornecedor fornecedor,
		//		MateriaPrima materiaPrima, String status, float quantidade, String unidade) {
		
		Lote lote = new Lote(loteto.sku, loteto.preco, f, m, loteto.status, loteto.quantidade, loteto.unidade);
		super.create(lote);
	}

}
