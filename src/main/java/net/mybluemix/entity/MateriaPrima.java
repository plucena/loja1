package net.mybluemix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@XmlRootElement

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
	
	public MateriaPrima(){
	}
	
    @JsonProperty
	public Long getSku() {
		return sku;
	}

    @JsonProperty
	public void setSku(Long sku) {
		this.sku = sku;
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
    public String getTipo() {
		return tipo;
	}

    @JsonProperty
    public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    @JsonProperty
    public String getDescricao() {
		return descricao;
	}


    @JsonProperty
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    @JsonProperty
	public String getUnidade() {
		return unidade;
	}

    @JsonProperty
    public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

    @JsonProperty
    public float getValorUnidade() {
		return valorUnidade;
	}

    @JsonProperty
    public void setValorUnidade(float valorUnidade) {
		this.valorUnidade = valorUnidade;
	}

    @JsonProperty
    public String getDataEntrada() {
		return dataEntrada;
	}

    @JsonProperty
    public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

    
    @JsonProperty
    public String getDataSaida() {
		return dataSaida;
	}

    @JsonProperty
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
