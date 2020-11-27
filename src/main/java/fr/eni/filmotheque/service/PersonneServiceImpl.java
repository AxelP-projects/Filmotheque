package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Personne;
import fr.eni.filmotheque.dal.PersonneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneServiceImpl implements PersonneService {

    private PersonneRepository personneRepository;

    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @Override
    public List<Personne> getPersonnesByFilm(Film film) {
        return personneRepository.findAllByFilmsJoues(film);
    }
}
