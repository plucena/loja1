package net.mybluemix.transferobject;

import java.util.LinkedList;
import java.util.List;

import net.mybluemix.entity.Lote;
import net.mybluemix.entity.Receita;

public class ProdutoTO {
	
	   public long sku;
	   public List<Lote> lotes = new LinkedList<Lote>();
	   public Receita receita;
	   public String status;
	   public float preco;
}
