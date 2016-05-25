package net.mybluemix.parteg.fornecedor;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_Decision_Converage{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_Decision_Converage.class);
	}
	
	@Test
	public void test1()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 515521;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 20583;
		Integer emailVal16 = 9056;
		Integer telefoneVal16 = -530277;
		Integer prazoEntregaDiasVal16 = 62875;
		Integer endereco_PaisVal16 = -335878;
		Integer endereco_EstadoVal16 = 517847;
		Integer endereco_CidadeVal16 = 177652;
		Integer endereco_LogradouroVal16 = -140988;
		Integer endereco_CEPVal16 = -771906;
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
	public void test2()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 1;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 20583;
		Integer emailVal16 = 9056;
		Integer telefoneVal16 = -530277;
		Integer prazoEntregaDiasVal16 = 62875;
		Integer endereco_PaisVal16 = -335878;
		Integer endereco_EstadoVal16 = 517847;
		Integer endereco_CidadeVal16 = 177652;
		Integer endereco_LogradouroVal16 = -140988;
		Integer endereco_CEPVal16 = -771906;
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
	public void test3()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 773664;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -453641;
		Integer emailVal16 = -33884;
		Integer telefoneVal16 = -163352;
		Integer prazoEntregaDiasVal16 = -185133;
		Integer endereco_PaisVal16 = 138946;
		Integer endereco_EstadoVal16 = 55247;
		Integer endereco_CidadeVal16 = 728536;
		Integer endereco_LogradouroVal16 = -263775;
		Integer endereco_CEPVal16 = 125476;
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
		Integer cnpjVal16 = -453641;
		Integer emailVal16 = -33884;
		Integer telefoneVal16 = -163352;
		Integer prazoEntregaDiasVal16 = -185133;
		Integer endereco_PaisVal16 = 138946;
		Integer endereco_EstadoVal16 = 55247;
		Integer endereco_CidadeVal16 = 728536;
		Integer endereco_LogradouroVal16 = -263775;
		Integer endereco_CEPVal16 = 125476;
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
		Integer nomeVal14 = 772582;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -591341;
		Integer emailVal14 = -335252;
		Integer telefoneVal14 = 76686;
		Integer prazoEntregaDiasVal14 = 347479;
		Integer endereco_PaisVal14 = -308937;
		Integer endereco_EstadoVal14 = 57245;
		Integer endereco_CidadeVal14 = -200939;
		Integer endereco_LogradouroVal14 = 70324;
		Integer endereco_CEPVal14 = 523649;
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
	public void test6()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -591341;
		Integer emailVal14 = -335252;
		Integer telefoneVal14 = 76686;
		Integer prazoEntregaDiasVal14 = 347479;
		Integer endereco_PaisVal14 = -308937;
		Integer endereco_EstadoVal14 = 57245;
		Integer endereco_CidadeVal14 = -200939;
		Integer endereco_LogradouroVal14 = 70324;
		Integer endereco_CEPVal14 = 523649;
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
	public void test7()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 356517;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -595539;
		Integer emailVal14 = 376368;
		Integer telefoneVal14 = 162139;
		Integer prazoEntregaDiasVal14 = 185212;
		Integer endereco_PaisVal14 = 174070;
		Integer endereco_EstadoVal14 = 76028;
		Integer endereco_CidadeVal14 = 225549;
		Integer endereco_LogradouroVal14 = 269956;
		Integer endereco_CEPVal14 = 223414;
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
	public void test8()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -595539;
		Integer emailVal14 = 376368;
		Integer telefoneVal14 = 162139;
		Integer prazoEntregaDiasVal14 = 185212;
		Integer endereco_PaisVal14 = 174070;
		Integer endereco_EstadoVal14 = 76028;
		Integer endereco_CidadeVal14 = 225549;
		Integer endereco_LogradouroVal14 = 269956;
		Integer endereco_CEPVal14 = 223414;
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
	public void test9()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 842316;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -491256;
		Integer emailVal6 = -93262;
		Integer telefoneVal6 = -530908;
		Integer prazoEntregaDiasVal6 = 203218;
		Integer endereco_PaisVal6 = -96544;
		Integer endereco_EstadoVal6 = 651;
		Integer endereco_CidadeVal6 = 537903;
		Integer endereco_LogradouroVal6 = 614000;
		Integer endereco_CEPVal6 = -1337;
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
	public void test10()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -491256;
		Integer emailVal6 = -93262;
		Integer telefoneVal6 = -530908;
		Integer prazoEntregaDiasVal6 = 203218;
		Integer endereco_PaisVal6 = -96544;
		Integer endereco_EstadoVal6 = 651;
		Integer endereco_CidadeVal6 = 537903;
		Integer endereco_LogradouroVal6 = 614000;
		Integer endereco_CEPVal6 = -1337;
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
	public void test11()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 838189;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -155517;
		Integer emailVal4 = 174403;
		Integer telefoneVal4 = 832809;
		Integer prazoEntregaDiasVal4 = -175081;
		Integer endereco_PaisVal4 = -23280;
		Integer endereco_EstadoVal4 = 141491;
		Integer endereco_CidadeVal4 = -157818;
		Integer endereco_LogradouroVal4 = -118159;
		Integer endereco_CEPVal4 = -476888;
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
	public void test12()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -155517;
		Integer emailVal4 = 174403;
		Integer telefoneVal4 = 832809;
		Integer prazoEntregaDiasVal4 = -175081;
		Integer endereco_PaisVal4 = -23280;
		Integer endereco_EstadoVal4 = 141491;
		Integer endereco_CidadeVal4 = -157818;
		Integer endereco_LogradouroVal4 = -118159;
		Integer endereco_CEPVal4 = -476888;
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
	public void test13()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 815127;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -5154;
		Integer emailVal4 = -18510;
		Integer telefoneVal4 = 440755;
		Integer prazoEntregaDiasVal4 = 465540;
		Integer endereco_PaisVal4 = -295125;
		Integer endereco_EstadoVal4 = 13363;
		Integer endereco_CidadeVal4 = 2681;
		Integer endereco_LogradouroVal4 = -601987;
		Integer endereco_CEPVal4 = 435210;
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
	public void test14()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -5154;
		Integer emailVal4 = -18510;
		Integer telefoneVal4 = 440755;
		Integer prazoEntregaDiasVal4 = 465540;
		Integer endereco_PaisVal4 = -295125;
		Integer endereco_EstadoVal4 = 13363;
		Integer endereco_CidadeVal4 = 2681;
		Integer endereco_LogradouroVal4 = -601987;
		Integer endereco_CEPVal4 = 435210;
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
	public void test15()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 440077;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 62956;
		Integer emailVal6 = -55632;
		Integer telefoneVal6 = -13623;
		Integer prazoEntregaDiasVal6 = 512098;
		Integer endereco_PaisVal6 = -425328;
		Integer endereco_EstadoVal6 = 473672;
		Integer endereco_CidadeVal6 = -318555;
		Integer endereco_LogradouroVal6 = -27085;
		Integer endereco_CEPVal6 = -63901;
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
	public void test16()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 62956;
		Integer emailVal6 = -55632;
		Integer telefoneVal6 = -13623;
		Integer prazoEntregaDiasVal6 = 512098;
		Integer endereco_PaisVal6 = -425328;
		Integer endereco_EstadoVal6 = 473672;
		Integer endereco_CidadeVal6 = -318555;
		Integer endereco_LogradouroVal6 = -27085;
		Integer endereco_CEPVal6 = -63901;
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
	
}