package net.mybluemix.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement

public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
    private Long sku;
	
	
	@ManyToMany
	  @JoinTable(
	      name="LOTE_PRODUTO",
	      joinColumns=@JoinColumn(name="LOTE_ID", referencedColumnName="sku")
	      )
	List<Lote> lotes = new LinkedList<Lote>();
	
	@ManyToOne
	Receita receita;
	
	String status;
	float preco;
	
	public long quantidadeProduzida;
	
	
	public long getQuantidadeProduzida() {
		return quantidadeProduzida;
	}


	public void setQuantidadeProduzida(long quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}


	public Produto() {
		
	}
	
	
	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public List<Lote> getLotes() {
		return lotes;
	}
	
	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}
	
	public Receita getReceita() {
		return receita;
	}
	
	public void setReceita(Receita receita) {
		this.receita = receita;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Produto(List<Lote> lotes, Receita receita, String status, float preco) {
		super();
		this.lotes = lotes;
		this.receita = receita;
		this.status = status;
		this.preco = preco;
	}

	public void update(Produto p) {
		this.lotes = p.lotes;
		this.receita = p.receita;
		this.status = p.status;
		this.preco = p.preco;
	}

}
