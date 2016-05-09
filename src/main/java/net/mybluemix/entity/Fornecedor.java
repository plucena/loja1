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
	
    @JsonProperty
	public String getCNPJ() {
		return CNPJ;
	}
	
    @JsonProperty
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
    @JsonProperty
	public String getNome() {
		return nome;
	}
	
    @JsonProperty
	public void setNome(String nome) {
		this.nome = nome;
	}
	
    @JsonProperty
	public String getEmail() {
		return email;
	}
	
    @JsonProperty
	public void setEmail(String email) {
		this.email = email;
	}
	
    @JsonProperty
	public String getTelefone() {
		return telefone;
	}
	
    @JsonProperty
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    @JsonProperty
	public int getPrazoEntregaDias() {
		return PrazoEntregaDias;
	}
	
    @JsonProperty
	public void setPrazoEntregaDias(int prazoEntregaDias) {
		PrazoEntregaDias = prazoEntregaDias;
	}
	
    @JsonProperty
	public String getEndereco_Pais() {
		return Endereco_Pais;
	}
	
    @JsonProperty
	public void setEndereco_Pais(String endereco_Pais) {
		Endereco_Pais = endereco_Pais;
	}
	
    @JsonProperty
	public String getEndereco_Estado() {
		return Endereco_Estado;
	}
	
    @JsonProperty
	public void setEndereco_Estado(String endereco_Estado) {
		Endereco_Estado = endereco_Estado;
	}
	
    @JsonProperty
	public String getEndereco_Cidade() {
		return Endereco_Cidade;
	}
	
    @JsonProperty
	public void setEndereco_Cidade(String endereco_Cidade) {
		Endereco_Cidade = endereco_Cidade;
	}
	
    @JsonProperty
	public String getEndereco_Logradouro() {
		return Endereco_Logradouro;
	}
	
    @JsonProperty
	public void setEndereco_Logradouro(String endereco_Logradouro) {
		Endereco_Logradouro = endereco_Logradouro;
	}
	
    @JsonProperty
	public String getEndereco_CEP() {
		return Endereco_CEP;
	}
    
    @JsonProperty
	public void setEndereco_CEP(String endereco_CEP) {
		Endereco_CEP = endereco_CEP;
	}
	
	
}
