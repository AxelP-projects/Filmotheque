<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="header.jsp" />

<c:if test="${isNew}">
	<h1>Ajouter un film</h1>
</c:if>
<c:if test="${! isNew}">
	<h1>Modifier un film</h1>
</c:if>

<form:form modelAttribute="film" method="POST" action="/editFilm">
      <table>
          <tr>
              <td>Titre:</td>
              <td><form:input path="titre" /></td>
          </tr>
          <tr>
              <td>Description:</td>
              <td><form:input path="description" /></td>
          </tr>
          <tr>
              <td>Année de sortie:</td>
              <td><form:input type="number" min="1900" max="2099" step="1" value="${film.getAnnee()}" path="annee" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Enregistrer" />
              </td>
          </tr>
      </table>
  </form:form>

<jsp:include page="footer.jsp" />
