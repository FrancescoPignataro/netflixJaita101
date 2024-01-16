package org.generation.italy.netflixJaita.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proiezioni {
	
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)			//l'ID verrà autogenerato ad ogni inserimento di riga
	private int id;
	

	@Column
	private String titolo;
	
	@Column
	private String tipologia;
	
	@Column
	private String genere;
	
	@Column
	
	private int durata;
	
	@Column
	
	private LocalDate annoProduzione;

	public Proiezioni(String titolo, String tipologia, String genere, int durata, LocalDate annoProduzione) {
		super();
		this.titolo = titolo;
		this.tipologia = tipologia;
		this.genere = genere;
		this.durata = durata;
		this.annoProduzione = annoProduzione;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public LocalDate getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(LocalDate annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	@Override
	public String toString() {
		return "Proiezioni [titolo=" + titolo + ", tipologia=" + tipologia + ", genere=" + genere + ", durata=" + durata
				+ ", annoProduzione=" + annoProduzione + "]";
	}
	
	
}


