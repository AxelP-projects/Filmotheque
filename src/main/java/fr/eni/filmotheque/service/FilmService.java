package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Film;

import java.util.List;

public interface FilmService {
    List<Film> getFilms();

    List<Film> getFilmByTitre(String titre);

    void addFilm(Film film);

    void removeFilm(int id);
}
