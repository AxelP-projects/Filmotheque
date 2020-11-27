package fr.eni.filmotheque.service;

import fr.eni.filmotheque.bo.Membre;

public interface MembreService {

    Boolean login(String nom, String prenom);

    boolean register(Membre membre);
}
