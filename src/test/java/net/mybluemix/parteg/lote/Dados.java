package net.mybluemix.parteg.lote;

import java.util.Random;

public class Dados implements AdapterInterfaceDados{

	@Override
	public Integer dado_fornecedor(Integer fornecedor) {
		String fornecedorOk = getFornecedorAleatoria (fornecedor);
		Integer	fornacedorNum = Integer.parseInt(fornecedorOk);
		
		if (fornecedor > 0)   		return fornacedorNum;
		else         		        return null;
		
	}

	@Override
	public Integer dado_materiaPrima(Integer materiaPrima) {
		String materiaPrimaOk = getMateriaPrimaAleatoria (materiaPrima);
		Integer	materiaPrimaNum = Integer.parseInt(materiaPrimaOk);
		
		if (materiaPrima > 0)   	return materiaPrimaNum;
		else         		        return null;
		
	
	}

	@Override
	public Integer dado_quantidade(Integer quantidade) {
		String quantidadeOk = getQuantidadeAleatoria (quantidade);
		Integer	quantidadeNum = Integer.parseInt(quantidadeOk);

		if (quantidade > 0)   	return quantidadeNum;
		else         		    return null;
		
	}

	@Override
	public Integer dado_unidade(Integer unidade) {
		String unidadeOk = getUnidadeAleatoria (unidade);
		Integer	unidadeNum = Integer.parseInt(unidadeOk);

		if (unidade > 0)   		return unidadeNum;
		else         		    return null;
		
	}

	@Override
	public Integer dado_preco(Integer preco) {
		String precoOk = getPrecoAleatoria (preco);
		Integer	precoNum = Integer.parseInt(precoOk);

		if (preco > 0)   		return precoNum;
		else         		    return null;
		
	}

	
	
	String getFornecedorAleatoria (int fornecedor){
		String cadenaAleatoria = "";
		long seed = fornecedor;
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
	
	String getMateriaPrimaAleatoria (int materiaPrima){
		String cadenaAleatoria = "";
		long seed = materiaPrima;
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
	String getQuantidadeAleatoria (int quantidade){
		String cadenaAleatoria = "";
		long seed = quantidade;
		Random r = new Random(seed);
		int i = 0;
		while (i < 3){
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
	String getPrecoAleatoria (int preco){
		String cadenaAleatoria = "";
		long seed = preco;
		Random r = new Random(seed);
		int i = 0;
		while (i < 3){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
}

