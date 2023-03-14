<%--
  Created by IntelliJ IDEA.
  User: malde
  Date: 3/9/2023
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Her kan du ændre kodeord</h1>
<p>Ændre kodeord dit her</p>
<form action="ServletÆndreKodeord" method="get">
   <input type="password" id="gamlekode" name="gamlekode" placeholder="Skriv din nuværende kode">
    <input type="password" id="nyekode"name="nyekode" placeholder="Skriv din nye kode">
    <input type="submit" value="Ændre">
</form>
</body>
</html>
