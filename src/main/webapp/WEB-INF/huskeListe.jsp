<%@ page import="com.example.torsdagsopgaveros.Person" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: malde
  Date: 3/9/2023
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HuskeListe</title>
</head>
<body>
<a href="index.jsp">Tilbage til login</a><br>

<h1>Din huskeListe til Roskilde</h1>
<ul>
    <%
        for (String item : (List<String>) request.getServletContext().getAttribute("huskeliste")) {
    %>
    <li><%= item %></li>
    <%
        }
    %>
</ul>

<br>
<h2>Tilføj til huskeListe</h2>
<form action="ServletAddTilHuskeliste" method="get">
    <input type="text" id="ting" name="ting" placeholder="Ting">
    <input type="submit" value="Tilføj">
</form>
<br>

<h2>Fjern fra huskeliste</h2>
<form action="ServletFjernFraHuskeliste">
    <input type="text" id="ting1" name="ting1" placeholder="Ting">
    <input type="submit" value="Fjern">
</form>

<%--<h2>Adminstratorside</h2>--%>
<%--<form action="ServletGåTilAdmin" method="get">--%>
<%--    <input type="text" id="navn" name="navn">--%>
<%--    <input type="password" id="kode"name="kode">--%>
<%--    <input type="submit" value="Gå til adminstratorside">--%>
<%--</form>--%>

<a href="brugerÆndring.jsp">Bruger-indstillinger</a>
</body>
</html>
