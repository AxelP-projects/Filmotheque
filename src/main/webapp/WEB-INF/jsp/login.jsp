<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp" />

<form action="/login" method="post">

    <div class="container">
        <label for="nom"><b>Nom</b></label>
        <input type="text" placeholder="Entrez votre Nom" name="nom" required>

        <label for="prenom"><b>Prenom</b></label>
        <input type="password" placeholder="Entrez votre prénom" name="prenom" required>

        <button type="submit">Login</button>
        <label>
            Pas de compte ? <a href="/register">Enregistrez vous</a>
        </label>

        <div class="error">
            ${error}
        </div>
    </div>
</form>

<jsp:include page="footer.jsp" />
