package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Avis;
import fr.eni.filmotheque.bo.Film;

import java.util.List;

public interface AvisService {

    List<Avis> getAvisByFilm(Film film);

    List<Avis> getAvisByFilmId(int id);

    void addAvis(Avis avis);

    void removeAvis(int id);
}
