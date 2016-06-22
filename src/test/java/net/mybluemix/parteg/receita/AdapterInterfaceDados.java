package net.mybluemix.parteg.receita;


public interface AdapterInterfaceDados  {

	String  dado_nome(Integer nome);
	String  dado_descricao(Integer descricao);
	String  dado_tipo(Integer tipo);
	Integer  dado_sku(Integer sku);
    String  dado_unidade(Integer unidade);
    Integer  dado_quantidade(Integer quantidade);
    Integer  dado_sku2(Integer sku, Boolean incluir);
    String  dado_unidade2(Integer unidade, Boolean incluir);
    Integer  dado_quantidade2(Integer quantidade, Boolean incluir);
	
	
}
