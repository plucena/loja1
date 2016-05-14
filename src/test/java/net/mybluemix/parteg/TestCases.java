package net.mybluemix.parteg;

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
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -45878;
		Integer nomeVal14 = -86707;
		Integer emailVal14 = -8226;
		Integer telefoneVal14 = -55062;
		Integer prazoEntregaDiasVal14 = -886097;
		Integer endereco_PaisVal14 = 14179;
		Integer endereco_EstadoVal14 = 326902;
		Integer endereco_CidadeVal14 = 66865;
		Integer endereco_LogradouroVal14 = 85102;
		Integer endereco_CEPVal14 = 5636;
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
	public void test2()
	{
		Estoquista oTestObject = new Estoquista();
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 23877;
		Integer nomeVal16 = 533600;
		Integer emailVal16 = 3674;
		Integer telefoneVal16 = -86195;
		Integer prazoEntregaDiasVal16 = 328175;
		Integer endereco_PaisVal16 = -122161;
		Integer endereco_EstadoVal16 = 130117;
		Integer endereco_CidadeVal16 = -153689;
		Integer endereco_LogradouroVal16 = -243853;
		Integer endereco_CEPVal16 = 176771;
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
	public void test3()
	{
		Estoquista oTestObject = new Estoquista();
		Integer cnpjVal6 = 1000000;
		Boolean ativoVal6 = true;
		Integer nomeVal6 = -37703;
		Integer emailVal6 = 599277;
		Integer telefoneVal6 = 101057;
		Integer prazoEntregaDiasVal6 = 344268;
		Integer endereco_PaisVal6 = -660257;
		Integer endereco_EstadoVal6 = -154690;
		Integer endereco_CidadeVal6 = 113153;
		Integer endereco_LogradouroVal6 = -294039;
		Integer endereco_CEPVal6 = -336330;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal6, cnpjVal6, nomeVal6, emailVal6, telefoneVal6, prazoEntregaDiasVal6, endereco_PaisVal6, endereco_EstadoVal6, endereco_CidadeVal6, endereco_LogradouroVal6, endereco_CEPVal6);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal6.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal6.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal6.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal6.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal6.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal6.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal6.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal6.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal6.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal6.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal6.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		assertEquals(true, (oTestObject.cnpj.intValue() > 999999));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test4()
	{
		Estoquista oTestObject = new Estoquista();
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 17005;
		Integer nomeVal4 = -131785;
		Integer emailVal4 = 432241;
		Integer telefoneVal4 = -471029;
		Integer prazoEntregaDiasVal4 = -281643;
		Integer endereco_PaisVal4 = -496884;
		Integer endereco_EstadoVal4 = -589496;
		Integer endereco_CidadeVal4 = 32395;
		Integer endereco_LogradouroVal4 = -4106;
		Integer endereco_CEPVal4 = -87376;
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