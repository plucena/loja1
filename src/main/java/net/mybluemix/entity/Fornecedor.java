package net.mybluemix.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@XmlRootElement

public class Fornecedor {
	
	@Id
	public String  CNPJ;
	public String nome;
	public String email;
	public String telefone;
	public int PrazoEntregaDias;
	public String Endereco_Pais;
	public String Endereco_Estado;
	public String Endereco_Cidade;
	public String Endereco_Logradouro;
	public String Endereco_CEP;
	
    
	public String getCNPJ() {
		return CNPJ;
	}
	
    public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
    public String getNome() {
		return nome;
	}
	
    public void setNome(String nome) {
		this.nome = nome;
	}
	
    public String getEmail() {
		return email;
	}
	
    public void setEmail(String email) {
		this.email = email;
	}
	
    public String getTelefone() {
		return telefone;
	}
	
    
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    public int getPrazoEntregaDias() {
		return PrazoEntregaDias;
	}
	
    public void setPrazoEntregaDias(int prazoEntregaDias) {
		PrazoEntregaDias = prazoEntregaDias;
	}
	
    public String getEndereco_Pais() {
		return Endereco_Pais;
	}
	
    public void setEndereco_Pais(String endereco_Pais) {
		Endereco_Pais = endereco_Pais;
	}
	
	public String getEndereco_Estado() {
		return Endereco_Estado;
	}
	
    public void setEndereco_Estado(String endereco_Estado) {
		Endereco_Estado = endereco_Estado;
	}
	
    public String getEndereco_Cidade() {
		return Endereco_Cidade;
	}
	
    
	public void setEndereco_Cidade(String endereco_Cidade) {
		Endereco_Cidade = endereco_Cidade;
	}
	
	public String getEndereco_Logradouro() {
		return Endereco_Logradouro;
	}
	
	public void setEndereco_Logradouro(String endereco_Logradouro) {
		Endereco_Logradouro = endereco_Logradouro;
	}
	
	public String getEndereco_CEP() {
		return Endereco_CEP;
	}
    
	public void setEndereco_CEP(String endereco_CEP) {
		Endereco_CEP = endereco_CEP;
	}
	
	
}
