package net.mybluemix.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement

public class Lote {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	public Long sku;
	private float preco;
	
	
	@ManyToOne
	private MateriaPrima materiaPrima;
	

	@ManyToOne 
	private Fornecedor fornecedor;

	
	
	private String status;
	private float quantidade;
	private String unidade; 

	
	
	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Long getSku() {
		return sku;
	}
	
	public void setKu(Long sku) {
		this.sku = sku;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public Lote(Long sku, float preco, Fornecedor fornecedor,
			MateriaPrima materiaPrima, String status, float quantidade, String unidade) {
		super();
		this.sku = sku;
		this.preco = preco;
		this.fornecedor = fornecedor;
		this.materiaPrima = materiaPrima;
		this.status = status;
		this.quantidade = quantidade;
		this.unidade = unidade;
	}

	
	public Lote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	

}
