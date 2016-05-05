package net.mybluemix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class MateriaPrima {

	@Id
    @GeneratedValue
    private Long sku;
	
	private String nome;
	private String tipo;
	private String descricao; 
	private String unidade; 
	private float valorUnidade; 
	private String dataEntrada;
	private String dataSaida;
	
	public void MateriaPrima(){
	}
	
	public Long getSku() {
		return sku;
	}
	public void setSku(Long sku) {
		this.sku = sku;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public float getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(float valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public MateriaPrima( String nome, String tipo, String descricao,
			String unidade, float valorUnidade, String dataEntrada,
			String dataSaida) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.unidade = unidade;
		this.valorUnidade = valorUnidade;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	
	
	
}
