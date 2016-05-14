package estoquistaPk;

public interface AdapterInterface {
	
	boolean cadastrarEvent(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,  Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade, Integer endereco_Logradouro, Integer endereco_CEP);
	
	boolean fazerCadastroAtivosEvent();
	
	boolean fazerCadastroInativosEvent();
	
	boolean alterarEvent(Boolean ativo, Integer cnpj, Integer nome, Integer email, Integer telefone,  Integer prazoEntregaDias, Integer endereco_Pais, Integer endereco_Estado, Integer endereco_Cidade, Integer endereco_Logradouro, Integer endereco_CEP);
	
	boolean fazerAlteracoesAtivosEvent();
	
	boolean fazerAlteracoesInativosEvent();
	
	boolean mostrarInativosEvent();
	
	boolean mostrarAtivosEvent();
	

}
