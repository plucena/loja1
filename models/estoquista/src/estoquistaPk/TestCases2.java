package estoquistaPk;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases2{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases2.class);
	}
	
	@Test
	public void test1()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = -392775;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 145;
		Integer emailVal14 = -326261;
		Integer telefoneVal14 = -55615;
		Integer prazoEntregaDiasVal14 = -14063;
		Integer endereco_PaisVal14 = -428975;
		Integer endereco_EstadoVal14 = -690619;
		Integer endereco_CidadeVal14 = -9613;
		Integer endereco_LogradouroVal14 = 255433;
		Integer endereco_CEPVal14 = -197941;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal14.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal14.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal14.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal14.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal14.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal14.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test2()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 0;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 145;
		Integer emailVal14 = -326261;
		Integer telefoneVal14 = -55615;
		Integer prazoEntregaDiasVal14 = -14063;
		Integer endereco_PaisVal14 = -428975;
		Integer endereco_EstadoVal14 = -690619;
		Integer endereco_CidadeVal14 = -9613;
		Integer endereco_LogradouroVal14 = 255433;
		Integer endereco_CEPVal14 = -197941;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal14.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal14.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal14.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal14.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal14.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal14.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test3()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 719910;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -93261;
		Integer emailVal16 = 392014;
		Integer telefoneVal16 = 386402;
		Integer prazoEntregaDiasVal16 = -238840;
		Integer endereco_PaisVal16 = -82203;
		Integer endereco_EstadoVal16 = 99538;
		Integer endereco_CidadeVal16 = 343840;
		Integer endereco_LogradouroVal16 = 121612;
		Integer endereco_CEPVal16 = -176493;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal16.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal16.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal16.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal16.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal16.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal16.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test4()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 1;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -93261;
		Integer emailVal16 = 392014;
		Integer telefoneVal16 = 386402;
		Integer prazoEntregaDiasVal16 = -238840;
		Integer endereco_PaisVal16 = -82203;
		Integer endereco_EstadoVal16 = 99538;
		Integer endereco_CidadeVal16 = 343840;
		Integer endereco_LogradouroVal16 = 121612;
		Integer endereco_CEPVal16 = -176493;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal16.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal16.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal16.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal16.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal16.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal16.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test5()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 454367;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 593674;
		Integer emailVal16 = 181840;
		Integer telefoneVal16 = -183238;
		Integer prazoEntregaDiasVal16 = -107976;
		Integer endereco_PaisVal16 = 195080;
		Integer endereco_EstadoVal16 = -286467;
		Integer endereco_CidadeVal16 = -1646;
		Integer endereco_LogradouroVal16 = -57017;
		Integer endereco_CEPVal16 = -355581;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal16.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal16.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal16.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal16.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal16.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal16.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() != false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test6()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 1;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 593674;
		Integer emailVal16 = 181840;
		Integer telefoneVal16 = -183238;
		Integer prazoEntregaDiasVal16 = -107976;
		Integer endereco_PaisVal16 = 195080;
		Integer endereco_EstadoVal16 = -286467;
		Integer endereco_CidadeVal16 = -1646;
		Integer endereco_LogradouroVal16 = -57017;
		Integer endereco_CEPVal16 = -355581;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal16.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal16.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal16.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal16.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal16.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal16.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() != false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test7()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = -407454;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 13238;
		Integer emailVal16 = 52118;
		Integer telefoneVal16 = 77721;
		Integer prazoEntregaDiasVal16 = 213483;
		Integer endereco_PaisVal16 = 122304;
		Integer endereco_EstadoVal16 = -573756;
		Integer endereco_CidadeVal16 = -618775;
		Integer endereco_LogradouroVal16 = -137261;
		Integer endereco_CEPVal16 = 105679;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal16.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal16.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal16.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal16.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal16.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal16.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test8()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 0;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 13238;
		Integer emailVal16 = 52118;
		Integer telefoneVal16 = 77721;
		Integer prazoEntregaDiasVal16 = 213483;
		Integer endereco_PaisVal16 = 122304;
		Integer endereco_EstadoVal16 = -573756;
		Integer endereco_CidadeVal16 = -618775;
		Integer endereco_LogradouroVal16 = -137261;
		Integer endereco_CEPVal16 = 105679;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("mostrarAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("alterarEvent", ativoVal16, cnpjVal16, nomeVal16, emailVal16, telefoneVal16, prazoEntregaDiasVal16, endereco_PaisVal16, endereco_EstadoVal16, endereco_CidadeVal16, endereco_LogradouroVal16, endereco_CEPVal16);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal16.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal16.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal16.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal16.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal16.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal16.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal16.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == true));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test9()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 799714;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 364613;
		Integer emailVal14 = -192015;
		Integer telefoneVal14 = -277017;
		Integer prazoEntregaDiasVal14 = 807585;
		Integer endereco_PaisVal14 = 176249;
		Integer endereco_EstadoVal14 = 130855;
		Integer endereco_CidadeVal14 = -515137;
		Integer endereco_LogradouroVal14 = -53094;
		Integer endereco_CEPVal14 = -26328;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal14.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal14.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal14.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal14.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal14.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal14.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() != true));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test10()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 364613;
		Integer emailVal14 = -192015;
		Integer telefoneVal14 = -277017;
		Integer prazoEntregaDiasVal14 = 807585;
		Integer endereco_PaisVal14 = 176249;
		Integer endereco_EstadoVal14 = 130855;
		Integer endereco_CidadeVal14 = -515137;
		Integer endereco_LogradouroVal14 = -53094;
		Integer endereco_CEPVal14 = -26328;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal14.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal14.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal14.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal14.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal14.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal14.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() != true));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test11()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 920726;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 665249;
		Integer emailVal14 = 141032;
		Integer telefoneVal14 = 1323;
		Integer prazoEntregaDiasVal14 = -374126;
		Integer endereco_PaisVal14 = -258562;
		Integer endereco_EstadoVal14 = 510872;
		Integer endereco_CidadeVal14 = 98367;
		Integer endereco_LogradouroVal14 = -19723;
		Integer endereco_CEPVal14 = 442071;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal14.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal14.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal14.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal14.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal14.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal14.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		
	}
	
	@Test
	public void test12()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 665249;
		Integer emailVal14 = 141032;
		Integer telefoneVal14 = 1323;
		Integer prazoEntregaDiasVal14 = -374126;
		Integer endereco_PaisVal14 = -258562;
		Integer endereco_EstadoVal14 = 510872;
		Integer endereco_CidadeVal14 = 98367;
		Integer endereco_LogradouroVal14 = -19723;
		Integer endereco_CEPVal14 = 442071;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("alterarEvent", ativoVal14, cnpjVal14, nomeVal14, emailVal14, telefoneVal14, prazoEntregaDiasVal14, endereco_PaisVal14, endereco_EstadoVal14, endereco_CidadeVal14, endereco_LogradouroVal14, endereco_CEPVal14);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal14.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal14.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal14.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal14.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal14.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal14.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal14.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		
	}
	
	@Test
	public void test13()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 709438;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -219339;
		Integer emailVal6 = -188086;
		Integer telefoneVal6 = -324810;
		Integer prazoEntregaDiasVal6 = -146130;
		Integer endereco_PaisVal6 = -498361;
		Integer endereco_EstadoVal6 = 58616;
		Integer endereco_CidadeVal6 = 418952;
		Integer endereco_LogradouroVal6 = 404926;
		Integer endereco_CEPVal6 = 134121;
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
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test14()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -219339;
		Integer emailVal6 = -188086;
		Integer telefoneVal6 = -324810;
		Integer prazoEntregaDiasVal6 = -146130;
		Integer endereco_PaisVal6 = -498361;
		Integer endereco_EstadoVal6 = 58616;
		Integer endereco_CidadeVal6 = 418952;
		Integer endereco_LogradouroVal6 = 404926;
		Integer endereco_CEPVal6 = 134121;
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
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		
	}
	
	@Test
	public void test15()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = -487045;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -50067;
		Integer emailVal4 = 259684;
		Integer telefoneVal4 = 201155;
		Integer prazoEntregaDiasVal4 = -119876;
		Integer endereco_PaisVal4 = 16364;
		Integer endereco_EstadoVal4 = 259687;
		Integer endereco_CidadeVal4 = 135901;
		Integer endereco_LogradouroVal4 = 6166;
		Integer endereco_CEPVal4 = -320211;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal4.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal4.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal4.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal4.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal4.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal4.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test16()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 0;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -50067;
		Integer emailVal4 = 259684;
		Integer telefoneVal4 = 201155;
		Integer prazoEntregaDiasVal4 = -119876;
		Integer endereco_PaisVal4 = 16364;
		Integer endereco_EstadoVal4 = 259687;
		Integer endereco_CidadeVal4 = 135901;
		Integer endereco_LogradouroVal4 = 6166;
		Integer endereco_CEPVal4 = -320211;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal4.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal4.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal4.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal4.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal4.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal4.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test17()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 67973;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 351388;
		Integer emailVal4 = 139575;
		Integer telefoneVal4 = -617869;
		Integer prazoEntregaDiasVal4 = -2089;
		Integer endereco_PaisVal4 = -27477;
		Integer endereco_EstadoVal4 = 233544;
		Integer endereco_CidadeVal4 = 345138;
		Integer endereco_LogradouroVal4 = 164875;
		Integer endereco_CEPVal4 = -52048;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal4.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal4.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal4.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal4.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal4.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal4.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() != true));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test18()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 351388;
		Integer emailVal4 = 139575;
		Integer telefoneVal4 = -617869;
		Integer prazoEntregaDiasVal4 = -2089;
		Integer endereco_PaisVal4 = -27477;
		Integer endereco_EstadoVal4 = 233544;
		Integer endereco_CidadeVal4 = 345138;
		Integer endereco_LogradouroVal4 = 164875;
		Integer endereco_CEPVal4 = -52048;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal4.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal4.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal4.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal4.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal4.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal4.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() != true));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test19()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 600814;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 35365;
		Integer emailVal4 = 92339;
		Integer telefoneVal4 = 54524;
		Integer prazoEntregaDiasVal4 = 476944;
		Integer endereco_PaisVal4 = 474361;
		Integer endereco_EstadoVal4 = 818381;
		Integer endereco_CidadeVal4 = 499366;
		Integer endereco_LogradouroVal4 = -581407;
		Integer endereco_CEPVal4 = -91720;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal4.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal4.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal4.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal4.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal4.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal4.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		
	}
	
	@Test
	public void test20()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 35365;
		Integer emailVal4 = 92339;
		Integer telefoneVal4 = 54524;
		Integer prazoEntregaDiasVal4 = 476944;
		Integer endereco_PaisVal4 = 474361;
		Integer endereco_EstadoVal4 = 818381;
		Integer endereco_CidadeVal4 = 499366;
		Integer endereco_LogradouroVal4 = -581407;
		Integer endereco_CEPVal4 = -91720;
		oTestObject.handleEvent("inicializarEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoAtivos));
		oTestObject.handleEvent("mostrarInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		oTestObject.handleEvent("cadastrarEvent", ativoVal4, cnpjVal4, nomeVal4, emailVal4, telefoneVal4, prazoEntregaDiasVal4, endereco_PaisVal4, endereco_EstadoVal4, endereco_CidadeVal4, endereco_LogradouroVal4, endereco_CEPVal4);
		assertEquals(true, (oTestObject.ativo.booleanValue() == ativoVal4.booleanValue()));
		assertEquals(true, (oTestObject.cnpj.intValue() == cnpjVal4.intValue()));
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal4.intValue()));
		assertEquals(true, (oTestObject.email.intValue() == emailVal4.intValue()));
		assertEquals(true, (oTestObject.telefone.intValue() == telefoneVal4.intValue()));
		assertEquals(true, (oTestObject.prazoEntregaDias.intValue() == prazoEntregaDiasVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Pais.intValue() == endereco_PaisVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Estado.intValue() == endereco_EstadoVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Cidade.intValue() == endereco_CidadeVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_Logradouro.intValue() == endereco_LogradouroVal4.intValue()));
		assertEquals(true, (oTestObject.endereco_CEP.intValue() == endereco_CEPVal4.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.status.booleanValue() == false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.mostrandoInativos));
		
	}
	
	@Test
	public void test21()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 246256;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 593937;
		Integer emailVal6 = 341774;
		Integer telefoneVal6 = -10812;
		Integer prazoEntregaDiasVal6 = -368305;
		Integer endereco_PaisVal6 = 927780;
		Integer endereco_EstadoVal6 = -44092;
		Integer endereco_CidadeVal6 = 725583;
		Integer endereco_LogradouroVal6 = 358638;
		Integer endereco_CEPVal6 = -133013;
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
		assertEquals(true, (oTestObject.status.booleanValue() != false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test22()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 593937;
		Integer emailVal6 = 341774;
		Integer telefoneVal6 = -10812;
		Integer prazoEntregaDiasVal6 = -368305;
		Integer endereco_PaisVal6 = 927780;
		Integer endereco_EstadoVal6 = -44092;
		Integer endereco_CidadeVal6 = 725583;
		Integer endereco_LogradouroVal6 = 358638;
		Integer endereco_CEPVal6 = -133013;
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
		assertEquals(true, (oTestObject.status.booleanValue() != false));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test23()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = -620570;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -426135;
		Integer emailVal6 = -237636;
		Integer telefoneVal6 = 70474;
		Integer prazoEntregaDiasVal6 = -164302;
		Integer endereco_PaisVal6 = -33674;
		Integer endereco_EstadoVal6 = 115241;
		Integer endereco_CidadeVal6 = 221240;
		Integer endereco_LogradouroVal6 = 479110;
		Integer endereco_CEPVal6 = -32108;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test24()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 0;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -426135;
		Integer emailVal6 = -237636;
		Integer telefoneVal6 = 70474;
		Integer prazoEntregaDiasVal6 = -164302;
		Integer endereco_PaisVal6 = -33674;
		Integer endereco_EstadoVal6 = 115241;
		Integer endereco_CidadeVal6 = 221240;
		Integer endereco_LogradouroVal6 = 479110;
		Integer endereco_CEPVal6 = -32108;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}