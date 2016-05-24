package net.mybluemix.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
	public Long sku;
	private String preco;
	
	
	@ManyToOne
	private MateriaPrima materiaPrima;
	

	@ManyToOne 
	private Fornecedor fornecedor;

	
	
	private String Status;
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
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
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
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
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

	public Lote(Long sku, String preco, Fornecedor fornecedor,
			MateriaPrima materiaPrima, String status, float quantidade) {
		super();
		this.sku = sku;
		this.preco = preco;
		this.fornecedor = fornecedor;
		this.materiaPrima = materiaPrima;
		Status = status;
		this.quantidade = quantidade;
		this.unidade = unidade;
	}
	
	

	
	

}
