package net.mybluemix.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
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
	private String codigoDeBarras;
	
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable
	 (
	      name="LOTE_MATERIAPRIMA",
	      joinColumns={ @JoinColumn(name="sku", referencedColumnName="sku") }
	  )
	private List<Lote> lotes;

	
	
    public List<Lote> getLotes() {
		return lotes;
	}

	public void addLotes(Lote lote) {
		this.lotes.add(lote);
	}
	

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	@JsonProperty
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

    @JsonProperty
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

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

   
	public MateriaPrima( String nome, String tipo, String descricao,
			String unidade, float valorUnidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.unidade = unidade;
		this.valorUnidade = valorUnidade;
	
	}

	
	public boolean equals(MateriaPrima p) {
		if(this.nome.equals(p.nome) &&
		   this.tipo.equals(p.tipo) &&
		   this.descricao.equals(p.descricao) &&
		   this.unidade.equals(p.unidade) &&
		   this.valorUnidade == p.valorUnidade 
		   )
			return true;
		return false;
	}

	
	
}
