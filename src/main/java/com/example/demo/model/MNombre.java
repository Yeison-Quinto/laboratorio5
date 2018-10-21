package com.example.demo.model;

import com.example.demo.entity.Nombre;

public class MNombre {
	
		public MNombre() {
			
		}
		
		public MNombre(Nombre nombre) {
			this.Id = nombre.getId();
			this.nom = nombre.getNom();
		}
		

		public MNombre(long id, String nom) {
			this.Id = id;
			this.nom = nom;
		}
		
		private long Id;
		private String nom;
		
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
	
}
