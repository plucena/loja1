package net.mybluemix.parteg.receita;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases_Multiple_Condition_Converage{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_Multiple_Condition_Converage.class);
	}
	
	@Test
	public void test1()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 849040;
		Integer tipoVal1 = 900565;
		Integer skuVal1 = -694804;
		Integer unidadeVal1 = 586743;
		Integer quantidadeVal1 = 705996;
		Integer descricaoVal1 = -18175;
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
	public void test2()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -18175;
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
	public void test3()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -968150;
		Integer tipoVal11 = 705083;
		Integer skuVal11 = -9544;
		Integer unidadeVal11 = 559563;
		Integer quantidadeVal11 = -493774;
		Integer descricaoVal11 = -490098;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test4()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -490098;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test5()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 605200;
		Integer tipoVal1 = -964968;
		Integer skuVal1 = -811407;
		Integer unidadeVal1 = -832002;
		Integer quantidadeVal1 = 468452;
		Integer descricaoVal1 = -344506;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test6()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -344506;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test7()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -17389;
		Integer tipoVal1 = -559041;
		Integer skuVal1 = 704948;
		Integer unidadeVal1 = 190561;
		Integer quantidadeVal1 = 926536;
		Integer descricaoVal1 = -35551;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test8()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -35551;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test9()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 275171;
		Integer tipoVal11 = -918697;
		Integer skuVal11 = 670283;
		Integer unidadeVal11 = 209702;
		Integer quantidadeVal11 = -777458;
		Integer descricaoVal11 = 332912;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test10()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 332912;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test11()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 551108;
		Integer tipoVal1 = -689201;
		Integer skuVal1 = 517109;
		Integer unidadeVal1 = -481771;
		Integer quantidadeVal1 = -309937;
		Integer descricaoVal1 = 231459;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test12()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 231459;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test13()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 484585;
		Integer tipoVal11 = -417132;
		Integer skuVal11 = -70100;
		Integer unidadeVal11 = 406333;
		Integer quantidadeVal11 = -194871;
		Integer descricaoVal11 = -51166;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test14()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -51166;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test15()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -180898;
		Integer tipoVal11 = 429906;
		Integer skuVal11 = 311122;
		Integer unidadeVal11 = 887803;
		Integer quantidadeVal11 = 392208;
		Integer descricaoVal11 = -247458;
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
	public void test16()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -247458;
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
	public void test17()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -106569;
		Integer tipoVal11 = 787140;
		Integer skuVal11 = 459262;
		Integer unidadeVal11 = 23871;
		Integer quantidadeVal11 = -979659;
		Integer descricaoVal11 = 215056;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test18()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 215056;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test19()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -254821;
		Integer tipoVal11 = 62007;
		Integer skuVal11 = -94591;
		Integer unidadeVal11 = 116235;
		Integer quantidadeVal11 = 334834;
		Integer descricaoVal11 = 71759;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test20()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 71759;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test21()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -959877;
		Integer tipoVal1 = -198276;
		Integer skuVal1 = -106903;
		Integer unidadeVal1 = 500357;
		Integer quantidadeVal1 = 637809;
		Integer descricaoVal1 = -282826;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test22()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -282826;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test23()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -288445;
		Integer tipoVal1 = 908266;
		Integer skuVal1 = -94535;
		Integer unidadeVal1 = 234476;
		Integer quantidadeVal1 = -495771;
		Integer descricaoVal1 = -44034;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test24()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -44034;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test25()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -163475;
		Integer tipoVal1 = -766609;
		Integer skuVal1 = 82380;
		Integer unidadeVal1 = -54949;
		Integer quantidadeVal1 = -496278;
		Integer descricaoVal1 = -242952;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test26()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -242952;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test27()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -336143;
		Integer tipoVal11 = -512714;
		Integer skuVal11 = -92455;
		Integer unidadeVal11 = -39318;
		Integer quantidadeVal11 = -929329;
		Integer descricaoVal11 = 27047;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test28()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 27047;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test29()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -349703;
		Integer tipoVal11 = 632029;
		Integer skuVal11 = -969731;
		Integer unidadeVal11 = -395784;
		Integer quantidadeVal11 = 593932;
		Integer descricaoVal11 = -43612;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test30()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -43612;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test31()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -941771;
		Integer tipoVal1 = 287947;
		Integer skuVal1 = 667375;
		Integer unidadeVal1 = 219702;
		Integer quantidadeVal1 = 353082;
		Integer descricaoVal1 = 23489;
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
	public void test32()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 23489;
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
	public void test33()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 136183;
		Integer tipoVal1 = 681590;
		Integer skuVal1 = 599022;
		Integer unidadeVal1 = -606615;
		Integer quantidadeVal1 = 43131;
		Integer descricaoVal1 = -291297;
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
	public void test34()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -291297;
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
	public void test35()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -914666;
		Integer tipoVal1 = 547489;
		Integer skuVal1 = 416904;
		Integer unidadeVal1 = 123118;
		Integer quantidadeVal1 = -720812;
		Integer descricaoVal1 = 697176;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test36()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 697176;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test37()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -387880;
		Integer tipoVal11 = 750946;
		Integer skuVal11 = 735696;
		Integer unidadeVal11 = -449520;
		Integer quantidadeVal11 = -772954;
		Integer descricaoVal11 = 570905;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test38()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 570905;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test39()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 523654;
		Integer tipoVal11 = 821775;
		Integer skuVal11 = -209991;
		Integer unidadeVal11 = 755032;
		Integer quantidadeVal11 = -342570;
		Integer descricaoVal11 = 24466;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test40()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 24466;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test41()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 56942;
		Integer tipoVal11 = 657774;
		Integer skuVal11 = -656338;
		Integer unidadeVal11 = 418621;
		Integer quantidadeVal11 = 315902;
		Integer descricaoVal11 = -95444;
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
	public void test42()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -95444;
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
	public void test43()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 511795;
		Integer tipoVal11 = -508842;
		Integer skuVal11 = -120803;
		Integer unidadeVal11 = -790537;
		Integer quantidadeVal11 = -701338;
		Integer descricaoVal11 = 111005;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test44()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 111005;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test45()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 512291;
		Integer tipoVal11 = 487716;
		Integer skuVal11 = 98949;
		Integer unidadeVal11 = -357561;
		Integer quantidadeVal11 = -402648;
		Integer descricaoVal11 = -162716;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test46()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -162716;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test47()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 569201;
		Integer tipoVal11 = 197551;
		Integer skuVal11 = 636797;
		Integer unidadeVal11 = 380539;
		Integer quantidadeVal11 = -548795;
		Integer descricaoVal11 = -173225;
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
	public void test48()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -173225;
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
	public void test49()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -958756;
		Integer tipoVal11 = 235178;
		Integer skuVal11 = -569020;
		Integer unidadeVal11 = -180460;
		Integer quantidadeVal11 = -423502;
		Integer descricaoVal11 = 384858;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test50()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 384858;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test51()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 390980;
		Integer tipoVal1 = 817268;
		Integer skuVal1 = -56525;
		Integer unidadeVal1 = -346244;
		Integer quantidadeVal1 = 443708;
		Integer descricaoVal1 = -48007;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test52()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -48007;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test53()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 727786;
		Integer tipoVal1 = -317174;
		Integer skuVal1 = -847050;
		Integer unidadeVal1 = 584757;
		Integer quantidadeVal1 = 956694;
		Integer descricaoVal1 = 383475;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test54()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 383475;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test55()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -624807;
		Integer tipoVal1 = -894928;
		Integer skuVal1 = -361287;
		Integer unidadeVal1 = -565878;
		Integer quantidadeVal1 = 257474;
		Integer descricaoVal1 = 83069;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test56()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 83069;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test57()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 303126;
		Integer tipoVal1 = 776893;
		Integer skuVal1 = 159553;
		Integer unidadeVal1 = 475423;
		Integer quantidadeVal1 = 323074;
		Integer descricaoVal1 = 199777;
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
	public void test58()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 199777;
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
	public void test59()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 863694;
		Integer tipoVal11 = 369197;
		Integer skuVal11 = 347770;
		Integer unidadeVal11 = -752614;
		Integer quantidadeVal11 = 879047;
		Integer descricaoVal11 = -291537;
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
	public void test60()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -291537;
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
	public void test61()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 876135;
		Integer tipoVal1 = 6813;
		Integer skuVal1 = 39804;
		Integer unidadeVal1 = -635671;
		Integer quantidadeVal1 = -442924;
		Integer descricaoVal1 = -187571;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test62()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -187571;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test63()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 132902;
		Integer tipoVal1 = 250452;
		Integer skuVal1 = -554870;
		Integer unidadeVal1 = 218174;
		Integer quantidadeVal1 = -602161;
		Integer descricaoVal1 = -182370;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test64()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -182370;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test65()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 387187;
		Integer tipoVal1 = 994127;
		Integer skuVal1 = -505947;
		Integer unidadeVal1 = -969549;
		Integer quantidadeVal1 = -181599;
		Integer descricaoVal1 = 287200;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test66()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 287200;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test67()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -743721;
		Integer tipoVal11 = -341228;
		Integer skuVal11 = 454673;
		Integer unidadeVal11 = -511282;
		Integer quantidadeVal11 = 470272;
		Integer descricaoVal11 = -99053;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test68()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -99053;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test69()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -176326;
		Integer tipoVal1 = 697583;
		Integer skuVal1 = 912876;
		Integer unidadeVal1 = -986358;
		Integer quantidadeVal1 = -770703;
		Integer descricaoVal1 = -281353;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test70()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -281353;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test71()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -941509;
		Integer tipoVal11 = -718675;
		Integer skuVal11 = -753402;
		Integer unidadeVal11 = -934062;
		Integer quantidadeVal11 = 827210;
		Integer descricaoVal11 = 376189;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test72()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 376189;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test73()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 169582;
		Integer tipoVal1 = -955880;
		Integer skuVal1 = -642314;
		Integer unidadeVal1 = 665434;
		Integer quantidadeVal1 = -497641;
		Integer descricaoVal1 = 878114;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test74()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 878114;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test75()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -925325;
		Integer tipoVal11 = -401720;
		Integer skuVal11 = 466408;
		Integer unidadeVal11 = 103537;
		Integer quantidadeVal11 = 879543;
		Integer descricaoVal11 = 333405;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test76()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 333405;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test77()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 698034;
		Integer tipoVal1 = -459943;
		Integer skuVal1 = 231330;
		Integer unidadeVal1 = -177167;
		Integer quantidadeVal1 = 796438;
		Integer descricaoVal1 = -51113;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test78()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -51113;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test79()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 478720;
		Integer tipoVal11 = -175917;
		Integer skuVal11 = -394490;
		Integer unidadeVal11 = 803800;
		Integer quantidadeVal11 = 969790;
		Integer descricaoVal11 = 141949;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test80()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 141949;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test81()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 573365;
		Integer tipoVal11 = -792556;
		Integer skuVal11 = 76017;
		Integer unidadeVal11 = -805812;
		Integer quantidadeVal11 = 545076;
		Integer descricaoVal11 = 122667;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test82()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 122667;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test83()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 150287;
		Integer tipoVal1 = -828500;
		Integer skuVal1 = 841886;
		Integer unidadeVal1 = 116700;
		Integer quantidadeVal1 = 651590;
		Integer descricaoVal1 = -248411;
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
	public void test84()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -248411;
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
	public void test85()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -670616;
		Integer tipoVal1 = 385139;
		Integer skuVal1 = -445951;
		Integer unidadeVal1 = -424326;
		Integer quantidadeVal1 = 519790;
		Integer descricaoVal1 = -400847;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test86()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -400847;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test87()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 133808;
		Integer tipoVal11 = -903163;
		Integer skuVal11 = 628695;
		Integer unidadeVal11 = -478457;
		Integer quantidadeVal11 = -553212;
		Integer descricaoVal11 = 4193;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test88()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 4193;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test89()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 257266;
		Integer tipoVal11 = 463851;
		Integer skuVal11 = -374123;
		Integer unidadeVal11 = -985931;
		Integer quantidadeVal11 = -522538;
		Integer descricaoVal11 = -715700;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test90()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -715700;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test91()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -772740;
		Integer tipoVal1 = 889055;
		Integer skuVal1 = -482619;
		Integer unidadeVal1 = 565253;
		Integer quantidadeVal1 = 382008;
		Integer descricaoVal1 = 608414;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test92()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = 608414;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test93()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -965201;
		Integer tipoVal11 = -993106;
		Integer skuVal11 = -151351;
		Integer unidadeVal11 = 602957;
		Integer quantidadeVal11 = -332634;
		Integer descricaoVal11 = -129930;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test94()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -129930;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test95()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 952817;
		Integer tipoVal1 = 422424;
		Integer skuVal1 = 753127;
		Integer unidadeVal1 = 390375;
		Integer quantidadeVal1 = -810385;
		Integer descricaoVal1 = -121034;
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
	public void test96()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -121034;
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
	public void test97()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -673253;
		Integer tipoVal11 = 171138;
		Integer skuVal11 = 617348;
		Integer unidadeVal11 = -750726;
		Integer quantidadeVal11 = 697448;
		Integer descricaoVal11 = 35035;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test98()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 35035;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test99()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -242888;
		Integer tipoVal1 = -454220;
		Integer skuVal1 = -532432;
		Integer unidadeVal1 = 506891;
		Integer quantidadeVal1 = -811595;
		Integer descricaoVal1 = 146761;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test100()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 146761;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test101()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 726458;
		Integer tipoVal11 = -651427;
		Integer skuVal11 = 63710;
		Integer unidadeVal11 = 766392;
		Integer quantidadeVal11 = 248929;
		Integer descricaoVal11 = -150295;
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
	public void test102()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -150295;
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
	public void test103()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -93185;
		Integer tipoVal11 = -446751;
		Integer skuVal11 = 897076;
		Integer unidadeVal11 = 34597;
		Integer quantidadeVal11 = -6197;
		Integer descricaoVal11 = -622439;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test104()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -622439;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test105()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -158482;
		Integer tipoVal1 = 961213;
		Integer skuVal1 = -228388;
		Integer unidadeVal1 = -382502;
		Integer quantidadeVal1 = -426225;
		Integer descricaoVal1 = 675383;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test106()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 675383;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test107()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -53897;
		Integer tipoVal11 = -385906;
		Integer skuVal11 = 762756;
		Integer unidadeVal11 = -498746;
		Integer quantidadeVal11 = -159585;
		Integer descricaoVal11 = 432330;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test108()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = 432330;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test109()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 349271;
		Integer tipoVal11 = 209925;
		Integer skuVal11 = 243400;
		Integer unidadeVal11 = 493946;
		Integer quantidadeVal11 = 411957;
		Integer descricaoVal11 = -51564;
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
	public void test110()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -51564;
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
	public void test111()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 3238;
		Integer tipoVal1 = -187883;
		Integer skuVal1 = 244221;
		Integer unidadeVal1 = 904688;
		Integer quantidadeVal1 = -576326;
		Integer descricaoVal1 = 112342;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test112()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 112342;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test113()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -794284;
		Integer tipoVal1 = -790246;
		Integer skuVal1 = -389449;
		Integer unidadeVal1 = -221589;
		Integer quantidadeVal1 = -654236;
		Integer descricaoVal1 = -109948;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test114()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = -109948;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test115()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -381820;
		Integer tipoVal1 = -954830;
		Integer skuVal1 = 448149;
		Integer unidadeVal1 = -778226;
		Integer quantidadeVal1 = 595449;
		Integer descricaoVal1 = -29893;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test116()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -29893;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test117()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = -323543;
		Integer tipoVal11 = -551858;
		Integer skuVal11 = -739737;
		Integer unidadeVal11 = 674091;
		Integer quantidadeVal11 = 965931;
		Integer descricaoVal11 = 85247;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test118()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = 85247;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test119()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 971090;
		Integer tipoVal11 = 19012;
		Integer skuVal11 = -123258;
		Integer unidadeVal11 = -43280;
		Integer quantidadeVal11 = 570312;
		Integer descricaoVal11 = -321444;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test120()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -321444;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test121()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -697306;
		Integer tipoVal1 = 954099;
		Integer skuVal1 = 804092;
		Integer unidadeVal1 = -563066;
		Integer quantidadeVal1 = 922080;
		Integer descricaoVal1 = -91808;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test122()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -91808;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test123()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = -866571;
		Integer tipoVal1 = -278309;
		Integer skuVal1 = 473708;
		Integer unidadeVal1 = 134594;
		Integer quantidadeVal1 = -327729;
		Integer descricaoVal1 = 552792;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test124()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 552792;
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
		assertEquals(true, (oTestObject.tipo.intValue() <= 0));
		assertEquals(true, (oTestObject.sku.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test125()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 760084;
		Integer tipoVal11 = -243727;
		Integer skuVal11 = -393265;
		Integer unidadeVal11 = -574511;
		Integer quantidadeVal11 = 418090;
		Integer descricaoVal11 = -571927;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test126()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 0;
		Integer skuVal11 = 0;
		Integer unidadeVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -571927;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test127()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 942172;
		Integer tipoVal1 = -594579;
		Integer skuVal1 = -483305;
		Integer unidadeVal1 = -508920;
		Integer quantidadeVal1 = -848738;
		Integer descricaoVal1 = 58395;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test128()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 0;
		Integer skuVal1 = 0;
		Integer unidadeVal1 = 0;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 58395;
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
		assertEquals(true, (oTestObject.sku.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}