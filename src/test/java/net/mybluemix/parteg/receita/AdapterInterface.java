package net.mybluemix.parteg.receita;

public interface AdapterInterface {

	Boolean  cadastrarEvent(String nome, String descricao, String tipo, Integer sku, String unidade, Integer quantidade, Boolean incluir, Integer sku2, String unidade2, Integer quantidade2);
	Boolean  alterarEvent(String nome, String descricao, String tipo, Integer sku, String unidade, Integer quantidade, Boolean incluir, Integer sku2, String unidade2, Integer quantidade2);
	Boolean  fazerCadastroEvent();
	Boolean  fazerAlteracoesEvent();
	
}
