package com.uce.edu.demo.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@Column(name = "cuen_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuen_id_seq")
	@SequenceGenerator(name = "cuen_id_seq", sequenceName = "cuen_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "cuen_numero")
	private String numero;

	@Column(name = "cuen_tipo")
	private String tipo;

	@Column(name = "cuen_saldo")
	private BigDecimal saldo;

	@ManyToOne
	@JoinColumn(name = "cuen_id_persona")
	private Persona persona;
	

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}

	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
