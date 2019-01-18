package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pays {

	// private Pays pays;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	private String Nom;

	protected Pays() {
	}
//CREATION DE PARAMETRE

 public Pays(String Nom) {
     this.Nom=Nom;
 }
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		this.Nom = nom;
	}

	public long getID() {
		return ID;
	}

}
