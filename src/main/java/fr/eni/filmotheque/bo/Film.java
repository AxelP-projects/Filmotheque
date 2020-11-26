package fr.eni.filmotheque.bo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String titre;
	
	private String annee;
	
	private String description;

	@OneToMany(mappedBy = "film")
	private List<Avis> avis;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Personne realisateur;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Acteur_Film", joinColumns = {
			@JoinColumn(name = "filmid")
	}, inverseJoinColumns = {
			@JoinColumn(name = "personneid")
	})
	private List<Personne> acteurs;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Categorie categorie;

	public Film() {
		super();
	}

	public Film(String titre, String annee, String description, Categorie categorie) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.categorie = categorie;
	}

	public Film(String titre, String annee, String description, Personne realisateur, List<Personne> acteurs, Categorie categorie) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.categorie = categorie;
	}

	public Film(int id, String titre, String annee, String description, List<Avis> avis, Personne realisateur, List<Personne> acteurs, Categorie categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", description=" + description + ", avis="
				+ avis + ", realisateur=" + realisateur.getNom() + ", categorie=" + categorie + "]";
	}

	
	
	
}
