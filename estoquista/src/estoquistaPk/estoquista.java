package estoquistaPk;



public class estoquista  extends java.lang.Object implements java.lang.Cloneable  {

	
	public State state;
	public Boolean status;
	
	public estoquista()
	{
		state = State.idle;
		
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
			
			if((state == State.idle) && (sEventName.compareTo("inicializarEvent") == 0))
			{
				state = State.idle;
				
			
			}
			
			
			else if((state == State.idle) && (sEventName.compareTo("activarEvent") == 0))
			{		
				if (activar()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.idle;
				}
			}
			
			else if((state == State.mostrandoAtivos) && (sEventName.compareTo("cadastrarEvent") == 0))
			{		
				if (cadastrar()) {
					state = State.cadastrando;
				} else {
					state = State.mostrandoAtivos;
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
			
						
			else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroAtivosEvent") == 0))
			{		
				if (fazerCadastroAtivos()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.cadastrando;
				}
			}
			
		
		else if((state == State.cadastrando) && (sEventName.compareTo("fazerCadastroInativosEvent") == 0))
		{		
			if (fazerCadastroInativos()) {
				state = State.mostrandoInativos;
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
			
			
			else if((state == State.mostrandoInativos) && (sEventName.compareTo("alterarEvent") == 0))
			{		
				if (alterar()) {
					state = State.alterando;
				} else {
					state = State.mostrandoInativos;
				}
			}
			
			
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAltera�oesAtivosEvent") == 0))
			{		
				if (fazerAltera�oesAtivos()) {
					state = State.mostrandoAtivos;
				} else {
					state = State.alterando;
				}
			}
			
			else if((state == State.alterando) && (sEventName.compareTo("fazerAltera�oesInativosEvent") == 0))
			{		
				if (fazerAltera�oesInativos()) {
					state = State.mostrandoInativos;
				} else {
					state = State.alterando;
				}
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
	
	
	public Boolean activar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean cadastrar()
	{
		return true;
		//return adaptador.activado();
	}
	
	public Boolean fazerCadastroAtivos()
	{
		if(status == true)
		return true;
		else
		return false;	
		//return adaptador.activado();
	}
	
	public Boolean fazerCadastroInativos()
	{
		if(status == false)
		return true;
		else
		return false;	
		//return adaptador.activado();
	}
	
	
	public Boolean alterar()
	{
		return true;
		//return adaptador.activado();
	}
	
	
	public Boolean fazerAltera�oesAtivos()
	{
		    if(status == true)
			return true;
			else
			return false;	
			//return adaptador.activado();
	}
	
	public Boolean fazerAltera�oesInativos()
	{
		    if(status == false)
			return true;
			else
			return false;	
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
