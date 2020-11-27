package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Avis;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.dal.AvisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvisServiceImpl implements AvisService {

    private AvisRepository avisRepository;

    public AvisServiceImpl(AvisRepository avisRepository) {
        this.avisRepository = avisRepository;
    }

    @Override
    public List<Avis> getAvisByFilm(Film film) {
        return avisRepository.findAllByFilm(film);
    }

    @Override
    public List<Avis> getAvisByFilmId(int id) {
        return avisRepository.findAllByFilm_Id(id);
    }

    @Override
    public void addAvis(Avis avis) {
        avisRepository.save(avis);
    }

    @Override
    public void removeAvis(int id) {
        avisRepository.deleteById(id);
    }
}
