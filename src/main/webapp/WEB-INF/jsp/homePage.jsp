<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="fr.eni.filmotheque.bo.Film" %>

<jsp:include page="header.jsp" />


<div class="container-fluid m-0">
	<div class="row">
		<div class="col-12 col-lg-2 m-0 p-0">
			<div class="card h-100">
				<div class="card-header d-none d-lg-block"><h5>Filtres</h5></div>
				<div class="card-body mt-2">
					<div class="form-group-row">
						<div class="row">
							<div class="col-6 col-lg-12">
								<input type="text" class="form-control" id="titreInput"
									placeholder="Titre">
							</div>
							<div class="col-6 col-lg-12 mt-lg-2">
								<select class="custom-select mr-sm-2"
									id="inlineFormCustomSelect">
									<option selected>Catégorie</option>
									<option value="1">Action</option>
									<option value="2">Horreur</option>
									<option value="3">Comédie</option>
								</select>
							</div>
						</div>
					</div>
					<fieldset class="form-group">
						<p class="col-form-label">Tri :</p>
						<div class="form-check disabled">
							<input class="form-check-input" type="radio" name="gridRadios"
								value="option3" id="gridRadios3" checked> <label
								class="form-check-label" for="gridRadios3"> Alphabétique
							</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gridRadios"
								value="option1" id="gridRadios1"> <label
								class="form-check-label" for="gridRadios1"> Note </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="gridRadios"
								value="option2" id="gridRadios2"> <label
								class="form-check-label" for="gridRadios2"> Année </label>
						</div>
					</fieldset>
				</div>
			</div>
		</div>
		<div class="col">
			<div class="container">
				<div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 row-cols-xl-4 ">
				
					<c:forEach items="${films}" var="film">
						<div class="col mb-4 mt-4">
							<div class="card h-100">
								<img src="img/film_default_BG.jpg" class="card-img-top" alt="...">
								<div class="card-body">
									<h5 class="card-title">${film.getTitre()}</h5>
									<small>${film.getAnnee()}</small>
									<p class="card-text" style="height: 50px; overflow: hidden;">${film.getDescription()}</p>
									<div class="text-right">
										<a href="./film/${film.getId()}" class="stretched-link">Details</a>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<jsp:include page="footer.jsp" />
