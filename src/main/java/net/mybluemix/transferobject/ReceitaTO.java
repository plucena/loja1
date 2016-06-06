package net.mybluemix.transferobject;

import java.util.LinkedList;
import java.util.List;

public class ReceitaTO {
	
	public String nome;
	public String tipo;
	public String descricao;
	public List<ItemReceitaTO> receita = new LinkedList<ItemReceitaTO>();
	
}
