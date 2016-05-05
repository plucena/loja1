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
		Boolean statusVal1 = false;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		oTestObject.handleEvent("falsoEvent");
		assertEquals(true, (oTestObject.state == State.falso));
		
	}
	
	@Test
	public void test2()
	{
		ejem oTestObject = new ejem();
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.verdadero));
		
	}
	
	@Test
	public void test3()
	{
		ejem oTestObject = new ejem();
		Boolean statusVal1 = false;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() != true));
		oTestObject.handleEvent("verdaderoEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		
	}
	
	@Test
	public void test4()
	{
		ejem oTestObject = new ejem();
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.status.booleanValue() == statusVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.idle));
		oTestObject.handleEvent("activarEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		assertEquals(true, (oTestObject.status.booleanValue() != false));
		oTestObject.handleEvent("falsoEvent");
		assertEquals(true, (oTestObject.state == State.activo));
		
	}
	
}