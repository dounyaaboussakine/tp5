<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des Produits</title>
</head>
<body>
<h2>Liste des Produits</h2>

<ul>
    <c:forEach var="p" items="${produits}">
        <li>${p}</li>
    </c:forEach>
</ul>

</body>
</html>
