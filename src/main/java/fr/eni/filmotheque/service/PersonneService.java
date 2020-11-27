package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Personne;

import java.util.List;

public interface PersonneService {
    List<Personne> getPersonnesByFilm(Film film);
}
