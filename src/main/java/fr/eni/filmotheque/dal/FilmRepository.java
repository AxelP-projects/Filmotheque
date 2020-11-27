package fr.eni.filmotheque.dal;

import fr.eni.filmotheque.bo.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    public List<Film> findByTitre(String titre);
    public Film findById(int id);
}
