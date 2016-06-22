package net.mybluemix.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement

public class Receita {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
    private Long sku;
	private String nome;
	public String tipo;
	private String descricao; 
	
	@ManyToMany(cascade=CascadeType.ALL)
	  @JoinTable(
	      name="ITEM_RECEITAS",
	      joinColumns=@JoinColumn(name="RECEITA_SKU", referencedColumnName="sku")
	      )
	private List<ItemReceita> receita = new LinkedList<ItemReceita>();
	
	public Receita(){	
	}
	
	public List<ItemReceita> getReceita() {
		return receita;
	}

	public void setReceita(List<ItemReceita> receita) {
		this.receita = receita;
	}

	public void addItemReceita(ItemReceita it){
		this.receita.add(it);
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
	

	public 	Receita(String nome, String tipo, String descricao,
			 List<ItemReceita> receita) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.receita = receita;
	}
	

	public void update(Receita p) {
		this.nome = p.nome;
		this.tipo = p.tipo;
		this.descricao = p.descricao;
		this.receita = p.receita;
	}
	
	
}
