package estoquistaPk;

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
		estoquista oTestObject = new estoquista();
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		oTestObject.handleEvent("fazerAlteraçoesEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test2()
	{
		estoquista oTestObject = new estoquista();
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test3()
	{
		estoquista oTestObject = new estoquista();
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test4()
	{
		estoquista oTestObject = new estoquista();
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("desativarEvent");
		assertEquals(true, (oTestObject.state == State.desactivando));
		oTestObject.handleEvent("fazerDesactivaçãoEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test5()
	{
		estoquista oTestObject = new estoquista();
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test6()
	{
		estoquista oTestObject = new estoquista();
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("cadastrarEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test7()
	{
		estoquista oTestObject = new estoquista();
		Boolean statusVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("inicializarEvent", statusVal1);
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
}