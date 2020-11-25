package fr.eni.filmotheque.bo;

import java.util.Date;

public class Avis {

	private int id;
	
	private int note;
	
	private String commentaire;
	
	private Date date;
	
	private Membre redacteur;
	
	private Film film;

	public Avis() {
		super();
	}

	public Avis(int note, String commentaire, Membre redacteur, Film film) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		this.redacteur = redacteur;
		this.film = film;
		this.date = new Date();
	}

	public Avis(int id, int note, String commentaire, Date date, Membre redacteur, Film film) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
		this.date = date;
		this.redacteur = redacteur;
		this.film = film;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Membre getRedacteur() {
		return redacteur;
	}

	public void setRedacteur(Membre redacteur) {
		this.redacteur = redacteur;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Avis [id=" + id + ", note=" + note + ", commentaire=" + commentaire + ", date=" + date + ", redacteur="
				+ redacteur + ", film=" + film + "]";
	}
	
	
}
