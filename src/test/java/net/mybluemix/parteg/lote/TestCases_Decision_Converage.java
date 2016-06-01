package net.mybluemix.parteg.lote;

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
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 455374;
		Integer materiaPrimaVal11 = 405453;
		Integer quantidadeVal11 = 663908;
		Integer unidadeVal11 = 206074;
		Integer precoVal11 = 96198;
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
		Integer fornecedorVal11 = 212235;
		Integer materiaPrimaVal11 = 690339;
		Integer quantidadeVal11 = 531484;
		Integer unidadeVal11 = 951836;
		Integer precoVal11 = -69459;
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
	public void test4()
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
	public void test5()
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
		
	}
	
	@Test
	public void test6()
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
		
	}
	
	@Test
	public void test7()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal7 = 217320;
		Integer materiaPrimaVal7 = -7472;
		Integer quantidadeVal7 = -192103;
		Integer unidadeVal7 = -190529;
		Integer precoVal7 = 743988;
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
	public void test8()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal9 = 406402;
		Integer materiaPrimaVal9 = -208669;
		Integer quantidadeVal9 = 578358;
		Integer unidadeVal9 = 28307;
		Integer precoVal9 = -97674;
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
	public void test9()
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
	public void test10()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal11 = 4367;
		Integer materiaPrimaVal11 = -76322;
		Integer quantidadeVal11 = -40083;
		Integer unidadeVal11 = -201543;
		Integer precoVal11 = -382944;
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
	public void test11()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
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
		
	}
	
	@Test
	public void test12()
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
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.finalizados));
		
	}
	
	@Test
	public void test13()
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
	public void test14()
	{
		Lote oTestObject = new Lote();
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		
	}
	
	@Test
	public void test15()
	{
		Lote oTestObject = new Lote();
		Integer fornecedorVal1 = 29236;
		Integer materiaPrimaVal1 = -430511;
		Integer quantidadeVal1 = -218973;
		Integer unidadeVal1 = 259771;
		Integer precoVal1 = -30568;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal1, materiaPrimaVal1, quantidadeVal1, unidadeVal1, precoVal1);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}