package net.mybluemix.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@XmlRootElement

public class Fornecedor {
	
	@Id
	public String  cnpj;
	public String nome;
	public String email;
	public String telefone;
	public int prazoEntregaDias;
	public String endereco_Pais;
	public String endereco_Estado;
	public String endereco_Cidade;
	public String endereco_Logradouro;
	public String endereco_CEP;
	public boolean ativo;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
		return prazoEntregaDias;
	}
	
	public void setPrazoEntregaDias(int prazoEntregaDias) {
		this.prazoEntregaDias = prazoEntregaDias;
	}
	
	public String getEndereco_Pais() {
		return endereco_Pais;
	}
	
	public void setEndereco_Pais(String endereco_Pais) {
		this.endereco_Pais = endereco_Pais;
	}
	
	public String getEndereco_Estado() {
		return endereco_Estado;
	}
	
	public void setEndereco_Estado(String endereco_Estado) {
		this.endereco_Estado = endereco_Estado;
	}
	
	public String getEndereco_Cidade() {
		return endereco_Cidade;
	}
	
	public void setEndereco_Cidade(String endereco_Cidade) {
		this.endereco_Cidade = endereco_Cidade;
	}
	
	public String getEndereco_Logradouro() {
		return endereco_Logradouro;
	}
	
	public void setEndereco_Logradouro(String endereco_Logradouro) {
		this.endereco_Logradouro = endereco_Logradouro;
	}
	
	public String getEndereco_CEP() {
		return endereco_CEP;
	}
	
	public void setEndereco_CEP(String endereco_CEP) {
		this.endereco_CEP = endereco_CEP;
	}
	
    public void update(Fornecedor f) {
    	this.ativo = f.ativo;
    	this.email = f.email;
    	this.endereco_CEP = f.endereco_CEP;
    	this.endereco_Cidade = f.endereco_Cidade;
    	this.endereco_Estado = f.endereco_Estado;
    	this.endereco_Pais = f.endereco_Pais;
    	this.nome = f.nome;
    	this.prazoEntregaDias = f.prazoEntregaDias;
    	this.telefone = f.telefone;
    	this.endereco_Logradouro = f.endereco_Logradouro;
    }
	
	
}
