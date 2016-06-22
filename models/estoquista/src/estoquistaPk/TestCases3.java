package estoquistaPk;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases3{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases3.class);
	}
	
	@Test
	public void test1()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = -315567;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 883839;
		Integer emailVal14 = -478710;
		Integer telefoneVal14 = 2529;
		Integer prazoEntregaDiasVal14 = -27772;
		Integer endereco_PaisVal14 = -647739;
		Integer endereco_EstadoVal14 = 7968;
		Integer endereco_CidadeVal14 = 8700;
		Integer endereco_LogradouroVal14 = 327558;
		Integer endereco_CEPVal14 = -77365;
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
		Integer cnpjVal14 = 883839;
		Integer emailVal14 = -478710;
		Integer telefoneVal14 = 2529;
		Integer prazoEntregaDiasVal14 = -27772;
		Integer endereco_PaisVal14 = -647739;
		Integer endereco_EstadoVal14 = 7968;
		Integer endereco_CidadeVal14 = 8700;
		Integer endereco_LogradouroVal14 = 327558;
		Integer endereco_CEPVal14 = -77365;
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
		Integer nomeVal16 = -789203;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 120436;
		Integer emailVal16 = -12092;
		Integer telefoneVal16 = -39845;
		Integer prazoEntregaDiasVal16 = -142621;
		Integer endereco_PaisVal16 = 107411;
		Integer endereco_EstadoVal16 = -33935;
		Integer endereco_CidadeVal16 = 380328;
		Integer endereco_LogradouroVal16 = -132206;
		Integer endereco_CEPVal16 = 399825;
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
	public void test4()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 0;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 120436;
		Integer emailVal16 = -12092;
		Integer telefoneVal16 = -39845;
		Integer prazoEntregaDiasVal16 = -142621;
		Integer endereco_PaisVal16 = 107411;
		Integer endereco_EstadoVal16 = -33935;
		Integer endereco_CidadeVal16 = 380328;
		Integer endereco_LogradouroVal16 = -132206;
		Integer endereco_CEPVal16 = 399825;
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
	public void test5()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 218123;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -169237;
		Integer emailVal14 = 106602;
		Integer telefoneVal14 = 47708;
		Integer prazoEntregaDiasVal14 = 707311;
		Integer endereco_PaisVal14 = -26195;
		Integer endereco_EstadoVal14 = -119876;
		Integer endereco_CidadeVal14 = 31486;
		Integer endereco_LogradouroVal14 = 213869;
		Integer endereco_CEPVal14 = 81725;
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
	public void test6()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -169237;
		Integer emailVal14 = 106602;
		Integer telefoneVal14 = 47708;
		Integer prazoEntregaDiasVal14 = 707311;
		Integer endereco_PaisVal14 = -26195;
		Integer endereco_EstadoVal14 = -119876;
		Integer endereco_CidadeVal14 = 31486;
		Integer endereco_LogradouroVal14 = 213869;
		Integer endereco_CEPVal14 = 81725;
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
	public void test7()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 95313;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 398034;
		Integer emailVal16 = -32451;
		Integer telefoneVal16 = -870373;
		Integer prazoEntregaDiasVal16 = 355353;
		Integer endereco_PaisVal16 = -8905;
		Integer endereco_EstadoVal16 = -42591;
		Integer endereco_CidadeVal16 = 511838;
		Integer endereco_LogradouroVal16 = 135810;
		Integer endereco_CEPVal16 = 266749;
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
	public void test8()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 1;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 398034;
		Integer emailVal16 = -32451;
		Integer telefoneVal16 = -870373;
		Integer prazoEntregaDiasVal16 = 355353;
		Integer endereco_PaisVal16 = -8905;
		Integer endereco_EstadoVal16 = -42591;
		Integer endereco_CidadeVal16 = 511838;
		Integer endereco_LogradouroVal16 = 135810;
		Integer endereco_CEPVal16 = 266749;
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
	public void test9()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = -46408;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -129152;
		Integer emailVal14 = -31032;
		Integer telefoneVal14 = -216727;
		Integer prazoEntregaDiasVal14 = -17371;
		Integer endereco_PaisVal14 = -10381;
		Integer endereco_EstadoVal14 = 360756;
		Integer endereco_CidadeVal14 = 351215;
		Integer endereco_LogradouroVal14 = 91669;
		Integer endereco_CEPVal14 = -216864;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test10()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 0;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = -129152;
		Integer emailVal14 = -31032;
		Integer telefoneVal14 = -216727;
		Integer prazoEntregaDiasVal14 = -17371;
		Integer endereco_PaisVal14 = -10381;
		Integer endereco_EstadoVal14 = 360756;
		Integer endereco_CidadeVal14 = 351215;
		Integer endereco_LogradouroVal14 = 91669;
		Integer endereco_CEPVal14 = -216864;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesAtivosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test11()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 885439;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 241472;
		Integer emailVal14 = -95163;
		Integer telefoneVal14 = -725042;
		Integer prazoEntregaDiasVal14 = 344908;
		Integer endereco_PaisVal14 = 569463;
		Integer endereco_EstadoVal14 = 385406;
		Integer endereco_CidadeVal14 = -102446;
		Integer endereco_LogradouroVal14 = 97178;
		Integer endereco_CEPVal14 = -304436;
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
	public void test12()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal14 = 1;
		Boolean ativoVal14 = true;
		Integer cnpjVal14 = 241472;
		Integer emailVal14 = -95163;
		Integer telefoneVal14 = -725042;
		Integer prazoEntregaDiasVal14 = 344908;
		Integer endereco_PaisVal14 = 569463;
		Integer endereco_EstadoVal14 = 385406;
		Integer endereco_CidadeVal14 = -102446;
		Integer endereco_LogradouroVal14 = 97178;
		Integer endereco_CEPVal14 = -304436;
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
	public void test13()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = -919118;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 589196;
		Integer emailVal16 = 42742;
		Integer telefoneVal16 = 199509;
		Integer prazoEntregaDiasVal16 = -365460;
		Integer endereco_PaisVal16 = 148726;
		Integer endereco_EstadoVal16 = 45141;
		Integer endereco_CidadeVal16 = 29;
		Integer endereco_LogradouroVal16 = -113666;
		Integer endereco_CEPVal16 = -56561;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test14()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 0;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = 589196;
		Integer emailVal16 = 42742;
		Integer telefoneVal16 = 199509;
		Integer prazoEntregaDiasVal16 = -365460;
		Integer endereco_PaisVal16 = 148726;
		Integer endereco_EstadoVal16 = 45141;
		Integer endereco_CidadeVal16 = 29;
		Integer endereco_LogradouroVal16 = -113666;
		Integer endereco_CEPVal16 = -56561;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesInativosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test15()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 869415;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -53112;
		Integer emailVal16 = -459401;
		Integer telefoneVal16 = -95216;
		Integer prazoEntregaDiasVal16 = 99293;
		Integer endereco_PaisVal16 = -260655;
		Integer endereco_EstadoVal16 = 139394;
		Integer endereco_CidadeVal16 = -125472;
		Integer endereco_LogradouroVal16 = 419968;
		Integer endereco_CEPVal16 = -191214;
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
	public void test16()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal16 = 1;
		Boolean ativoVal16 = true;
		Integer cnpjVal16 = -53112;
		Integer emailVal16 = -459401;
		Integer telefoneVal16 = -95216;
		Integer prazoEntregaDiasVal16 = 99293;
		Integer endereco_PaisVal16 = -260655;
		Integer endereco_EstadoVal16 = 139394;
		Integer endereco_CidadeVal16 = -125472;
		Integer endereco_LogradouroVal16 = 419968;
		Integer endereco_CEPVal16 = -191214;
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
	public void test17()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = -420330;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -499287;
		Integer emailVal6 = 43335;
		Integer telefoneVal6 = 36826;
		Integer prazoEntregaDiasVal6 = -268947;
		Integer endereco_PaisVal6 = -56731;
		Integer endereco_EstadoVal6 = -345276;
		Integer endereco_CidadeVal6 = 200541;
		Integer endereco_LogradouroVal6 = -79262;
		Integer endereco_CEPVal6 = 343123;
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
	public void test18()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 0;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -499287;
		Integer emailVal6 = 43335;
		Integer telefoneVal6 = 36826;
		Integer prazoEntregaDiasVal6 = -268947;
		Integer endereco_PaisVal6 = -56731;
		Integer endereco_EstadoVal6 = -345276;
		Integer endereco_CidadeVal6 = 200541;
		Integer endereco_LogradouroVal6 = -79262;
		Integer endereco_CEPVal6 = 343123;
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
	public void test19()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 887846;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -30593;
		Integer emailVal6 = 72658;
		Integer telefoneVal6 = 217310;
		Integer prazoEntregaDiasVal6 = -92430;
		Integer endereco_PaisVal6 = 718;
		Integer endereco_EstadoVal6 = 74837;
		Integer endereco_CidadeVal6 = 10108;
		Integer endereco_LogradouroVal6 = -35131;
		Integer endereco_CEPVal6 = 338660;
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
	public void test20()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -30593;
		Integer emailVal6 = 72658;
		Integer telefoneVal6 = 217310;
		Integer prazoEntregaDiasVal6 = -92430;
		Integer endereco_PaisVal6 = 718;
		Integer endereco_EstadoVal6 = 74837;
		Integer endereco_CidadeVal6 = 10108;
		Integer endereco_LogradouroVal6 = -35131;
		Integer endereco_CEPVal6 = 338660;
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
	public void test21()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = -54362;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -39287;
		Integer emailVal4 = -863;
		Integer telefoneVal4 = 315410;
		Integer prazoEntregaDiasVal4 = -41000;
		Integer endereco_PaisVal4 = -456031;
		Integer endereco_EstadoVal4 = -76727;
		Integer endereco_CidadeVal4 = 357017;
		Integer endereco_LogradouroVal4 = 397818;
		Integer endereco_CEPVal4 = -308030;
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
	public void test22()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 0;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -39287;
		Integer emailVal4 = -863;
		Integer telefoneVal4 = 315410;
		Integer prazoEntregaDiasVal4 = -41000;
		Integer endereco_PaisVal4 = -456031;
		Integer endereco_EstadoVal4 = -76727;
		Integer endereco_CidadeVal4 = 357017;
		Integer endereco_LogradouroVal4 = 397818;
		Integer endereco_CEPVal4 = -308030;
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
	public void test23()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 120795;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -445006;
		Integer emailVal6 = -122254;
		Integer telefoneVal6 = 25487;
		Integer prazoEntregaDiasVal6 = 33386;
		Integer endereco_PaisVal6 = 209226;
		Integer endereco_EstadoVal6 = 46334;
		Integer endereco_CidadeVal6 = 779395;
		Integer endereco_LogradouroVal6 = 160335;
		Integer endereco_CEPVal6 = -124425;
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
	public void test24()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 1;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = -445006;
		Integer emailVal6 = -122254;
		Integer telefoneVal6 = 25487;
		Integer prazoEntregaDiasVal6 = 33386;
		Integer endereco_PaisVal6 = 209226;
		Integer endereco_EstadoVal6 = 46334;
		Integer endereco_CidadeVal6 = 779395;
		Integer endereco_LogradouroVal6 = 160335;
		Integer endereco_CEPVal6 = -124425;
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
	public void test25()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 58227;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -368084;
		Integer emailVal4 = -644943;
		Integer telefoneVal4 = -5878;
		Integer prazoEntregaDiasVal4 = 156861;
		Integer endereco_PaisVal4 = 21927;
		Integer endereco_EstadoVal4 = -36809;
		Integer endereco_CidadeVal4 = 649268;
		Integer endereco_LogradouroVal4 = -628900;
		Integer endereco_CEPVal4 = -269379;
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
	public void test26()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -368084;
		Integer emailVal4 = -644943;
		Integer telefoneVal4 = -5878;
		Integer prazoEntregaDiasVal4 = 156861;
		Integer endereco_PaisVal4 = 21927;
		Integer endereco_EstadoVal4 = -36809;
		Integer endereco_CidadeVal4 = 649268;
		Integer endereco_LogradouroVal4 = -628900;
		Integer endereco_CEPVal4 = -269379;
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
	public void test27()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = -665459;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -15784;
		Integer emailVal4 = -129681;
		Integer telefoneVal4 = 509909;
		Integer prazoEntregaDiasVal4 = 785613;
		Integer endereco_PaisVal4 = 367766;
		Integer endereco_EstadoVal4 = -161143;
		Integer endereco_CidadeVal4 = -15102;
		Integer endereco_LogradouroVal4 = 503963;
		Integer endereco_CEPVal4 = 83758;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test28()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 0;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = -15784;
		Integer emailVal4 = -129681;
		Integer telefoneVal4 = 509909;
		Integer prazoEntregaDiasVal4 = 785613;
		Integer endereco_PaisVal4 = 367766;
		Integer endereco_EstadoVal4 = -161143;
		Integer endereco_CidadeVal4 = -15102;
		Integer endereco_LogradouroVal4 = 503963;
		Integer endereco_CEPVal4 = 83758;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroAtivosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test29()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = -807707;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 437430;
		Integer emailVal6 = -553947;
		Integer telefoneVal6 = -136397;
		Integer prazoEntregaDiasVal6 = -221347;
		Integer endereco_PaisVal6 = 221178;
		Integer endereco_EstadoVal6 = -62927;
		Integer endereco_CidadeVal6 = 430852;
		Integer endereco_LogradouroVal6 = 91701;
		Integer endereco_CEPVal6 = -130360;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test30()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal6 = 0;
		Boolean ativoVal6 = true;
		Integer cnpjVal6 = 437430;
		Integer emailVal6 = -553947;
		Integer telefoneVal6 = -136397;
		Integer prazoEntregaDiasVal6 = -221347;
		Integer endereco_PaisVal6 = 221178;
		Integer endereco_EstadoVal6 = -62927;
		Integer endereco_CidadeVal6 = 430852;
		Integer endereco_LogradouroVal6 = 91701;
		Integer endereco_CEPVal6 = -130360;
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
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroInativosEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test31()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 109817;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 1809;
		Integer emailVal4 = 328632;
		Integer telefoneVal4 = -48122;
		Integer prazoEntregaDiasVal4 = -208284;
		Integer endereco_PaisVal4 = -441245;
		Integer endereco_EstadoVal4 = 328538;
		Integer endereco_CidadeVal4 = 332782;
		Integer endereco_LogradouroVal4 = -540713;
		Integer endereco_CEPVal4 = -511559;
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
	public void test32()
	{
		Estoquista oTestObject = new Estoquista();
		Integer nomeVal4 = 1;
		Boolean ativoVal4 = true;
		Integer cnpjVal4 = 1809;
		Integer emailVal4 = 328632;
		Integer telefoneVal4 = -48122;
		Integer prazoEntregaDiasVal4 = -208284;
		Integer endereco_PaisVal4 = -441245;
		Integer endereco_EstadoVal4 = 328538;
		Integer endereco_CidadeVal4 = 332782;
		Integer endereco_LogradouroVal4 = -540713;
		Integer endereco_CEPVal4 = -511559;
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
	
}