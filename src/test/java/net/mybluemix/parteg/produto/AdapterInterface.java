package net.mybluemix.parteg.produto;

public interface AdapterInterface {

	Boolean cadastrarEvent(String receita, String preco);

	Boolean fazerCadastroEvent();

	Boolean alterarEmProducaoEvent(Boolean next);

	Boolean alterarEmEstoqueEvent(Boolean next);

	Boolean fazerAlteracoesEvent();

	Boolean mostrarEmProducaoEvent();

	Boolean mostrarEmEstoqueEvent();

}
