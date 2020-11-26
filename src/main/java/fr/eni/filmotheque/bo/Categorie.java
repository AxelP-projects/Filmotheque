package fr.eni.filmotheque.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String libelle;

	public Categorie() {
		super();
	}

	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}

	public Categorie(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelle=" + libelle + "]";
	}
	
}
