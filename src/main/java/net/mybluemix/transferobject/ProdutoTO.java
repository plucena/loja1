package net.mybluemix.transferobject;

import java.util.LinkedList;
import java.util.List;

public class ProdutoTO {
	
	   public long sku;
	   public List<Long> lotes = new LinkedList<Long>();
	   public long receita;
	   public String status;
	   public float preco;
}
