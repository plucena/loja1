package estoquistaPk;

import net.mybluemix.seleniumTest.FornecedorPageAdapter;

public class Estoquista  extends java.lang.Object implements java.lang.Cloneable  {

	
	public State state;
	public Boolean status;
	public Boolean ativo;
	public Integer cnpj;
	public Integer nome;
	public Integer email;
	public Integer telefone;
	public Integer prazoEntregaDias;
	public Integer endereco_Pais;
	public Integer endereco_Estado;
	public Integer endereco_Cidade;
	public Integer endereco_Logradouro;
	public Integer endereco_CEP;
	
	public AdapterInterface adapter;
	
	
	public Estoquista()
	{
		state = State.mostrandoAtivos;
		adapter = new FornecedorPageAdapter();
		
	}
	
	public Estoquista clone()
	{
		try {
			return (Estoquista)super.clone();
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
			
			if((state == State.mostrandoAtivos) && (sEventName.compareTo("cadastrarEvent") == 0))
			{		
				ativo      			= ((Boolean)in_colObject[1]).booleanValue();
				cnpj      			= ((Integer)in_colObject[2]).intValue();
				nome     			= ((Integer)in_colObject[3]).intValue();
				email     			= ((Integer)in_colObject[4]).intValue();
				telefone  			= ((Integer)in_colObject[5]).intValue();
				prazoEntregaDias    = ((Integer)in_colObject[6]).intValue();
				endereco_Pais       = ((Integer)in_colObject[7]).intValue();
				endereco_Estado     = ((Integer)in_colObject[8]).intValue();
				endereco_Cidade     = ((Integer)in_colObject[9]).intValue();
				endereco_Logradouro = ((Integer)in_colObject[10]).intValue();
				endereco_CEP        = ((Integer)in_colObject[11]).intValue();
			
			
			 if (cadastrar(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP))    
			    	 state = State.cadastrando;
			   else 			    	
					 state = State.mostrandoAtivos; 
				
			}
			
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("cadastrarEvent") == 0))
			{
				ativo      			= ((Boolean)in_colObject[1]).booleanValue();
				cnpj      			= ((Integer)in_colObject[2]).intValue();
				nome     			= ((Integer)in_colObject[3]).intValue();
				email     			= ((Integer)in_colObject[4]).intValue();
				telefone  			= ((Integer)in_colObject[5]).intValue();
				prazoEntregaDias    = ((Integer)in_colObject[6]).intValue();
				endereco_Pais       = ((Integer)in_colObject[7]).intValue();
				endereco_Estado     = ((Integer)in_colObject[8]).intValue();
				endereco_Cidade     = ((Integer)in_colObject[9]).intValue();
				endereco_Logradouro = ((Integer)in_colObject[10]).intValue();
				endereco_CEP        = ((Integer)in_colObject[11]).intValue();
				
				if (cadastrar(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP))		
					state = State.cadastrando;
				else     				
					state = State.mostrandoInativos;
				   
			}
			
						
			else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroAtivosEvent") == 0))
			{		
				if (fazerCadastroAtivos()) 		 
					state = State.mostrandoAtivos;
				else					        
					state = State.cadastrando;
				
			}
			
		
		else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroInativosEvent") == 0))
		{		
			  if (fazerCadastroInativos())  	 
				  state = State.mostrandoInativos;
			  else                				 
				  state = State.cadastrando;
			
		}
		
							
			
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("alterarEvent") == 0))
			{		
				
				ativo      			= ((Boolean)in_colObject[1]).booleanValue();
				cnpj      			= ((Integer)in_colObject[2]).intValue();
				nome     			= ((Integer)in_colObject[3]).intValue();
				email     			= ((Integer)in_colObject[4]).intValue();
				telefone  			= ((Integer)in_colObject[5]).intValue();
				prazoEntregaDias    = ((Integer)in_colObject[6]).intValue();
				endereco_Pais       = ((Integer)in_colObject[7]).intValue();
				endereco_Estado     = ((Integer)in_colObject[8]).intValue();
				endereco_Cidade     = ((Integer)in_colObject[9]).intValue();
				endereco_Logradouro = ((Integer)in_colObject[10]).intValue();
				endereco_CEP        = ((Integer)in_colObject[11]).intValue();
				
				
				if (alterar(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP)) 
					state = State.alterando;
				else 
					state = State.mostrandoAtivos;
				
			}
			
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("alterarEvent") == 0))
			{		
				
				ativo      			= ((Boolean)in_colObject[1]).booleanValue();
				cnpj      			= ((Integer)in_colObject[2]).intValue();
				nome     			= ((Integer)in_colObject[3]).intValue();
				email     			= ((Integer)in_colObject[4]).intValue();
				telefone  			= ((Integer)in_colObject[5]).intValue();
				prazoEntregaDias    = ((Integer)in_colObject[6]).intValue();
				endereco_Pais       = ((Integer)in_colObject[7]).intValue();
				endereco_Estado     = ((Integer)in_colObject[8]).intValue();
				endereco_Cidade     = ((Integer)in_colObject[9]).intValue();
				endereco_Logradouro = ((Integer)in_colObject[10]).intValue();
				endereco_CEP        = ((Integer)in_colObject[11]).intValue();
				
				if (alterar(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP)) 
					state = State.alterando;
				 else 
					state = State.mostrandoInativos;
				
			}
			
			
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesAtivosEvent") == 0))
			{		
				if (fazerAlteracoesAtivos()) 
					state = State.mostrandoAtivos;
				 else 
					state = State.alterando;
				
			}
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesInativosEvent") == 0))
			{		
				if (fazerAlteracoesInativos()) 
					state = State.mostrandoInativos;
				 else 
					state = State.alterando;
				
			}
			
					
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("mostrarInativosEvent") == 0))
			{		
				if (mostrarInativos()) {
					state = State.mostrandoInativos;
					status=false;
				} else {
					state = State.mostrandoAtivos;
				}
			}
			
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("mostrarAtivosEvent") == 0))
			{		
				if (mostrarAtivos()) {
					state = State.mostrandoAtivos;
					status=true;
				} else {
					state = State.mostrandoInativos;
				}
			}
			
	  }
	}
	
	public  Boolean cadastrar(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,  Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade, Integer endereco_Logradouro, Integer endereco_CEP)
	{
		//return true;
		return adapter.cadastrarEvent(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP);
		
	}
	
	public Boolean fazerCadastroAtivos()
	{
	    //if(status == true)
	    if(status == true && adapter.fazerCadastroAtivosEvent() == true)
		return true;
		else
		return false;	
		
	}
	
	public Boolean fazerCadastroInativos()
	{
		
		//if(status == false)
	    if(status == false && adapter.fazerCadastroInativosEvent() == true)
		return true;
		else
		return false;	
		
	}
	
	
	public  Boolean alterar(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,  Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade, Integer endereco_Logradouro, Integer endereco_CEP)
	{
		//return true;
		return adapter.alterarEvent(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP);
	}
	
	
	public Boolean fazerAlteracoesAtivos()
	{
		    //if(status == true)
		    if(status == true && adapter.fazerAlteracoesAtivosEvent() == true)
			return true;
			else
			return false;	
	}
	
	public Boolean fazerAlteracoesInativos()
	{
		    //if(status == false)
		    if(status == false && adapter.fazerCadastroInativosEvent() == true)
			return true;
			else
			return false;	
	}
	
	
	public Boolean mostrarAtivos()
	{
		//return true;
		return adapter.mostrarAtivosEvent();
	}
	
	public Boolean mostrarInativos()
	{
		//return true;
		return adapter.mostrarInativosEvent();
	}
	
	
	
	
	
}
