package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Table(name="NOMBRE")
@Entity
public class Nombre {
	
	public Nombre() {
		
	}

	public Nombre(long id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_NOMBRE")
	private long id;
	
	@Column(name="NOMBRE")
	private String nom;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	
}
