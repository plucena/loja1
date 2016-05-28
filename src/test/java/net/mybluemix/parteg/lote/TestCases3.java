package net.mybluemix.parteg.lote;

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
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 348959;
		Integer materiaPrimaVal11 = 126033;
		Integer quantidadeVal11 = -126052;
		Integer unidadeVal11 = -835483;
		Integer precoVal11 = -761228;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test2()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test3()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 376622;
		Integer materiaPrimaVal11 = -359787;
		Integer quantidadeVal11 = 998224;
		Integer unidadeVal11 = -589608;
		Integer precoVal11 = 28100;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
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
		Integer fornecedorVal11 = 375270;
		Integer materiaPrimaVal11 = 27005;
		Integer quantidadeVal11 = -468143;
		Integer unidadeVal11 = 863917;
		Integer precoVal11 = -944464;
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
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test6()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test7()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -218942;
		Integer materiaPrimaVal11 = -441266;
		Integer quantidadeVal11 = -233704;
		Integer unidadeVal11 = 406622;
		Integer precoVal11 = -730235;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test8()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test9()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -714299;
		Integer materiaPrimaVal11 = -875614;
		Integer quantidadeVal11 = -933672;
		Integer unidadeVal11 = 601436;
		Integer precoVal11 = 439946;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
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
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
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
		Integer fornecedorVal11 = -700223;
		Integer materiaPrimaVal11 = -332361;
		Integer quantidadeVal11 = -144783;
		Integer unidadeVal11 = -888737;
		Integer precoVal11 = -24772;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
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
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test13()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -928031;
		Integer materiaPrimaVal11 = 515180;
		Integer quantidadeVal11 = 371824;
		Integer unidadeVal11 = -781824;
		Integer precoVal11 = -113338;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test14()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test15()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 515455;
		Integer materiaPrimaVal11 = 401191;
		Integer quantidadeVal11 = 633536;
		Integer unidadeVal11 = 267690;
		Integer precoVal11 = -774188;
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
	public void test16()
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
	public void test17()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -391034;
		Integer materiaPrimaVal11 = -25240;
		Integer quantidadeVal11 = 885923;
		Integer unidadeVal11 = 820688;
		Integer precoVal11 = 25668;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test18()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test19()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -11457;
		Integer materiaPrimaVal11 = 828234;
		Integer quantidadeVal11 = 887931;
		Integer unidadeVal11 = 577651;
		Integer precoVal11 = -350888;
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
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test20()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test21()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 377070;
		Integer materiaPrimaVal11 = 367943;
		Integer quantidadeVal11 = 679134;
		Integer unidadeVal11 = 513866;
		Integer precoVal11 = 860982;
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
	public void test22()
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
	public void test23()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -651292;
		Integer materiaPrimaVal11 = 313271;
		Integer quantidadeVal11 = -633798;
		Integer unidadeVal11 = 177147;
		Integer precoVal11 = 2992;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test24()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test25()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 416505;
		Integer materiaPrimaVal11 = -753871;
		Integer quantidadeVal11 = 73129;
		Integer unidadeVal11 = 400176;
		Integer precoVal11 = -287538;
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
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test26()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test27()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -721814;
		Integer materiaPrimaVal11 = -875751;
		Integer quantidadeVal11 = 929654;
		Integer unidadeVal11 = -501742;
		Integer precoVal11 = -200310;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test28()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test29()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -392584;
		Integer materiaPrimaVal11 = 282766;
		Integer quantidadeVal11 = 540372;
		Integer unidadeVal11 = -45892;
		Integer precoVal11 = 354967;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test30()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test31()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 958334;
		Integer materiaPrimaVal11 = 463893;
		Integer quantidadeVal11 = 177267;
		Integer unidadeVal11 = -363519;
		Integer precoVal11 = -479826;
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
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test32()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test33()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -782349;
		Integer materiaPrimaVal11 = 968715;
		Integer quantidadeVal11 = -638473;
		Integer unidadeVal11 = -68624;
		Integer precoVal11 = -145097;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test34()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test35()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 525192;
		Integer materiaPrimaVal11 = -180634;
		Integer quantidadeVal11 = -497737;
		Integer unidadeVal11 = 944216;
		Integer precoVal11 = -717086;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test36()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test37()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 316049;
		Integer materiaPrimaVal11 = -566361;
		Integer quantidadeVal11 = -574012;
		Integer unidadeVal11 = -86492;
		Integer precoVal11 = -286685;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test38()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 0;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test39()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 271360;
		Integer materiaPrimaVal11 = -532925;
		Integer quantidadeVal11 = -384275;
		Integer unidadeVal11 = 56666;
		Integer precoVal11 = 741617;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test40()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test41()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 415072;
		Integer materiaPrimaVal11 = -46392;
		Integer quantidadeVal11 = 886669;
		Integer unidadeVal11 = 258296;
		Integer precoVal11 = 612926;
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
	public void test42()
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
	public void test43()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -138872;
		Integer materiaPrimaVal11 = -483117;
		Integer quantidadeVal11 = 672725;
		Integer unidadeVal11 = -147168;
		Integer precoVal11 = 878591;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test44()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test45()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 996265;
		Integer materiaPrimaVal11 = 113682;
		Integer quantidadeVal11 = -369602;
		Integer unidadeVal11 = 94538;
		Integer precoVal11 = 941984;
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
	public void test46()
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
	public void test47()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 439414;
		Integer materiaPrimaVal11 = -349278;
		Integer quantidadeVal11 = -445409;
		Integer unidadeVal11 = -679530;
		Integer precoVal11 = 626670;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test48()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test49()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 492221;
		Integer materiaPrimaVal11 = -388158;
		Integer quantidadeVal11 = 303278;
		Integer unidadeVal11 = -380313;
		Integer precoVal11 = -996005;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test50()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 1;
		Integer unidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test51()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -305333;
		Integer materiaPrimaVal11 = -181953;
		Integer quantidadeVal11 = -412563;
		Integer unidadeVal11 = -110644;
		Integer precoVal11 = 73195;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test52()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test53()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -127824;
		Integer materiaPrimaVal11 = -766939;
		Integer quantidadeVal11 = 403576;
		Integer unidadeVal11 = 775256;
		Integer precoVal11 = -941966;
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
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test54()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() <= 0));
		assertEquals(true, (oTestObject.quantidade.intValue() > 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test55()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -691982;
		Integer materiaPrimaVal11 = 727991;
		Integer quantidadeVal11 = -390373;
		Integer unidadeVal11 = 959177;
		Integer precoVal11 = -162710;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test56()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() > 0));
		assertEquals(true, (oTestObject.preco.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test57()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 812710;
		Integer materiaPrimaVal11 = 768719;
		Integer quantidadeVal11 = 127598;
		Integer unidadeVal11 = -255345;
		Integer precoVal11 = 611180;
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
	public void test58()
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
	public void test59()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -733296;
		Integer materiaPrimaVal11 = 604627;
		Integer quantidadeVal11 = 683892;
		Integer unidadeVal11 = 68490;
		Integer precoVal11 = 847907;
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
	public void test60()
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
	public void test61()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = -812512;
		Integer materiaPrimaVal11 = 902262;
		Integer quantidadeVal11 = -464939;
		Integer unidadeVal11 = -415194;
		Integer precoVal11 = 558344;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test62()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 0;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.fornecedor.intValue() <= 0));
		assertEquals(true, (oTestObject.materiaPrima.intValue() > 0));
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test63()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 156930;
		Integer materiaPrimaVal11 = 187229;
		Integer quantidadeVal11 = -951661;
		Integer unidadeVal11 = -745098;
		Integer precoVal11 = 825957;
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
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test64()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 1;
		Integer materiaPrimaVal11 = 1;
		Integer quantidadeVal11 = 0;
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
		assertEquals(true, (oTestObject.quantidade.intValue() <= 0));
		assertEquals(true, (oTestObject.unidade.intValue() <= 0));
		assertEquals(true, (oTestObject.preco.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test65()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal7 = -495648;
		Integer materiaPrimaVal7 = 211222;
		Integer quantidadeVal7 = 23066;
		Integer unidadeVal7 = 371499;
		Integer precoVal7 = 398260;
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
	public void test66()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal9 = -151492;
		Integer materiaPrimaVal9 = 283644;
		Integer quantidadeVal9 = 99369;
		Integer unidadeVal9 = -194533;
		Integer precoVal9 = 12043;
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
	public void test67()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal11 = 261000;
		Integer materiaPrimaVal11 = 14552;
		Integer quantidadeVal11 = 374234;
		Integer unidadeVal11 = 22286;
		Integer precoVal11 = 553493;
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
	public void test68()
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
	public void test69()
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
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test70()
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
		assertEquals(true, (oTestObject.next.booleanValue() != true));
		assertEquals(true, (oTestObject.status.intValue() > 4));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test71()
	{
		Lote oTestObject = new Lote();
		Boolean cancelVal1 = false;
		Boolean nextVal1 = true;
		Boolean nextVal5 = true;
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
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() < 3));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() == false));
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test72()
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
		oTestObject.handleEvent("alterarFinalizadosEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.status.intValue() > 3));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() == 4));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		
	}
	
	@Test
	public void test73()
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
	public void test74()
	{
		Lote oTestObject = new Lote();
		Boolean cancelVal1 = true;
		Boolean nextVal1 = true;
		Boolean nextVal11 = true;
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
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() < 3));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
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
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.cancel.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() > 1));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test75()
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
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.cancelados));
		
	}
	
	@Test
	public void test76()
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
	public void test77()
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
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		
	}
	
	@Test
	public void test78()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Boolean nextVal9 = true;
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
		assertEquals(true, (oTestObject.status.intValue() == 3));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() < 4));
		assertEquals(true, (oTestObject.status.intValue() == 3));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		
	}
	
	@Test
	public void test79()
	{
		Lote oTestObject = new Lote();
		Boolean cancelVal1 = true;
		Boolean nextVal1 = true;
		Boolean nextVal11 = true;
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
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() == true));
		assertEquals(true, (oTestObject.status.intValue() < 3));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		assertEquals(true, (oTestObject.cancel.booleanValue() != false));
		assertEquals(true, (oTestObject.status.intValue() == 2));
		assertEquals(true, (oTestObject.next.booleanValue() != false));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.emProducao));
		
	}
	
	@Test
	public void test80()
	{
		Lote oTestObject = new Lote();
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		
	}
	
	@Test
	public void test81()
	{
		Lote oTestObject = new Lote();
		Integer fornecedorVal1 = 667387;
		Integer materiaPrimaVal1 = -749703;
		Integer quantidadeVal1 = -294951;
		Integer unidadeVal1 = -312791;
		Integer precoVal1 = -308417;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal1, materiaPrimaVal1, quantidadeVal1, unidadeVal1, precoVal1);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}