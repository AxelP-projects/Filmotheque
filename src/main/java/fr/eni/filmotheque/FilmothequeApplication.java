package fr.eni.filmotheque;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.eni.filmotheque.bo.Categorie;
import fr.eni.filmotheque.bo.Personne;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.dal.CategorieRepository;
import fr.eni.filmotheque.dal.FilmRepository;
import fr.eni.filmotheque.dal.PersonneRepository;


@SpringBootApplication
public class FilmothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmothequeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(FilmRepository filmRepo, PersonneRepository persRepo, CategorieRepository catRepo) {
		return (args) -> {
			//Categories
			String[] categories = new String[] {"Horreur", "Action", "Drame", "Comédie", "Documentaire"};
			for(String catLibelle : categories) {
				Categorie cat = new Categorie(catLibelle);
				catRepo.save(cat);
			}
			
			//Personnes
			List<Personne> personnes = new ArrayList<>();
			personnes.add(new Personne("Jean", "Dupotager"));
			personnes.add(new Personne("Kinu", "Rive"));
			personnes.add(new Personne("Prad", "Bitt"));
			personnes.add(new Personne("Leocaprio", "Dionardo"));
			personnes.add(new Personne("Mika", "Lunis"));
			personnes.add(new Personne("Edwerd", "Nerten"));
			personnes.add(new Personne("Marlo", "Brandon"));
			personnes.add(new Personne("Tom", "Crouze"));
			
			for(Personne pers : personnes) {
				persRepo.save(pers);
			}
			
			List<Categorie> allCategories = catRepo.findAll();
			
			//Films
			List<Film> films = new ArrayList<>();
			films.add(new Film("Black Panther", "2019", "Documentaire animalier", allCategories.get(0)));
			films.add(new Film("Avengers : Endgame", "1999", "Une histoire d'amour entre un routier et une vendeuse d'aire d'autoroute", allCategories.get(1)));
			films.add(new Film("Toy Story 4", "2002", "Reconstitution historique de la prise de la bastille", allCategories.get(2)));
			films.add(new Film("The wizard of Oz", "1999", "Plagiat du seigneur des anneaux", allCategories.get(3)));
			films.add(new Film("Dunkirk", "2008","Comédie musicale sur les 30 glorieuses",  allCategories.get(4)));
			films.add(new Film("Coco", "2010", "Suivez l'histoire d'un traffic de drogue qui tourne mal", allCategories.get(0)));
			films.add(new Film("E.T.", "1979", "La terre est-elle plate? C'est la question que tout le monde se pose. La réponse est oui. Venez découvrir pourquoi.", allCategories.get(1)));
			films.add(new Film("Star Wars : the last Jedi", "2020", "Parodie de Star Trek", allCategories.get(2)));
			
			for(Film film : films) {
				System.out.println(film);
				filmRepo.save(film);
			}
		};
	}

}
