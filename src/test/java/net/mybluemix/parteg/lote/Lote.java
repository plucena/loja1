package net.mybluemix.parteg.lote;


public class Lote extends java.lang.Object implements java.lang.Cloneable {
	
	public State state;
	public Integer status;
	public Boolean next; 
	public Boolean cancel;
	
	public Integer fornecedor;
	public Integer materiaPrima;
	public Integer quantidade;
	public Integer unidade;
	public Integer preco;
	
	
	public AdapterInterfaceDados dados;
	public AdapterInterface adapter;
	
	public Integer fornecedorOk;
	public Integer materiaPrimaOk;
	public Integer quantidadeOk;
	public Integer unidadeOk;
	public Integer precoOk;
	
	public Lote()
	{
	state = State.encomendados;
	adapter = new LotePageAdapter();
	dados = new Dados();
	status = 1;
	}
	
	public Lote clone()
	{
		try {
			return (Lote)super.clone();
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
	        
			
			if((state == State.encomendados) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				
				fornecedor   = ((Integer)in_colObject[1]).intValue();
				materiaPrima = ((Integer)in_colObject[2]).intValue();
				quantidade   = ((Integer)in_colObject[3]).intValue();
				unidade 	 = ((Integer)in_colObject[4]).intValue();
				preco		 = ((Integer)in_colObject[5]).intValue();
				
				fornecedorOk	= dados.dado_fornecedor(fornecedor);
				materiaPrimaOk  = dados.dado_materiaPrima(materiaPrima);
				quantidadeOk 	= dados.dado_quantidade(quantidade);
				unidadeOk 		= dados.dado_unidade(unidade);
				precoOk 		= dados.dado_preco(preco);
				
				if(cadastrar(fornecedorOk, materiaPrimaOk, quantidadeOk, unidadeOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.encomendados;
			}
			
			
			if((state == State.emEstoque) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				
				fornecedor   = ((Integer)in_colObject[1]).intValue();
				materiaPrima = ((Integer)in_colObject[2]).intValue();
				quantidade   = ((Integer)in_colObject[3]).intValue();
				unidade 	 = ((Integer)in_colObject[4]).intValue();
				preco		 = ((Integer)in_colObject[5]).intValue();
				
				fornecedorOk	= dados.dado_fornecedor(fornecedor);
				materiaPrimaOk  = dados.dado_materiaPrima(materiaPrima);
				quantidadeOk 	= dados.dado_quantidade(quantidade);
				unidadeOk 		= dados.dado_fornecedor(unidade);
				precoOk 		= dados.dado_fornecedor(preco);
				
				
				if(cadastrar(fornecedorOk, materiaPrimaOk, quantidadeOk, unidadeOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.emEstoque;
			}
			
			if((state == State.emProducao) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				
				fornecedor   = ((Integer)in_colObject[1]).intValue();
				materiaPrima = ((Integer)in_colObject[2]).intValue();
				quantidade   = ((Integer)in_colObject[3]).intValue();
				unidade 	 = ((Integer)in_colObject[4]).intValue();
				preco		 = ((Integer)in_colObject[5]).intValue();
				
				fornecedorOk	= dados.dado_fornecedor(fornecedor);
				materiaPrimaOk  = dados.dado_materiaPrima(materiaPrima);
				quantidadeOk 	= dados.dado_quantidade(quantidade);
				unidadeOk 		= dados.dado_fornecedor(unidade);
				precoOk 		= dados.dado_fornecedor(preco);
				
				
				if(cadastrar(fornecedorOk, materiaPrimaOk, quantidadeOk, unidadeOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.emProducao;
			}
			
			if((state == State.finalizados) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				
				fornecedor   = ((Integer)in_colObject[1]).intValue();
				materiaPrima = ((Integer)in_colObject[2]).intValue();
				quantidade   = ((Integer)in_colObject[3]).intValue();
				unidade 	 = ((Integer)in_colObject[4]).intValue();
				preco		 = ((Integer)in_colObject[5]).intValue();
				
				fornecedorOk	= dados.dado_fornecedor(fornecedor);
				materiaPrimaOk  = dados.dado_materiaPrima(materiaPrima);
				quantidadeOk 	= dados.dado_quantidade(quantidade);
				unidadeOk 		= dados.dado_fornecedor(unidade);
				precoOk 		= dados.dado_fornecedor(preco);
				
				
				if(cadastrar(fornecedorOk, materiaPrimaOk, quantidadeOk, unidadeOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.finalizados;
			}
			
			
			if((state == State.cancelados) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				
				fornecedor   = ((Integer)in_colObject[1]).intValue();
				materiaPrima = ((Integer)in_colObject[2]).intValue();
				quantidade   = ((Integer)in_colObject[3]).intValue();
				unidade 	 = ((Integer)in_colObject[4]).intValue();
				preco		 = ((Integer)in_colObject[5]).intValue();
				
				
				fornecedorOk	= dados.dado_fornecedor(fornecedor);
				materiaPrimaOk  = dados.dado_materiaPrima(materiaPrima);
				quantidadeOk 	= dados.dado_quantidade(quantidade);
				unidadeOk 		= dados.dado_fornecedor(unidade);
				precoOk 		= dados.dado_fornecedor(preco);
				
				
				if(cadastrar(fornecedorOk, materiaPrimaOk, quantidadeOk, unidadeOk, precoOk))
					 state = State.cadastrando;
				else
					 state = State.cancelados;
			}
			
			
			
			if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroEvent") == 0))
			{
				if(fazerCadastro() && fornecedor>0 && materiaPrima>0 && quantidade>0  && unidade>0 && preco>0)
					 state = State.encomendados;
				else
					 state = State.cadastrando;
			}
			
			if((state == State.encomendados) && (sEventName.compareTo("alterarEncomendadosEvent") == 0))
			{
				next = ((Boolean)in_colObject[1]).booleanValue();
				cancel = ((Boolean)in_colObject[2]).booleanValue();
				
				if(alterarEncomendados(next, cancel)){
					 state = State.alterando;
					 status = 1;
				}else{
					 state = State.encomendados;
			
				}
			}
		
			
			if((state == State.emEstoque) && (sEventName.compareTo("alterarEmEstoqueEvent") == 0))
			{
				next = ((Boolean)in_colObject[1]).booleanValue();
				
				if(alterarEmEstoque(next)){					
					 state = State.alterando;
				     status = 2;
	    		}else{
					 state = State.emEstoque;
				}	 
			}
			
			if((state == State.emProducao) && (sEventName.compareTo("alterarEmProducaoEvent") == 0))
			{
				next = ((Boolean)in_colObject[1]).booleanValue();
				
				if(alterarEmProducao(next)){					
					 state = State.alterando;
				     status = 3;
	    		}else{
					 state = State.emProducao;
				}	 
			}
			
			
			if((state == State.finalizados) && (sEventName.compareTo("alterarFinalizadosEvent") == 0))
			{
				if(alterarFinalizados()){					
					 state = State.alterando;
				     status = 4;
	    		}else{
					 state = State.finalizados;
				}	 
			}
			
			if((state == State.cancelados) && (sEventName.compareTo("alterarCanceladosEvent") == 0))
			{
				if(alterarCancelados()){					
					 state = State.alterando;
				     status = 5;
	    		}else{
					 state = State.cancelados;
				}	 
			}
			
			if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesEvent") == 0))
			{
				if(fazerAlteracoes() && status == 1 && next == false && cancel == false)
						 state = State.encomendados;
				else if (fazerAlteracoes() && status == 1 && next == true && cancel == false)
					     state = State.emEstoque;
				else if (fazerAlteracoes() && status == 2 && next == false)
						 state = State.emEstoque;
				else if (fazerAlteracoes() && status == 2 && next == true)
						 state = State.emProducao;
				else if (fazerAlteracoes() && status == 3 && next == false)
						 state = State.emProducao;
				else if (fazerAlteracoes() && status == 3 && next == true)
						 state = State.finalizados;
				else if (fazerAlteracoes() && status == 4)
						 state = State.finalizados;
				else if (fazerAlteracoes() && (status == 5 || cancel == true) )
						 state = State.cancelados;
				else
						state = State.alterando;
			}
			
			if((state == State.encomendados) && (sEventName.compareTo("mostrarEmEstoqueEvent") == 0))
			{
				if(mostrarEmEstoque())
					 state = State.emEstoque;
				else
					 state = State.encomendados;
			}
			
			if((state == State.emEstoque) && (sEventName.compareTo("mostrarEncomendadosEvent") == 0))
			{
				if(mostrarEncomendados())
					 state = State.encomendados;
				else
					 state = State.emEstoque;
			}
			
			if((state == State.emEstoque) && (sEventName.compareTo("mostrarEmProducaoEvent") == 0))
			{
				if(mostrarEmProducao())
					 state = State.emProducao;
				else
					 state = State.emEstoque;
			}
			
			if((state == State.emProducao) && (sEventName.compareTo("mostrarEmEstoqueEvent") == 0))
			{
				if(mostrarEmEstoque())
					 state = State.emEstoque;
				else
					 state = State.emProducao;
			}
			
			if((state == State.emProducao) && (sEventName.compareTo("mostrarFinalizadosEvent") == 0))
			{
				if(mostrarFinalizados())
					 state = State.finalizados;
				else
					 state = State.emProducao;
			}
			
			
			if((state == State.finalizados) && (sEventName.compareTo("mostrarEmProducaoEvent") == 0))
			{
				if(mostrarEmProducao())
					 state = State.emProducao;
				else
					 state = State.finalizados;
			}
			
			if((state == State.finalizados) && (sEventName.compareTo("mostrarCanceladosEvent") == 0))
			{
				if(mostrarCancelados())
					 state = State.cancelados;
				else
					 state = State.emProducao;
			}
	         
			if((state == State.cancelados) && (sEventName.compareTo("mostrarFinalizadosEvent") == 0))
			{
				if(mostrarFinalizados())
					 state = State.finalizados;
				else
					 state = State.cancelados;
			}
			
	
		}
	}
	
	public Boolean cadastrar(Integer fornecedores, Integer materiaPrima, Integer quantidade, Integer  unidade, Integer preco)
	{
	  //return true;
		return adapter.cadastrarEvent(fornecedores, materiaPrima, quantidade, unidade, preco);
	}
	
	public Boolean fazerCadastro()
	{
	  //return true;
		return adapter.fazerAlteracoesEvent();
	}
	
	
	public Boolean alterarEncomendados(Boolean next, Boolean cancel)
	{
	   //return true;
	   return adapter.alterarEncomendadosEvent(next, cancel);
	}
	
	public Boolean alterarEmEstoque(Boolean next)
	{
	   //return true;
	   return adapter.alterarEmEstoqueEvent(next);
	}
	
	public Boolean alterarEmProducao(Boolean next)
	{
	  //return true;
	  return adapter.alterarEmProducaoEvent(next);
	}
	
	public Boolean alterarFinalizados()
	{
	  //return true;
	  return adapter.alterarFinalizadosEvent();
	}
	
	public Boolean alterarCancelados()
	{
	  //return true;
	  return adapter.alterarCanceladosEvent();
	}
	
	public Boolean fazerAlteracoes()
	{
	  //return true;
	  return adapter.fazerAlteracoesEvent();
	}
	
	public Boolean mostrarEncomendados()
	{
	  //return true;
     return adapter.mostrarEncomendadosEvent();	
	}
	
	
	public Boolean mostrarEmEstoque()
	{
	  //return true;
      return adapter.mostrarEmEstoqueEvent();		
	}
	
	
	public Boolean mostrarEmProducao()
	{
	  //return true;
	 return adapter.mostrarEmProducaoEvent();	
	}
	
	
	public Boolean mostrarCancelados()
	{
	  //return true;
		return adapter.mostrarCanceladosEvent();
	}
	
	
	public Boolean mostrarFinalizados()
	{
	  //return true;
		return adapter.mostrarFinalizadosEvent();
	}
	
	
	
	
	
	
}
