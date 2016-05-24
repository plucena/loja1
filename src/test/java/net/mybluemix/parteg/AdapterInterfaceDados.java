package net.mybluemix.parteg;

public interface AdapterInterfaceDados {
	
	
	String dado_cnpj(Integer cnpj);
	String  dado_nome(Integer nome);
    String  dado_email(Integer email);
    String  dado_telefone(Integer telefone);
    Integer  dado_prazoEntregaDias(Integer prazoEntregaDias);
    String  dado_pais(Integer pais);
    Integer  dado_estado(Integer estado);
    String  dado_cidade(Integer cidade);
    String  dado_logradouro(Integer logradouro);
    String  dado_CEP(Integer CEP);
	
	

}
