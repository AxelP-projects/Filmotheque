package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Membre;
import fr.eni.filmotheque.dal.MembreRepository;
import org.springframework.stereotype.Service;

@Service
public class MembreServiceImpl implements MembreService{

    MembreRepository membreRepository;

    public MembreServiceImpl(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

    @Override
    public Boolean login(String nom, String prenom) {
        return membreRepository.existsMembreByNomAndPrenom(nom, prenom);
    }

    @Override
    public boolean register(Membre membre) {
        if(membre.getNom() != null && !membre.getNom().isEmpty()
            && membre.getPrenom() != null && !membre.getPrenom().isEmpty())
        {
            membreRepository.save(membre);
            return true;
        }

        return false;
    }
}
