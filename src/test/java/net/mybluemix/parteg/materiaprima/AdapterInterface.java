package net.mybluemix.parteg.materiaprima;

public interface AdapterInterface {
	
	boolean cadastrarEvent(Integer sku, String nome, String tipo, String descricao);
	
	boolean alterarEvent(Integer sku, String nome, String tipo, String descricao);
	
	boolean fazerCadastroEvent();
	
	boolean fazerAlteracoesEvent();
	

}
