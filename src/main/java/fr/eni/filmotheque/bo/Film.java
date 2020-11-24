package fr.eni.filmotheque.bo;

import java.util.List;

public class Film {

	private int id;
	
	private String titre;
	
	private String annee;
	
	private List<Avis> avis;
	
	private Personne realisateur;
	
	private List<Personne> acteurs;
	
	private Categorie categorie;

	public Film() {
		super();
	}

	public Film(String titre, String annee, Categorie categorie) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.categorie = categorie;
	}

	public Film(String titre, String annee, Personne realisateur, List<Personne> acteurs, Categorie categorie) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.categorie = categorie;
	}

	public Film(int id, String titre, String annee, List<Avis> avis, Personne realisateur, List<Personne> acteurs,
			Categorie categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.avis = avis;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
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

	public Personne getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}

	public List<Personne> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Personne> acteurs) {
		this.acteurs = acteurs;
	}
	
	public void addActeur(Personne acteur) {
		this.getActeurs().add(acteur);
	}
	
	public void removeActeur(Personne acteur) {
		this.getActeurs().remove(acteur);
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", avis=" + avis + ", realisateur="
				+ realisateur + ", acteurs=" + acteurs + ", categorie=" + categorie + "]";
	}
	
	
	
}
