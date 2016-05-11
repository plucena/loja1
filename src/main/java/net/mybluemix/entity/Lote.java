package net.mybluemix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement

public class Lote {
	
	@Id
    @GeneratedValue
	public Long id;
	
	private String preco;
	private String dataEntrada;
	private String dataSaida;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPreco() {
		return preco;
	}
	
	public void setPreco(String preco) {
		this.preco = preco;
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

	
	

}
