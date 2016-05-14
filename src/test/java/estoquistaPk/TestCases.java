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
		Estoquista oTestObject = new Estoquista();
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -706144;
		Integer nomeVal16 = -327232;
		Integer emailVal16 = 116675;
		Integer telefoneVal16 = 43085;
		Integer prazoEntregaDiasVal16 = 621652;
		Integer endereco_PaisVal16 = 404157;
		Integer endereco_EstadoVal16 = -938;
		Integer endereco_CidadeVal16 = 578331;
		Integer endereco_LogradouroVal16 = 348082;
		Integer endereco_CEPVal16 = 375650;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test2()
	{
		Estoquista oTestObject = new Estoquista();
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 240880;
		Integer nomeVal14 = -47044;
		Integer emailVal14 = 41170;
		Integer telefoneVal14 = 315150;
		Integer prazoEntregaDiasVal14 = 752096;
		Integer endereco_PaisVal14 = -528318;
		Integer endereco_EstadoVal14 = -440126;
		Integer endereco_CidadeVal14 = -331982;
		Integer endereco_LogradouroVal14 = 135098;
		Integer endereco_CEPVal14 = 337021;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		
	}
	
	@Test
	public void test3()
	{
		Estoquista oTestObject = new Estoquista();
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -562357;
		Integer nomeVal6 = -139079;
		Integer emailVal6 = -291023;
		Integer telefoneVal6 = -29999;
		Integer prazoEntregaDiasVal6 = 105169;
		Integer endereco_PaisVal6 = -97665;
		Integer endereco_EstadoVal6 = -889591;
		Integer endereco_CidadeVal6 = 510925;
		Integer endereco_LogradouroVal6 = -90014;
		Integer endereco_CEPVal6 = -117479;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal6, cnpjVal6, nomeVal6, emailVal6, telefoneVal6, prazoEntregaDiasVal6, endereco_PaisVal6, endereco_EstadoVal6, endereco_CidadeVal6, endereco_LogradouroVal6, endereco_CEPVal6);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test4()
	{
		Estoquista oTestObject = new Estoquista();
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 253639;
		Integer nomeVal4 = 250726;
		Integer emailVal4 = -921068;
		Integer telefoneVal4 = -142225;
		Integer prazoEntregaDiasVal4 = -30121;
		Integer endereco_PaisVal4 = -172698;
		Integer endereco_EstadoVal4 = 371025;
		Integer endereco_CidadeVal4 = -222672;
		Integer endereco_LogradouroVal4 = -357567;
		Integer endereco_CEPVal4 = 557345;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		
	}
	
}