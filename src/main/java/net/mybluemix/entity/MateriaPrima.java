package net.mybluemix.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@XmlRootElement

public class MateriaPrima {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long sku;
	private String nome;
	public String tipo;
	private String descricao; 

	
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
   

   
	public MateriaPrima(Long sku, String nome, String tipo, String descricao,
			String unidade) {
		super();
		this.sku = sku;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public void update( MateriaPrima p) {
		this.sku = p.sku;
		this.nome = p.nome;
		this.tipo = p.tipo;
		this.descricao = p.descricao;
	}

	

	
	
}
