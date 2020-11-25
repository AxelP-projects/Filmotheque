<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TP Filmothèque</title>
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="bootstrap-4.5.3-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="css/headerfooter.css">
<script src="bootstrap-4.5.3-dist/js/bootstrap.min.js"></script>
<link rel="icon" href="img/favicon.ico" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">


</head>
<body>
<ul>
	<li><a class="navbartitle" href="films">Accueil Filmothèque</a></li>
	<li class="pull-right"><a href="">Connexion</a></li>
	<%-- To add with role managment
	<li class="pull-right"><a href="">Déconnexion</a></li>
	<li class="pull-right"><a href="">Ajouter un film</a></li>
	--%>
</ul>
