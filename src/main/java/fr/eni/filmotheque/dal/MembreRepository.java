package fr.eni.filmotheque.dal;

import fr.eni.filmotheque.bo.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreRepository extends JpaRepository<Membre, Integer> {
    public Boolean existsMembreByNomAndPrenom(String nom, String prenom);
}
