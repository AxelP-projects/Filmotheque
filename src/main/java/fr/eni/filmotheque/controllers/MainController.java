package fr.eni.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmotheque")
public class MainController {

	/**
	 * Film list page
	 */
	@GetMapping("/films")
	public String getFilms() {
		return "films";
	}

	/**
	 * Film details page
 	 */
	@GetMapping("/films/{id}")
	public String getFilmDetails(@PathVariable int id) {
		//TODO : get film details

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
