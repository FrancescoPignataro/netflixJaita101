package org.generation.italy.netflixJaita.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Regista {

	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;

	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@Column
	private String nazionalità;

	public Regista(String nome, String cognome, String nazionalità) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.nazionalità = nazionalità;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNazionalità() {
		return nazionalità;
	}

	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}

	@Override
	public String toString() {
		return "Regista [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", nazionalità=" + nazionalità + "]";
	}
	
	
	
}
