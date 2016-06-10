package net.mybluemix.parteg.receita;

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
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 232055;
		Integer tipoVal1 = 650584;
		Integer skuVal1 = 491082;
		Integer unidadeVal1 = 116039;
		Integer quantidadeVal1 = -250831;
		Integer descricaoVal1 = 212099;
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
	public void test2()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 0;
		Integer descricaoVal1 = 212099;
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
	public void test3()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 557204;
		Integer tipoVal11 = 325670;
		Integer skuVal11 = 819267;
		Integer unidadeVal11 = 444418;
		Integer quantidadeVal11 = -958244;
		Integer descricaoVal11 = -66153;
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
	public void test4()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer descricaoVal11 = -66153;
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
	public void test5()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 315659;
		Integer tipoVal11 = 450547;
		Integer skuVal11 = 506037;
		Integer unidadeVal11 = 948094;
		Integer quantidadeVal11 = 195835;
		Integer descricaoVal11 = -105300;
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
	public void test6()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 1;
		Integer skuVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer descricaoVal11 = -105300;
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
	public void test7()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 195387;
		Integer tipoVal1 = 834999;
		Integer skuVal1 = 997373;
		Integer unidadeVal1 = 546315;
		Integer quantidadeVal1 = 207984;
		Integer descricaoVal1 = -440783;
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
	public void test8()
	{
		Receita oTestObject = new Receita();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = 1;
		Integer skuVal1 = 1;
		Integer unidadeVal1 = 1;
		Integer quantidadeVal1 = 1;
		Integer descricaoVal1 = -440783;
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
	
}