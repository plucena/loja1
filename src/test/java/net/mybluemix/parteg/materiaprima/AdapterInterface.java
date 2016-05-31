package net.mybluemix.parteg.materiaprima;

public interface AdapterInterface {
	
	boolean cadastrarEvent(String nome, String tipo, String descricao);
	
	boolean alterarEvent(String nome, String tipo, String descricao);
	
	boolean fazerCadastroEvent();
	
	boolean fazerAlteracoesEvent();
	

}
