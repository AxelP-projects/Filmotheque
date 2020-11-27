package fr.eni.filmotheque.dal;

import fr.eni.filmotheque.bo.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
