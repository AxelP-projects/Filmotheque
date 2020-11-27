<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="header.jsp" />

<form:form method="POST" action="/register"
           modelAttribute="membre">

    <div class="container">
        <div>
            <form:label path="nom">Nom :</form:label>
            <form:input path="nom" required="required"/>
        </div>
        <div>
            <form:label path="prenom">Prenom :</form:label>
            <form:input path="prenom" required="required"/>
        </div>

        <div>
            <button type="submit">Enregistrer</button>
        </div>

        <div class="error">
                ${error}
        </div>
    </div>
</form:form>

<jsp:include page="footer.jsp" />