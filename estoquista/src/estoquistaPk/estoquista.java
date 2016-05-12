package estoquistaPk;


public class estoquista  extends java.lang.Object implements java.lang.Cloneable  {

	
	public State state;
	public Boolean status;
	
	public estoquista()
	{
		state = State.mostrandoAtivos;
		
	}
	
	public estoquista clone()
	{
		try {
			return (estoquista)super.clone();
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
			
			if((state == State.mostrandoAtivos) && (sEventName.compareTo("inicializarEvent") == 0))
			{
				status = ((Boolean)in_colObject[1]).booleanValue();
	
			}
			
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("cadastrarEvent") == 0))
			{		
				if (cadastrar()) {
					state = State.cadastrando;
				} else {
					state = State.mostrandoAtivos;
				}
			}
			
			
			else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroEvent") == 0))
			{		
				if (fazerCadastro()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.cadastrando;
				}
			}
			
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("alterarEvent") == 0))
			{		
				if (alterar()) {
					state = State.alterando;
				} else {
					state = State.mostrandoAtivos;
				}
			}
			
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAlteraçoesEvent") == 0))
			{		
				if (fazerAlteraçoes()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.alterando;
				}
			}
			
			
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("desativarEvent") == 0))
			{		
				if (desativar()) {
					state = State.desactivando;
				} else {
					state = State.mostrandoAtivos;
				}
			}
			
			
			else if((state == State.desactivando) && (sEventName.compareTo("fazerDesactivaçãoEvent") == 0))
			{		
				if (fazerDesactivação()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.desactivando;
				}
			}
			
			
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("mostrarInativosEvent") == 0))
			{		
				if (mostrarInativos()) {
					state = State.mostrandoInativos;
				} else {
					state = State.mostrandoAtivos;
				}
			}
			
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("mostrarAtivosEvent") == 0))
			{		
				if (mostrarAtivos()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.mostrandoInativos;
				}
			}
			
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("cadastrarEvent") == 0))
			{		
				if (cadastrar()) {
					state = State.cadastrando;
				} else {
					state = State.mostrandoInativos;
				}
			}
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("alterarEvent") == 0))
			{		
				if (alterar()) {
					state = State.alterando;
				} else {
					state = State.mostrandoInativos;
				}
			}
			
			
			
			}
		}
	
	
	public Boolean cadastrar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerAlteraçoes()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean alterar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerCadastro()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean desativar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerDesactivação()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean mostrarAtivos()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean mostrarInativos()
	{
		return true;
		//return adaptador.activado();
	}
	
	
	
	
	
}
