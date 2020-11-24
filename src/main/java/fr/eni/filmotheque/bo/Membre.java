package fr.eni.filmotheque.bo;

import java.util.List;

public class Membre {

	private int id;
	
	private String nom;
	
	private String prenom;
	
	private List<Avis> avis;

	public Membre() {
		super();
	}

	public Membre(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Membre(int id, String nom, String prenom, List<Avis> avis) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.avis = avis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	
	public void addAvis(Avis avis) {
		this.getAvis().add(avis);
	}
	
	public void removeAvis(Avis avis) {
		this.getAvis().remove(avis);
	}

	@Override
	public String toString() {
		return "Membre [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", avis=" + avis + "]";
	}
	
	
}
