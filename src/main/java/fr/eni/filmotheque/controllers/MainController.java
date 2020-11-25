package fr.eni.filmotheque.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotheque.bo.Avis;
import fr.eni.filmotheque.bo.Categorie;
import fr.eni.filmotheque.bo.Film;
import fr.eni.filmotheque.bo.Personne;

@Controller
public class MainController {

	/**
	 * Film list page
	 */
	@GetMapping("/")
	public String getFilms(Model model) {
		List<Film> listeDeFilms = new ArrayList<>();
		
		//Creation du jeu d'essai en attendant la BDD (flemme de faire un service juste pour ça)
		listeDeFilms.add(new Film(123, "unFilm", "1994", "mlpwfijgrmiogjqesgior jtqirjtrmq lrgrlqhrejhrhglzjghrfgrqzlmghrez grngkejqhrgkjezghrljkqerjhgl ", new ArrayList<Avis>(), new Personne("unPrenom", "unNom"), new ArrayList<Personne>(), new Categorie("Horreur")));
		listeDeFilms.add(new Film(124, "unautreFilm", "1993", "description", new ArrayList<Avis>(), new Personne("unPrenom1", "unNom1"), new ArrayList<Personne>(), new Categorie("Comédie")));
		listeDeFilms.add(new Film(125, "unautreFilm2", "1992", "uneAutresdedsmgg", new ArrayList<Avis>(), new Personne("unPrenom2", "unNom2"), new ArrayList<Personne>(), new Categorie("Thriller")));
		listeDeFilms.add(new Film(126, "unautreFilm3", "1991", "poùdfhpjrhqpokùrghspùokj hfwù,kmp ", new ArrayList<Avis>(), new Personne("unPrenom3", "unNom3"), new ArrayList<Personne>(), new Categorie("Action")));
		listeDeFilms.add(new Film(127, "unautreFilm4", "1990", "pko g < mlijkegfijogrohi rhg", new ArrayList<Avis>(), new Personne("unPrenom4", "unNom4"), new ArrayList<Personne>(), new Categorie("Sci-fi")));
		listeDeFilms.add(new Film(128, "unautreFilm5", "1996", " jiqrshgpùilj dhjklmn hmljk hfj lrlqr lhm grhshml hmh hrhm lgwsmh ", new ArrayList<Avis>(), new Personne("unPrenom5", "unNom5"), new ArrayList<Personne>(), new Categorie("Fantasy")));
		
		listeDeFilms.forEach((film)->System.out.println(film));
		model.addAttribute("films", listeDeFilms);
		
		return "homePage";
	}

	/**
	 * Film details page
 	 */
	@GetMapping("/film/{id}")
	public String getFilmDetails(@PathVariable int id, Model model) {
		//Film par défaut en attendant la BDD
		List<Personne> acteurs = new ArrayList<>();
		acteurs.add(new Personne("Jean", "Dupotager"));
		acteurs.add(new Personne("Kinu", "Rive"));
		acteurs.add(new Personne("Prad", "Bitt"));
		acteurs.add(new Personne("Leocaprio", "Dionardo"));
		Film film = new Film(123, "unFilm", "1994", "mlpwfijgrmiogjqesgior jtqirjtrmq lrgrlqhrejhrhglzjghrfgrqzlmghrez grngkejqhrgkjezghrljkqerjhgl ", new ArrayList<Avis>(), new Personne("unPrenom", "unNom"), acteurs, new Categorie("Horreur"));

		model.addAttribute("film", film);
		
		return "filmdetails";
	}

	/**
	 * Post comment function of film details page
 	 */
	@PostMapping("/postcomment")
	public String postComment() {
		//TODO : add comment process

		return "redirect:/filmdetails"; //TODO : redirect:/...
	}

	/**
	 * Login page
 	 */
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}

	/**
	 * Login function
 	 */
	@PostMapping("/login")
	public String postLogin() {
		//TODO : login process

		return "login"; //TODO : redirect:/...
	}

	/**
	 * Edit film page (add/edit)
 	 */
	@GetMapping("/editFilm")
	public String getEditFilm() {
		return "editFilm";
	}

	/**
	 * Edit film function
 	 */
	@PostMapping("/editFilm")
	public String postAddFilm() {
		//TODO : add film process

		return "editFilm"; //TODO : redirect:/...
	}

	/**
	 * Delete film function
 	 */
	@GetMapping("/deleteFilm/{id}")
	public String getDeleteFilm(@PathVariable int id) {
		//TODO : delete film process

		return "deleteFilm"; //TODO : redirect:/...
	}

	/**
	 * Add person page
 	 */
	@GetMapping("/addPerson")
	public String getAddPerson() {
		return "addPerson";
	}

	/**
	 * Add person function
	 */
	@PostMapping("/addPerson")
	public String postAddPerson() {
		//TODO : add person process

		return "addPerson"; //TODO : redirect:/...
	}

	/**
	 * Add category page
	 */
	@GetMapping("/addCategory")
	public String getAddCategory() {
		return "addCategory";
	}

	/**
	 * Add category function
	 */
	@PostMapping("/addCategory")
	public String postAddCategory() {
		//TODO : add category process

		return "addCategory"; //TODO : redirect:/...
	}
	
}
