package net.mybluemix.parteg.materiaprima;

import java.util.Random;

public class Dados implements AdapterInterfaceDados{

	@Override
	public String dado_nome(Integer nome) {
		String nomeOk = getNomeAleatoria (nome);
		return nomeOk;
	}

	@Override
	public String dado_tipo(Integer tipo) {
		String tipoOk = getTipoAleatoria (tipo);
		return tipoOk;
	}

	@Override
	public String dado_descricao(Integer descricao) {
		String descricaoOk = getDescricaoAleatoria (descricao);
		return descricaoOk;
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
	
	
}
