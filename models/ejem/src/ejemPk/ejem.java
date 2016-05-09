package ejemPk;

public class ejem extends java.lang.Object implements java.lang.Cloneable {
	
	public State state;
	public Boolean status;
	public Integer numero;
	//Adaptador adaptador = null;
	
	public ejem()
	{
		state = State.idle;
		numero = 0;
	}
	
	public ejem clone()
	{
		try {
			return (ejem)super.clone();
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
				status = ((Boolean)in_colObject[1]).booleanValue();
				numero = ((Integer)in_colObject[2]).intValue();
			}
			
			
			else if((state == State.idle) && (sEventName.compareTo("activarEvent") == 0))
			{		
				if (activado()) {
					state = State.activo;
				} else {
					state = State.idle;
				}
			}
			
			else if((state == State.activo) && (sEventName.compareTo("falsoEvent") == 0))
			{		
				
				if (falso()) {
					state = State.falso;
				} else {
					state = State.activo;
				}
			}
			
			else if((state == State.activo) && (sEventName.compareTo("verdaderoEvent") == 0))
			{		
				
				if (verdadero()) {
					state = State.verdadero;
				} else {
					state = State.activo;
				}
			}
			
			
			else if((state == State.verdadero) && (sEventName.compareTo("mayorEvent") == 0))
			{		
				
				
				if (mayor()) {
					state = State.mayor;
				} else {
					state = State.verdadero;
				}
			
				
			}
			
			
	
		}
	
	}
	
	public Boolean activado()
	{
		return true;
		//return adaptador.activado();
	}
	public Boolean verdadero()
	{
		
		if (status == true)
		return true;
		else
		return false;
		
			//return adaptador.activado();
	}
	
	public Boolean falso()
	{

		if (status == false)
		return true;
		else
		return false;
		
		
		//return adaptador.activado();
	}
	
	
	public Boolean mayor()
	{

		if (numero > 10)
		return true;
		else
		return false;
		
		
		//return adaptador.activado();
	}
	
}
