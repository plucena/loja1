package net.mybluemix.parteg.produto;


public class Produto extends java.lang.Object implements java.lang.Cloneable{

	public State state;
	public Integer receita;
	public Integer preco;
	public Boolean next;
	
	public AdapterInterface adapter;
	public AdapterInterfaceDados dados;
	
	public String receitaOk;
	public String precoOk;
	
	
	
	public Produto()
	{
	state = State.emProducao;
	receita=0;
	preco=0;
	next=false;
	adapter = new ProdutoPageAdapter();
	dados = new Dados();
	}
	
	public Produto clone()
	{
		try {
			return (Produto)super.clone();
		}
		catch(Exception e)
		{
			e.printStackTrace(java.lang.System.err);
		}
		return null;
	}
	
	public void handleEvent(Object... in_colObject)
	{
	
		
		if(in_colObject.length > 0)
		{
			String sEventName = (String)in_colObject[0];
	
						
			if((state == State.emProducao) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				preco        = ((Integer)in_colObject[1]).intValue();
				receita        = ((Integer)in_colObject[2]).intValue();
				
				receitaOk = dados.dado_receita(receita);
				precoOk = dados.dado_preco(preco);
				
				if(cadastrar(receitaOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.emProducao;
			}
			
			if((state == State.emEstoque) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				preco        = ((Integer)in_colObject[1]).intValue();
				receita        = ((Integer)in_colObject[2]).intValue();
				
				receitaOk = dados.dado_receita(receita);
				precoOk = dados.dado_preco(preco);
				
				if(cadastrar(receitaOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.emEstoque;
			}
						

			if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroEvent") == 0))
			{
				if(fazerCadastro() && preco>0 && receita>0)
					 state = State.emProducao;
				else
					 state = State.cadastrando;
			}
			
			
			
			if((state == State.emProducao) && (sEventName.compareTo("alterarEmProducaoEvent") == 0))
			{
				next  = ((Boolean)in_colObject[1]).booleanValue();
				
				if(alterarEmProducao(next))
					 state = State.alterando;
				else
					 state = State.emProducao;
			}
			
			
			if((state == State.emEstoque) && (sEventName.compareTo("alterarEmEstoqueEvent") == 0))
			{
				next=true;
				
				if(alterarEmEstoque(next))
					 state = State.alterando;
				else
					 state = State.emEstoque;
			}
			
			
			if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesEvent") == 0))
			{
				if(fazerAlteracoes() && next == false)
					 state = State.emProducao;
				else if(fazerAlteracoes() && next == true)
					 state = State.emEstoque;
				else
					 state = State.alterando;
			}
			
			if((state == State.emProducao) && (sEventName.compareTo("mostrarEmEstoqueEvent") == 0))
			{
				if(mostrarEmEstoque())
					 state = State.emEstoque;
				else
					 state = State.emProducao;
			}
			
			if((state == State.emEstoque) && (sEventName.compareTo("mostrarEmProducaoEvent") == 0))
			{
				if(mostrarEmProducao())
					 state = State.emProducao;
				else
					 state = State.emEstoque;
			}
			
			
			
			
			
		}
	}
	
	public Boolean cadastrar(String receita, String preco)
	{
	// return true;
	return adapter.cadastrarEvent(receita, preco);
	}
	
	public Boolean fazerCadastro()
	{
	//return true;
	return adapter.fazerCadastroEvent();
	}
	
	public Boolean alterarEmProducao(Boolean next)
	{
	//return true;
	return adapter.alterarEmProducaoEvent(next);	
	}
	
	public Boolean alterarEmEstoque(Boolean next)
	{
	//return true;
	return adapter.alterarEmEstoqueEvent(next);	
	}
	
	public Boolean fazerAlteracoes()
	{
	//return true;
	return adapter.fazerAlteracoesEvent();
	}
	
	public Boolean mostrarEmProducao()
	{
	//return true;
	return adapter.mostrarEmProducaoEvent();
	}
	
	public Boolean mostrarEmEstoque()
	{
	//return true;
	return adapter.mostrarEmEstoqueEvent();
	}
	
	
	
	
	
	
	
	
}
