package MateriaPrimaPk;

public interface AdapterInterface {
	
	boolean cadastrarEvent(String nome, String tipo, String descricao, String unidade);
	
	boolean alterarEvent(String nome, String tipo, String descricao, String unidade);
	
	boolean fazerCadastroEvent();
	
	boolean fazerAlteracoesEvent();
	

}
