package net.mybluemix.parteg.fornecedor;

public interface AdapterInterface {
	
	boolean cadastrarEvent(Boolean ativo, String cnpj, String nome, String email, String telefone,  Integer prazoEntregaDias, String endereco_Pais, Integer endereco_Estado, String endereco_Cidade, String endereco_Logradouro, String endereco_CEP);
	
	boolean fazerCadastroAtivosEvent();
	
	boolean fazerCadastroInativosEvent();
	
	boolean alterarEvent(Boolean ativo, String cnpj, String nome, String email, String telefone,  Integer prazoEntregaDias, String endereco_Pais, Integer endereco_Estado, String endereco_Cidade, String endereco_Logradouro, String endereco_CEP);
	
	boolean fazerAlteracoesAtivosEvent();
	
	boolean fazerAlteracoesInativosEvent();
	
	boolean mostrarInativosEvent();
	
	boolean mostrarAtivosEvent();
	

}
