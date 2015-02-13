package com.example.cv_catalog.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nyelvek database table.
 * 
 */
@Entity
@NamedQuery(name="Nyelvek.findAll", query="SELECT n FROM Nyelvek n")
public class Nyelvek implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nyelvkod;

	@Column(name="KARAKTER_KESZLET")
	private String karakterKeszlet;

	private String nyelv;

	public Nyelvek() {
	}

	public String getNyelvkod() {
		return this.nyelvkod;
	}

	public void setNyelvkod(String nyelvkod) {
		this.nyelvkod = nyelvkod;
	}

	public String getKarakterKeszlet() {
		return this.karakterKeszlet;
	}

	public void setKarakterKeszlet(String karakterKeszlet) {
		this.karakterKeszlet = karakterKeszlet;
	}

	public String getNyelv() {
		return this.nyelv;
	}

	public void setNyelv(String nyelv) {
		this.nyelv = nyelv;
	}

}