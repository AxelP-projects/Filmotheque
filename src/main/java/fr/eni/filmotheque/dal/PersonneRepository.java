package fr.eni.filmotheque.dal;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    public List<Personne> findAllByFilmsJoues(Film film);
}
