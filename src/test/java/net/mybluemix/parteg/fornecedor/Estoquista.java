package net.mybluemix.parteg.fornecedor;


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
	public AdapterInterfaceDados dados;

	
	public String cnpjOk;
	public String nomeOk;
	public String emailOk;
	public String telefoneOk;
	public Integer prazoEntregaDiasOk;
	public String endereco_PaisOk;
	public Integer endereco_EstadoOk;
	public String endereco_CidadeOk;
	public String endereco_LogradouroOk;
	public String endereco_CEPOk;
	
	
	
	
	
	public Estoquista()
	{
		state = State.mostrandoAtivos;
		adapter = new FornecedorPageAdapter();
		dados = new Dados();
		
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
				endereco_Estado     = (Integer) in_colObject[8];
				endereco_Cidade     = ((Integer)in_colObject[9]).intValue();
				endereco_Logradouro = ((Integer)in_colObject[10]).intValue();
				endereco_CEP        = ((Integer)in_colObject[11]).intValue();
			
				
				cnpjOk = dados.dado_cnpj(cnpj);
				nomeOk = dados.dado_nome(nome);
				emailOk = dados.dado_email(email);
				telefoneOk = dados.dado_telefone(telefone);
				prazoEntregaDiasOk = dados.dado_prazoEntregaDias(prazoEntregaDias);
				endereco_PaisOk = dados.dado_pais(endereco_Pais);
				endereco_EstadoOk = dados.dado_estado(endereco_Estado);
				endereco_CidadeOk = dados.dado_cidade(endereco_Cidade);
				endereco_LogradouroOk = dados.dado_logradouro(endereco_Logradouro);
				endereco_CEPOk = dados.dado_CEP(endereco_CEP);
						
						
				//System.out.println(cnpj + "  " + cnpj_send);		
				//System.out.println(nome + "  " + nome_send);				    			    
			    //System.out.println(email + "  " + email_send);	
				//System.out.println(telefone + "  " + telefone_send);
				//System.out.println(prazoEntregaDias + "  " + prazoEntregaDias_send);
			    //System.out.println(endereco_Pais + "  " + pais_send);
			    //System.out.println(endereco_Estado + "  " + estado_send);
			    //System.out.println(endereco_Cidade + "  " + cidade_send);
			    //System.out.println(logradouro_send + "  " + logradouro_send);
			    //System.out.println(endereco_CEP + "  " + CEP_send);
			    
			    
			    
			    if (cadastrar(ativo, cnpjOk, nomeOk, emailOk, telefoneOk, prazoEntregaDiasOk, endereco_PaisOk, endereco_EstadoOk, endereco_CidadeOk, endereco_LogradouroOk, endereco_CEPOk))    
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
				
	
				cnpjOk = dados.dado_cnpj(cnpj);
				nomeOk = dados.dado_nome(nome);
				emailOk = dados.dado_email(email);
				telefoneOk = dados.dado_telefone(telefone);
				prazoEntregaDiasOk = dados.dado_prazoEntregaDias(prazoEntregaDias);
				endereco_PaisOk = dados.dado_pais(endereco_Pais);
				endereco_EstadoOk = dados.dado_estado(endereco_Estado);
				endereco_CidadeOk = dados.dado_cidade(endereco_Cidade);
				endereco_LogradouroOk = dados.dado_logradouro(endereco_Logradouro);
				endereco_CEPOk = dados.dado_CEP(endereco_CEP);
				
				
				if (cadastrar(ativo, cnpjOk, nomeOk, emailOk, telefoneOk, prazoEntregaDiasOk, endereco_PaisOk, endereco_EstadoOk, endereco_CidadeOk, endereco_LogradouroOk, endereco_CEPOk))		
					state = State.cadastrando;
				else     				
					state = State.mostrandoInativos;
				   
			}
			
						
			else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroAtivosEvent") == 0))
			{		
				if (fazerCadastroAtivos() && nome>0) 		 
					state = State.mostrandoAtivos;
				else					        
					state = State.cadastrando;
				
			}
			
		
		else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroInativosEvent") == 0))
		{		
			  if (fazerCadastroInativos()  && nome>0)  	 
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
				
				cnpjOk = dados.dado_cnpj(cnpj);
				nomeOk = dados.dado_nome(nome);
				emailOk = dados.dado_email(email);
				telefoneOk = dados.dado_telefone(telefone);
				prazoEntregaDiasOk = dados.dado_prazoEntregaDias(prazoEntregaDias);
				endereco_PaisOk = dados.dado_pais(endereco_Pais);
				endereco_EstadoOk = dados.dado_estado(endereco_Estado);
				endereco_CidadeOk = dados.dado_cidade(endereco_Cidade);
				endereco_LogradouroOk = dados.dado_logradouro(endereco_Logradouro);
				endereco_CEPOk = dados.dado_CEP(endereco_CEP);
				

			
				if (alterar(ativo, cnpjOk, nomeOk, emailOk, telefoneOk, prazoEntregaDiasOk, endereco_PaisOk, endereco_EstadoOk, endereco_CidadeOk, endereco_LogradouroOk, endereco_CEPOk))		
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
				
				cnpjOk = dados.dado_cnpj(cnpj);
				nomeOk = dados.dado_nome(nome);
				emailOk = dados.dado_email(email);
				telefoneOk = dados.dado_telefone(telefone);
				prazoEntregaDiasOk = dados.dado_prazoEntregaDias(prazoEntregaDias);
				endereco_PaisOk = dados.dado_pais(endereco_Pais);
				endereco_EstadoOk = dados.dado_estado(endereco_Estado);
				endereco_CidadeOk = dados.dado_cidade(endereco_Cidade);
				endereco_LogradouroOk = dados.dado_logradouro(endereco_Logradouro);
				endereco_CEPOk = dados.dado_CEP(endereco_CEP);
				

			
				
				if (alterar(ativo, cnpjOk, nomeOk, emailOk, telefoneOk, prazoEntregaDiasOk, endereco_PaisOk, endereco_EstadoOk, endereco_CidadeOk, endereco_LogradouroOk, endereco_CEPOk))		
					state = State.alterando;
				 else 
					state = State.mostrandoInativos;
			}
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesAtivosEvent") == 0))
			{		
				if (fazerAlteracoesAtivos() && nome>0) 
					state = State.mostrandoAtivos;
				 else 
					state = State.alterando;
			}
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAlteracoesInativosEvent") == 0))
			{		
				if (fazerAlteracoesInativos() && nome>0) 
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
	
	public  Boolean cadastrar(Boolean ativo, String cnpj, String nome, String email, String telefone,  Integer prazoEntregaDias, String endereco_Pais, Integer endereco_Estado, String endereco_Cidade, String endereco_Logradouro, String endereco_CEP)
	{
		//return true;
		return adapter.cadastrarEvent(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP);
		
	}
	
	public Boolean fazerCadastroAtivos()
	{
	   // if(status == true)
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
	
	
	public  Boolean alterar(Boolean ativo, String cnpj, String nome, String email, String telefone,  Integer prazoEntregaDias, String endereco_Pais, Integer endereco_Estado, String endereco_Cidade, String endereco_Logradouro, String endereco_CEP)
	{
		//return true;
		return adapter.alterarEvent(ativo, cnpj, nome, email, telefone, prazoEntregaDias, endereco_Pais, endereco_Estado, endereco_Cidade, endereco_Logradouro, endereco_CEP);
	}
	
	
	public Boolean fazerAlteracoesAtivos()
	{
		   // if(status == true)
		   if(status == true && adapter.fazerAlteracoesAtivosEvent() == true)
			return true;
			else
			return false;	
	}
	
	public Boolean fazerAlteracoesInativos()
	{
		   // if(status == false)
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
