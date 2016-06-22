package net.mybluemix.parteg.lote;

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
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 341779;
		Integer materiaPrimaVal11 = 814278;
		Integer quantidadeVal11 = 893585;
		Integer unidadeVal11 = 59778;
		Integer precoVal11 = 416345;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.encomendados));
		
	}
	
	@Test
	public void test2()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer precoVal11 = 1;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.encomendados));
		
	}
	
	@Test
	public void test3()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 939693;
		Integer materiaPrimaVal11 = -406142;
		Integer quantidadeVal11 = 364218;
		Integer unidadeVal11 = 529364;
		Integer precoVal11 = 368094;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test4()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer precoVal11 = 1;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test5()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -807185;
		Integer materiaPrimaVal11 = 109818;
		Integer quantidadeVal11 = 216894;
		Integer unidadeVal11 = 233475;
		Integer precoVal11 = 342227;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test6()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer precoVal11 = 1;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test7()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 666896;
		Integer materiaPrimaVal11 = 824801;
		Integer quantidadeVal11 = 484528;
		Integer unidadeVal11 = -882591;
		Integer precoVal11 = 671105;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test8()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 0;
		Integer precoVal11 = 1;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test9()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 366169;
		Integer materiaPrimaVal11 = 118940;
		Integer quantidadeVal11 = -410020;
		Integer unidadeVal11 = 81613;
		Integer precoVal11 = 731189;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test10()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer unidadeVal11 = 1;
		Integer precoVal11 = 1;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test11()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 210946;
		Integer materiaPrimaVal11 = 161;
		Integer quantidadeVal11 = 871975;
		Integer unidadeVal11 = 318814;
		Integer precoVal11 = -569278;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test12()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 1;
		Integer precoVal11 = 0;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.fornecedor.intValue() == fornecedorVal11.intValue()));
		assertEquals(true, (oTestObject.materiaPrima.intValue() == materiaPrimaVal11.intValue()));
		assertEquals(true, (oTestObject.quantidade.intValue() == quantidadeVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.preco.intValue() == precoVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.fornecedor.intValue() > 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test13()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal7 = 21970;
		Integer materiaPrimaVal7 = 1373;
		Integer quantidadeVal7 = 38986;
		Integer unidadeVal7 = -256318;
		Integer precoVal7 = -397621;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal7, materiaPrimaVal7, quantidadeVal7, unidadeVal7, precoVal7);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test14()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal9 = 639517;
		Integer materiaPrimaVal9 = -281937;
		Integer quantidadeVal9 = -425445;
		Integer unidadeVal9 = -2732;
		Integer precoVal9 = 140193;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal9, materiaPrimaVal9, quantidadeVal9, unidadeVal9, precoVal9);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test15()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal11 = -268815;
		Integer materiaPrimaVal11 = 287386;
		Integer quantidadeVal11 = -455266;
		Integer unidadeVal11 = -260069;
		Integer precoVal11 = -6049;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal11, materiaPrimaVal11, quantidadeVal11, unidadeVal11, precoVal11);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test16()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEncomendadosEvent");
		assertEquals(true, (oTestObject.state == State.encomendados));
		
	}
	
	@Test
	public void test17()
	{
		Lote oTestObject = new Lote();
		Boolean cancelVal1 = false;
		Boolean nextVal1 = true;
		Boolean nextVal5 = false;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("alterarEmEstoqueEvent", nextVal5);
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal5.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("alterarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 5));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		assertEquals(true, (oTestObject.cancel.booleanValue() != true));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() != true));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test18()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = false;
		Boolean cancelVal1 = false;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.encomendados));
		
	}
	
	@Test
	public void test19()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Boolean nextVal9 = false;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("alterarEmProducaoEvent", nextVal9);
		assertEquals(true, (oTestObject.status.intValue() == 3));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal9.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() > 2));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.status.intValue() == 3));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test20()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = false;
		Boolean cancelVal1 = true;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("alterarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() > 3));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.status.intValue() == 4));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		
	}
	
	@Test
	public void test21()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() < 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("alterarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 5));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() != true));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() > 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test22()
	{
		Lote oTestObject = new Lote();
		Boolean cancelVal1 = true;
		Boolean nextVal1 = true;
		Boolean nextVal11 = false;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("alterarEncomendadosEvent", nextVal1, cancelVal1);
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal1.booleanValue()));
		assertEquals(true, (oTestObject.cancel.booleanValue() == cancelVal1.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() < 5));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("alterarEmEstoqueEvent", nextVal11);
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == nextVal11.booleanValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() != false));
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		oTestObject.handleEvent("mostrarEmProducaoEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		oTestObject.handleEvent("mostrarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		oTestObject.handleEvent("mostrarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		oTestObject.handleEvent("alterarCanceladosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() == 5));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() == false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test23()
	{
		Lote oTestObject = new Lote();
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		
	}
	
	@Test
	public void test24()
	{
		Lote oTestObject = new Lote();
		Integer fornecedorVal1 = -115093;
		Integer materiaPrimaVal1 = 667816;
		Integer quantidadeVal1 = 78065;
		Integer unidadeVal1 = -541435;
		Integer precoVal1 = -590550;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal1, materiaPrimaVal1, quantidadeVal1, unidadeVal1, precoVal1);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}