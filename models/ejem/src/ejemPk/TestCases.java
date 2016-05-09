package ejemPk;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases.class);
	}
	
	@Test
	public void test1()
	{
		ejem oTestObject = new ejem();
		Integer numeroVal1 = 31544;
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		assertEquals(true, (oTestObject.numero.intValue() > 10));
		oTestObject.handleEvent("mayorEvent");
		assertEquals(true, (oTestObject.state == State.mayor));
		
	}
	
	@Test
	public void test2()
	{
		ejem oTestObject = new ejem();
		Integer numeroVal1 = 11;
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		assertEquals(true, (oTestObject.numero.intValue() > 10));
		oTestObject.handleEvent("mayorEvent");
		assertEquals(true, (oTestObject.state == State.mayor));
		
	}
	
	@Test
	public void test3()
	{
		ejem oTestObject = new ejem();
		Integer numeroVal1 = -43721;
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		assertEquals(true, (oTestObject.numero.intValue() <= 10));
		oTestObject.handleEvent("mayorEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		
	}
	
	@Test
	public void test4()
	{
		ejem oTestObject = new ejem();
		Integer numeroVal1 = 10;
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		assertEquals(true, (oTestObject.numero.intValue() <= 10));
		oTestObject.handleEvent("mayorEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		
	}
	
	@Test
	public void test5()
	{
		ejem oTestObject = new ejem();
		Boolean statusVal1 = false;
		Integer numeroVal1 = 199126;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		oTestObject.handleEvent("falsoEvent");
		assertEquals(true, (oTestObject.state == State.falso));
		
	}
	
	@Test
	public void test6()
	{
		ejem oTestObject = new ejem();
		Boolean statusVal1 = true;
		Integer numeroVal1 = 166841;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() != false));
		oTestObject.handleEvent("falsoEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		
	}
	
	@Test
	public void test7()
	{
		ejem oTestObject = new ejem();
		Boolean statusVal1 = false;
		Integer numeroVal1 = 72479;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1, numeroVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.numero.intValue() == numeroVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() != true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		
	}
	
}