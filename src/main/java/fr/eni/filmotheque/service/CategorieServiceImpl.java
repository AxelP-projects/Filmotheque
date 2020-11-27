package fr.eni.filmotheque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.filmotheque.bo.Categorie;
import fr.eni.filmotheque.dal.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService{

    CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}
}
