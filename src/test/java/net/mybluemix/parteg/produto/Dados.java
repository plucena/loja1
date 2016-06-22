package net.mybluemix.parteg.produto;

import java.util.Random;

public class Dados implements AdapterInterfaceDados {

	@Override
	public String dado_receita(Integer receita) {
		String receitaOk = getReceitaAleatoria (receita);
		if (receita > 0)   		return receitaOk;
		else         		    return " ";
	}

	@Override
	public String dado_preco(Integer preco) {
		String precoOk = getPrecoAleatoria (preco);
		if (preco > 0)   		return precoOk;
		else         		    return " ";
	}

	String getReceitaAleatoria (int receita){
		String cadenaAleatoria = "";
		long seed = receita;
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
	

	String getPrecoAleatoria (int preco){
		String cadenaAleatoria = "";
		long seed = preco;
		Random r = new Random(seed);
		int i = 0;
		while (i < 4){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	
}
