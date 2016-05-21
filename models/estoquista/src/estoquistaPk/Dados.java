package estoquistaPk;

import java.util.Random;

public class Dados implements AdapterInterfaceDados {

	 
	@Override
	public String dado_cnpj(Integer cnpj) {
		String cnpjOk = getcnpjAleatoria (cnpj);
		return cnpjOk;
	}


	@Override
	public String dado_nome(Integer nome) {
		String nomeOk = getNomeAleatoria (nome);
		if (nome > 0)   		return nomeOk;
		else         		    return " ";
	}


	@Override
	public String dado_email(Integer email) {
		String emailOk = getEmailAleatoria (email);
		return emailOk;
	}

	
	@Override
	public String dado_telefone(Integer telefone) {
		String telefoneOk = getTelefoneAleatoria (telefone);
		return telefoneOk;
	}

	

	@Override
	public Integer dado_prazoEntregaDias(Integer prazoEntregaDias) {
		String prazoEntregaDiasOk = getprazoEntregaDiasAleatoria (prazoEntregaDias);
		Integer	numeroDias = Integer.parseInt(prazoEntregaDiasOk);
		return numeroDias;
	}


	@Override
	public String dado_pais(Integer pais) {
		String paisOk = "Brasil";
		return paisOk;
	}
    
	
	@Override
	public String dado_estado(Integer estado) {
		String estadoOk = getEstadoAleatoria (estado);
		return estadoOk;
	}

	@Override
	public String dado_cidade(Integer cidade) {
		String cidadeOk = getCidadeAleatoria (cidade);
		return cidadeOk;
	}


	@Override
	public String dado_logradouro(Integer logradouro) {
		String logradouroOk = getLogradouroAleatoria (logradouro);
		return logradouroOk;
	}


	@Override
	public String dado_CEP(Integer CEP) {
		String CEPOk = getCEPAleatoria (CEP);
		return CEPOk;
	}
	
	
	
	
	
	
	// Get Varibales Aleatorias
	
	String getcnpjAleatoria (int cnpj){
		String cadenaAleatoria = "";
		long seed = cnpj;
		Random r = new Random(seed);
		int i = 0;
		while (i < 10){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	String getNomeAleatoria (int nome){
		String cadenaAleatoria = "";
		long seed = nome;
		Random r = new Random(seed);
		int i = 0;
		while (i < 8){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9') || (c >='a' && c <='z')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
    
	String getEmailAleatoria (int email){
		String cadenaAleatoria = "";
		long seed = email;
		Random r = new Random(seed);
		int i = 0;
		while (i < 7){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9') || (c >='a' && c <='z')){
		cadenaAleatoria += c;
		i ++;
		}}
		cadenaAleatoria += "@gmail.com";
		return cadenaAleatoria;
	}
	
	

	String getTelefoneAleatoria (int telefone){
		String cadenaAleatoria = "";
		long seed = telefone;
		Random r = new Random(seed);
		int i = 0;
		while (i < 12){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}

	String getprazoEntregaDiasAleatoria (int prazoEntregaDias){
		String cadenaAleatoria = "";
		long seed = prazoEntregaDias;
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


	String getEstadoAleatoria (int estado){
		String cadenaAleatoria = "";
		long seed = estado;
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
	
	String getCidadeAleatoria (int cidade){
		String cadenaAleatoria = "";
		long seed = cidade;
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
			
	
	String getLogradouroAleatoria (int logradouro){
		String cadenaAleatoria = "";
		long seed = logradouro;
		Random r = new Random(seed);
		int i = 0;
		while (i < 7){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9') || (c >='a' && c <='z')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	
	String getCEPAleatoria (int CEP){
		String cadenaAleatoria = "";
		long seed = CEP;
		Random r = new Random(seed);
		int i = 0;
		while (i < 5){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		cadenaAleatoria += "-";
		i = 0;
		while (i < 2){
		char c = (char)r.nextInt(255);
		if ((c >= '0' && c <='9')){
		cadenaAleatoria += c;
		i ++;
		}}
		return cadenaAleatoria;
	}
	
	
}
