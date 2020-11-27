package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.dal.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService{

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getFilms() {
        return filmRepository.findAll();
    }

    @Override
    public List<Film> getFilmByTitre(String titre) {
        return filmRepository.findByTitre(titre);
    }
    
    @Override
    public Film getFilmById(int id) {
        return filmRepository.findById(id);
    }

    @Override
    public void addFilm(Film film) {
        filmRepository.save(film);
    }

    @Override
    public void removeFilm(int id) {
        filmRepository.deleteById(id);
    }
}
