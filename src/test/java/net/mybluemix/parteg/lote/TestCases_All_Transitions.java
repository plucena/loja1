package net.mybluemix.parteg.lote;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// JUnit 4.3
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCases_All_Transitions{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases_All_Transitions.class);
	}
	
	@Test
	public void test1()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = false;
		Integer fornecedorVal11 = 394949;
		Integer materiaPrimaVal11 = 635605;
		Integer quantidadeVal11 = 638785;
		Integer unidadeVal11 = 342988;
		Integer precoVal11 = 799974;
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
	public void test4()
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
	public void test5()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal7 = -2717;
		Integer materiaPrimaVal7 = -31299;
		Integer quantidadeVal7 = -152565;
		Integer unidadeVal7 = -389436;
		Integer precoVal7 = 713453;
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
	public void test6()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal9 = -35019;
		Integer materiaPrimaVal9 = -166113;
		Integer quantidadeVal9 = -5860;
		Integer unidadeVal9 = 83506;
		Integer precoVal9 = -105445;
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
	public void test7()
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
	public void test8()
	{
		Lote oTestObject = new Lote();
		Boolean nextVal1 = true;
		Boolean cancelVal1 = true;
		Integer fornecedorVal11 = 69286;
		Integer materiaPrimaVal11 = -145255;
		Integer quantidadeVal11 = -231805;
		Integer unidadeVal11 = -812111;
		Integer precoVal11 = -306320;
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
	public void test9()
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
	public void test10()
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
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("mostrarEmEstoqueEvent");
		assertEquals(true, (oTestObject.state == State.emEstoque));
		
	}
	
	
	@Test
	public void test13()
	{
		Lote oTestObject = new Lote();
		Integer fornecedorVal1 = 401974;
		Integer materiaPrimaVal1 = -743581;
		Integer quantidadeVal1 = 235999;
		Integer unidadeVal1 = 418608;
		Integer precoVal1 = -602305;
		assertEquals(true, (oTestObject.state == State.encomendados));
		oTestObject.handleEvent("cadastrarEvent", fornecedorVal1, materiaPrimaVal1, quantidadeVal1, unidadeVal1, precoVal1);
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
}