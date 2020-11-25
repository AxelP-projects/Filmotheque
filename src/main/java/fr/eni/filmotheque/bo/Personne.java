package fr.eni.filmotheque.bo;

import java.util.List;

public class Personne {

	private int id;
	
	private String prenom;
	
	private String nom;
	
	private List<Film> filmsRealises;
	
	private List<Film> filmsJoues;

	public Personne() {
		super();
	}

	public Personne(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	public Personne(int id, String prenom, String nom, List<Film> filmsRealises, List<Film> filmsJoues) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.filmsRealises = filmsRealises;
		this.filmsJoues = filmsJoues;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Film> getFilmsRealises() {
		return filmsRealises;
	}

	public void setFilmsRealises(List<Film> filmsRealises) {
		this.filmsRealises = filmsRealises;
	}
	
	public void addFilmRealise(Film film) {
		this.getFilmsRealises().add(film);
	}
	
	public void removeFilmRealise(Film film) {
		this.getFilmsRealises().remove(film);
	}

	public List<Film> getFilmsJoues() {
		return filmsJoues;
	}

	public void setFilmsJoues(List<Film> filmsJoues) {
		this.filmsJoues = filmsJoues;
	}
	
	public void addFilmJoue(Film film) {
		this.getFilmsJoues().add(film);
	}
	
	public void removeFilmJoue(Film film) {
		this.getFilmsJoues().remove(film);
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", filmsRealises=" + filmsRealises
				+ ", filmsJoues=" + filmsJoues + "]";
	}
	
}
