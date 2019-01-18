package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



	@Entity
	public class Personne {
	
  
		protected Personne() {
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long ID;
		private String Nom;
		private String Prenom;
		
		@ManyToOne
		private  Pays pays;
		//creer une association entre pays et personne
	
		public Personne(String Nom, String Prenom, Pays pays) {
		     this.Nom=Nom;
		     this.Prenom=Prenom;
		     this.pays=pays;
		
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
		
		public void setID(long ID) {
			this.ID = ID;
		}
		public String getPrenom() {
			return Prenom;
		}
		public void setPrenom(String prenom) {
			this.Prenom = prenom;
		}

		public Pays getPays() {
			return pays;
		}

		public void setPays(Pays pays) {
			this.pays = pays;
		}



	}
	
