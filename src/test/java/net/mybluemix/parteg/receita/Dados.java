package net.mybluemix.parteg.receita;

import java.util.Random;

public class Dados implements AdapterInterfaceDados {

	@Override
	public String dado_nome(Integer nome) {
		String nomeOk = getNomeAleatoria (nome);
		if (nome > 0)   		return nomeOk;
		else         		    return " ";
	}

	@Override
	public String dado_descricao(Integer descricao) {
		String descricaoOk = getDescricaoAleatoria (descricao);
		return descricaoOk;
	}

	@Override
	public String dado_tipo(Integer tipo) {
		String tipoOk = getTipoAleatoria (tipo);
		if (tipo > 0)   		return tipoOk;
		else         		    return " ";
	}

	@Override
	public Integer dado_sku(Integer sku) {
		String skuOk = getSKUAleatoria (sku);
		Integer	skuNum = Integer.parseInt(skuOk);
		if (sku > 0)   		return skuNum;
		else         		    return null;
	}

	@Override
	public String dado_unidade(Integer unidade) {
		String unidadeOk = getUnidadeAleatoria (unidade);
		if (unidade > 0)   		return unidadeOk;
		else         		    return " ";
		
	}

	@Override
	public Integer dado_quantidade(Integer quantidade) {
		String quantidadeOk = getQuantidadeAleatoria (quantidade);
		Integer	quantidadeNum = Integer.parseInt(quantidadeOk);
		if (quantidade > 0)   		return quantidadeNum;
		else  						return null;
	}
	
	@Override
	public Integer dado_sku2(Integer sku, Boolean incluir) {
		String skuOk = getSKUAleatoria (sku+10);
		Integer	skuNum = Integer.parseInt(skuOk);
		if (incluir == true)   	return skuNum;
		else         		    return null;
	}

	@Override
	public String dado_unidade2(Integer unidade, Boolean incluir) {
		String unidadeOk = getUnidadeAleatoria (unidade+10);
		if (incluir == true)   	return unidadeOk;
		else         		    return " ";
	}

	@Override
	public Integer dado_quantidade2(Integer quantidade, Boolean incluir) {
		String quantidadeOk = getQuantidadeAleatoria (quantidade+10);
		Integer	quantidadeNum = Integer.parseInt(quantidadeOk);
		if (incluir == true)   		return quantidadeNum;
		else  						return null;
	}
	
	String getNomeAleatoria (int nome){
		String cadenaAleatoria = "";
		long seed = nome;
		Random r = new Random(seed);
		int i = 0;
		while (i < 6){
		char c = (char)r.nextInt(255);
		if ((c >='a' && c <='z')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	String getDescricaoAleatoria (int descricao){
		String cadenaAleatoria = "";
		long seed = descricao;
		Random r = new Random(seed);
		int i = 0;
		while (i < 10){
		char c = (char)r.nextInt(255);
		if ((c >='a' && c <='z')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	String getTipoAleatoria (int tipo){
		String cadenaAleatoria = "";
		long seed = tipo;
		Random r = new Random(seed);
		int i = 0;
		while (i < 4){
		char c = (char)r.nextInt(255);
		if ((c >='a' && c <='z')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	String getSKUAleatoria (int sku){
		String cadenaAleatoria = "";
		long seed = sku;
		Random r = new Random(seed);
		int i = 0;
		while (i < 6){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	String getUnidadeAleatoria (int unidade){
		String cadenaAleatoria = "";
		long seed = unidade;
		Random r = new Random(seed);
		int i = 0;
		while (i < 1){
		char c = (char)r.nextInt(255);
		if ((c >= '1' && c <='3')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	String getQuantidadeAleatoria (int quantidade){
		String cadenaAleatoria = "";
		long seed = quantidade;
		Random r = new Random(seed);
		int i = 0;
		while (i < 2){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}

	

}
