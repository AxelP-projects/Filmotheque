<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="fr.eni.filmotheque.bo.Film" %>

<jsp:include page="header.jsp" />

<div class="container-fluid m-0">
	<h2>${film.getTitre()}</h2>
	<div class="row">
		<div class="col-12 col-md-5">
			<img src="/img/film_default_BG.jpg" class="card-img-top" alt="...">
		</div>
		<div class="col">
			<p>Année de sortie : ${film.getAnnee()}</p>
			<p>Réalisateur : ${film.getRealisateur().getNom()} ${film.getRealisateur().getPrenom()}</p>
			<p>Catégorie : ${film.getCategorie().getLibelle()}</p>
			<p>Acteurs : </p>
			<ul class="list-group">
				<c:forEach items="${film.getActeurs()}" var="acteur">
					<li class="list-group-item">${acteur.getPrenom()} ${acteur.getNom()}</li>
				</c:forEach>
			</ul>
		</div>
	</div>
		<a href="/editFilm/${film.getId()}">Modifier film</a>
		<a href="/deleteFilm/${film.getId()}">Supprimer film</a>
</div>

<jsp:include page="footer.jsp" />
