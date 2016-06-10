package net.mybluemix.parteg.receita;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_Modified_Condition{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_Modified_Condition.class);
	}
	
	@Test
	public void test1()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 773483;
		Integer tipoVal1 = 64536;
		Integer skuVal1 = 434667;
		Integer unidadeVal1 = -455066;
		Integer quantidadeVal1 = 294439;
		Integer descricaoVal1 = -64092;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test2()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -64092;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test3()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 198274;
		Integer tipoVal1 = 666537;
		Integer skuVal1 = 628014;
		Integer unidadeVal1 = 996056;
		Integer quantidadeVal1 = 294835;
		Integer descricaoVal1 = 54653;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test4()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 54653;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test5()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 574919;
		Integer tipoVal1 = 886694;
		Integer skuVal1 = 437253;
		Integer unidadeVal1 = 675238;
		Integer quantidadeVal1 = -420440;
		Integer descricaoVal1 = -280327;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test6()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -280327;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test7()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -488190;
		Integer tipoVal11 = 467808;
		Integer skuVal11 = 780160;
		Integer unidadeVal11 = 587297;
		Integer quantidadeVal11 = 692068;
		Integer descricaoVal11 = 841596;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test8()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 841596;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test9()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 611166;
		Integer tipoVal11 = 46853;
		Integer skuVal11 = 396425;
		Integer unidadeVal11 = -269720;
		Integer quantidadeVal11 = 348034;
		Integer descricaoVal11 = 285855;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test10()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 285855;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test11()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 860590;
		Integer tipoVal1 = 494196;
		Integer skuVal1 = -47192;
		Integer unidadeVal1 = 959050;
		Integer quantidadeVal1 = 637916;
		Integer descricaoVal1 = 443664;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test12()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 443664;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test13()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 687104;
		Integer tipoVal11 = 248048;
		Integer skuVal11 = 892088;
		Integer unidadeVal11 = 235003;
		Integer quantidadeVal11 = 45599;
		Integer descricaoVal11 = -130456;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test14()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -130456;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test15()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 215641;
		Integer tipoVal11 = -784140;
		Integer skuVal11 = 728696;
		Integer unidadeVal11 = 805944;
		Integer quantidadeVal11 = 705967;
		Integer descricaoVal11 = -266245;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test16()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -266245;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test17()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -428487;
		Integer tipoVal1 = 967516;
		Integer skuVal1 = 306110;
		Integer unidadeVal1 = 971601;
		Integer quantidadeVal1 = 640912;
		Integer descricaoVal1 = -286550;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test18()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -286550;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test19()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 287099;
		Integer tipoVal1 = -55055;
		Integer skuVal1 = 848720;
		Integer unidadeVal1 = 835572;
		Integer quantidadeVal1 = 35319;
		Integer descricaoVal1 = -447960;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test20()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -447960;
		Boolean incluirVal1 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, descricaoVal1, tipoVal1, skuVal1, unidadeVal1, quantidadeVal1, incluirVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal1.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test21()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 975414;
		Integer tipoVal11 = 838391;
		Integer skuVal11 = 779975;
		Integer unidadeVal11 = 625124;
		Integer quantidadeVal11 = -480296;
		Integer descricaoVal11 = -21896;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test22()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -21896;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test23()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 341426;
		Integer tipoVal11 = 623152;
		Integer skuVal11 = -49853;
		Integer unidadeVal11 = 912946;
		Integer quantidadeVal11 = 670304;
		Integer descricaoVal11 = 173002;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test24()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 173002;
		Boolean incluirVal11 = true;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, descricaoVal11, tipoVal11, skuVal11, unidadeVal11, quantidadeVal11, incluirVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.sku.intValue() == skuVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.incluir.booleanValue() == incluirVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		assertEquals(true, (oTestObject.tipo.intValue() > 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
}