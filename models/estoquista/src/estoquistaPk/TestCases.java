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
		Integer nomeVal16 = 725257;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -621408;
		Integer emailVal16 = -90454;
		Integer telefoneVal16 = -445014;
		Integer prazoEntregaDiasVal16 = -182846;
		Integer endereco_PaisVal16 = 656764;
		Integer endereco_EstadoVal16 = 382597;
		Integer endereco_CidadeVal16 = -432984;
		Integer endereco_LogradouroVal16 = 56400;
		Integer endereco_CEPVal16 = -402958;
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
	public void test2()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 1;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -621408;
		Integer emailVal16 = -90454;
		Integer telefoneVal16 = -445014;
		Integer prazoEntregaDiasVal16 = -182846;
		Integer endereco_PaisVal16 = 656764;
		Integer endereco_EstadoVal16 = 382597;
		Integer endereco_CidadeVal16 = -432984;
		Integer endereco_LogradouroVal16 = 56400;
		Integer endereco_CEPVal16 = -402958;
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
	public void test3()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 547352;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 183844;
		Integer emailVal14 = -518827;
		Integer telefoneVal14 = 193527;
		Integer prazoEntregaDiasVal14 = 95863;
		Integer endereco_PaisVal14 = -42839;
		Integer endereco_EstadoVal14 = 63524;
		Integer endereco_CidadeVal14 = -284887;
		Integer endereco_LogradouroVal14 = -607030;
		Integer endereco_CEPVal14 = 209826;
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
	public void test4()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 183844;
		Integer emailVal14 = -518827;
		Integer telefoneVal14 = 193527;
		Integer prazoEntregaDiasVal14 = 95863;
		Integer endereco_PaisVal14 = -42839;
		Integer endereco_EstadoVal14 = 63524;
		Integer endereco_CidadeVal14 = -284887;
		Integer endereco_LogradouroVal14 = -607030;
		Integer endereco_CEPVal14 = 209826;
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
	public void test5()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 499908;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 333335;
		Integer emailVal6 = 48974;
		Integer telefoneVal6 = -66538;
		Integer prazoEntregaDiasVal6 = -201915;
		Integer endereco_PaisVal6 = 40937;
		Integer endereco_EstadoVal6 = 501934;
		Integer endereco_CidadeVal6 = -517183;
		Integer endereco_LogradouroVal6 = 186365;
		Integer endereco_CEPVal6 = 67580;
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
	public void test6()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 333335;
		Integer emailVal6 = 48974;
		Integer telefoneVal6 = -66538;
		Integer prazoEntregaDiasVal6 = -201915;
		Integer endereco_PaisVal6 = 40937;
		Integer endereco_EstadoVal6 = 501934;
		Integer endereco_CidadeVal6 = -517183;
		Integer endereco_LogradouroVal6 = 186365;
		Integer endereco_CEPVal6 = 67580;
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
	public void test7()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 239127;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 247646;
		Integer emailVal4 = 536192;
		Integer telefoneVal4 = 415748;
		Integer prazoEntregaDiasVal4 = 173062;
		Integer endereco_PaisVal4 = -218917;
		Integer endereco_EstadoVal4 = -176857;
		Integer endereco_CidadeVal4 = -28855;
		Integer endereco_LogradouroVal4 = -714326;
		Integer endereco_CEPVal4 = 303497;
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
	public void test8()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 247646;
		Integer emailVal4 = 536192;
		Integer telefoneVal4 = 415748;
		Integer prazoEntregaDiasVal4 = 173062;
		Integer endereco_PaisVal4 = -218917;
		Integer endereco_EstadoVal4 = -176857;
		Integer endereco_CidadeVal4 = -28855;
		Integer endereco_LogradouroVal4 = -714326;
		Integer endereco_CEPVal4 = 303497;
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
	
}