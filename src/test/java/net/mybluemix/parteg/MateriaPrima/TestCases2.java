package MateriaPrimaPk;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCases2{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCases2.class);
	}
	
	@Test
	public void test1()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal1 = -387100;
		Integer tipoVal1 = 55883;
		Integer descricaoVal1 = 9707;
		Integer unidadeVal1 = -36058;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, tipoVal1, descricaoVal1, unidadeVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test2()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal1 = 0;
		Integer tipoVal1 = 55883;
		Integer descricaoVal1 = 9707;
		Integer unidadeVal1 = -36058;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, tipoVal1, descricaoVal1, unidadeVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.cadastrando));
		
	}
	
	@Test
	public void test3()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal11 = 159772;
		Integer tipoVal11 = 184021;
		Integer descricaoVal11 = 83422;
		Integer unidadeVal11 = 275973;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, tipoVal11, descricaoVal11, unidadeVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test4()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal11 = 1;
		Integer tipoVal11 = 184021;
		Integer descricaoVal11 = 83422;
		Integer unidadeVal11 = 275973;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, tipoVal11, descricaoVal11, unidadeVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test5()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal11 = -17796;
		Integer tipoVal11 = 129995;
		Integer descricaoVal11 = -15679;
		Integer unidadeVal11 = -130635;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, tipoVal11, descricaoVal11, unidadeVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test6()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal11 = 0;
		Integer tipoVal11 = 129995;
		Integer descricaoVal11 = -15679;
		Integer unidadeVal11 = -130635;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("alterarEvent", nomeVal11, tipoVal11, descricaoVal11, unidadeVal11);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal11.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal11.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal11.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal11.intValue()));
		assertEquals(true, (oTestObject.state == State.alterando));
		assertEquals(true, (oTestObject.nome.intValue() <= 0));
		oTestObject.handleEvent("fazerAlteracoesEvent");
		assertEquals(true, (oTestObject.state == State.alterando));
		
	}
	
	@Test
	public void test7()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal1 = 176219;
		Integer tipoVal1 = -638995;
		Integer descricaoVal1 = -341438;
		Integer unidadeVal1 = 53586;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, tipoVal1, descricaoVal1, unidadeVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
	@Test
	public void test8()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = -638995;
		Integer descricaoVal1 = -341438;
		Integer unidadeVal1 = 53586;
		assertEquals(true, (oTestObject.state == State.mostrando));
		oTestObject.handleEvent("cadastrarEvent", nomeVal1, tipoVal1, descricaoVal1, unidadeVal1);
		assertEquals(true, (oTestObject.nome.intValue() == nomeVal1.intValue()));
		assertEquals(true, (oTestObject.tipo.intValue() == tipoVal1.intValue()));
		assertEquals(true, (oTestObject.descricao.intValue() == descricaoVal1.intValue()));
		assertEquals(true, (oTestObject.unidade.intValue() == unidadeVal1.intValue()));
		assertEquals(true, (oTestObject.state == State.cadastrando));
		assertEquals(true, (oTestObject.nome.intValue() > 0));
		oTestObject.handleEvent("fazerCadastroEvent");
		assertEquals(true, (oTestObject.state == State.mostrando));
		
	}
	
}