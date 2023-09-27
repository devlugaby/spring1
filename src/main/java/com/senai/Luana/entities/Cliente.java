package com.senai.Luana.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	//atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nome")
	private String nCliente;
	
	@Column(name = "telefone")
	private String fone;
	
	//métodos
	
	public Long getidcCliente() {
		return idcCliente;
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public String getfone() {
		return fone;
	}
	
	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public void setfone(String fone) {
		this.fone = fone;
	}

}

