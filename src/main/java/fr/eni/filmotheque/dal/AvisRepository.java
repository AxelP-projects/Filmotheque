package fr.eni.filmotheque.dal;

import fr.eni.filmotheque.bo.Avis;
import fr.eni.filmotheque.bo.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvisRepository extends JpaRepository<Avis, Integer> {
    public List<Avis> findAllByFilm(Film film);

    public List<Avis> findAllByFilm_Id(int id);
}
