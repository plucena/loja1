package MateriaPrimaPk;

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
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal1 = 319001;
		Integer tipoVal1 = -355380;
		Integer descricaoVal1 = -224978;
		Integer unidadeVal1 = -326253;
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
	public void test2()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal1 = 1;
		Integer tipoVal1 = -355380;
		Integer descricaoVal1 = -224978;
		Integer unidadeVal1 = -326253;
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
	public void test3()
	{
		MateriaPrima oTestObject = new MateriaPrima();
		Integer nomeVal11 = 972613;
		Integer tipoVal11 = 711655;
		Integer descricaoVal11 = -106192;
		Integer unidadeVal11 = -335120;
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
		Integer tipoVal11 = 711655;
		Integer descricaoVal11 = -106192;
		Integer unidadeVal11 = -335120;
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
	
}