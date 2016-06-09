package net.mybluemix.transferobject;

import java.util.LinkedList;
import java.util.List;

import net.mybluemix.entity.ItemReceita;

public class ReceitaTO {
	
	public String nome;
	public String tipo;
	public String descricao;
	public List<ItemReceita> receita = new LinkedList<ItemReceita>();
	
}
