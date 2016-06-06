package net.mybluemix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement

public class ItemReceita {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	public Long id;
	public float quantidade;
	public String unidade;

	
	@ManyToOne
	public MateriaPrima materiaPrima;
	
	public ItemReceita(){
		
	}

	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getUnidade() {
		return unidade;
	}




	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}




	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	
	public ItemReceita(float quantidade, MateriaPrima materiaPrima) {
		super();
		this.quantidade = quantidade;
		this.materiaPrima = materiaPrima;
	}
	
	
}
