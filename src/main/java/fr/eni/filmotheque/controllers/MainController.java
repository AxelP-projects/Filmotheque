package fr.eni.filmotheque.controllers;

import java.util.Calendar;
import java.util.List;

import fr.eni.filmotheque.service.CategorieService;
import fr.eni.filmotheque.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.filmotheque.bo.Categorie;
import fr.eni.filmotheque.bo.Film;

@Controller
public class MainController {

	private FilmService filmService;
	private CategorieService categorieService;

	public MainController(FilmService filmService, CategorieService categorieService) {
		this.filmService = filmService;
		this.categorieService = categorieService;
	}

	/**
	 * Film list page
	 */
	@GetMapping("/")
	public String getFilms(Model model) {
		List<Film> listeDeFilms = filmService.getFilms();
		System.out.println("Test Repository --------------------------------");
		model.addAttribute("films", listeDeFilms);
		
		return "homePage";
	}

	/**
	 * Film details page
 	 */
	@GetMapping("/film/{id}")
	public String getFilmDetails(@PathVariable int id, Model model) {
//		Film film = new Film(123, "unFilm", "1994", "mlpwfijgrmiogjqesgior jtqirjtrmq lrgrlqhrejhrhglzjghrfgrqzlmghrez grngkejqhrgkjezghrljkqerjhgl ", new ArrayList<Avis>(), new Personne("unPrenom", "unNom"), acteurs, new Categorie("Horreur"));

		Film film = filmService.getFilmById(id);
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
	 * Add film page
 	 */
	@GetMapping("/addFilm")
	public String getAddFilm(Model model) {
		//New blank Film
		Film film = new Film();
		film.setAnnee(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
		model.addAttribute("film", film);
		
		//Fetch all Categories
		List<Categorie> categories = categorieService.getAllCategories();
		model.addAttribute("categories", categories);
		
		model.addAttribute("isNew", true);
		return "editFilm";
	}
	
	/**
	 * Edit film page 
	 * Ajouter ID dans l'URL
 	 */
	@GetMapping("/editFilm/{id}")
	public String getEditFilm(@PathVariable int id, Model model) {
		Film film = filmService.getFilmById(id);
		model.addAttribute("film", film);
		model.addAttribute("isNew", false);
		return "editFilm";
	}

	/**
	 * Edit film function
 	 */
	@PostMapping("/editFilm")
	public String postAddFilm(@ModelAttribute("film") Film film) {
		//TODO : add film process
		filmService.addFilm(film);
		return "redirect:/"; 
	}

	/**
	 * Delete film function
 	 */
	@GetMapping("/deleteFilm/{id}")
	public String getDeleteFilm(@PathVariable int id) {
		filmService.removeFilm(id);
		return "redirect:/";
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
