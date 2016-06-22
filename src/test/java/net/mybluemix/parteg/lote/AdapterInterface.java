package net.mybluemix.parteg.lote;

public interface AdapterInterface {

	boolean cadastrarEvent(Integer fornecedores, Integer materiaPrima, Integer quantidade, Integer  unidade, Integer preco);
	boolean fazerCadastroEvent();
	boolean alterarEncomendadosEvent(Boolean next, Boolean cancel);
	boolean alterarEmEstoqueEvent(Boolean next);
	boolean alterarEmProducaoEvent(Boolean next);
	boolean alterarFinalizadosEvent();
	boolean alterarCanceladosEvent();
	boolean fazerAlteracoesEvent();
	boolean mostrarEncomendadosEvent();
	boolean mostrarEmEstoqueEvent();
	boolean mostrarEmProducaoEvent();
	boolean mostrarCanceladosEvent();
	boolean mostrarFinalizadosEvent();
	
}
