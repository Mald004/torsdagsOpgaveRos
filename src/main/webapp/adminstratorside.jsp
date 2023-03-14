<%@ page import="com.example.torsdagsopgaveros.Bruger" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: malde
  Date: 3/9/2023
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Admin-side</h1>
<a href="index.jsp">Tilbage til login</a><br>
<br>

<form action="ServletSeHuskeliste">
 <input type="text" id="navn" name="navn" placeholder="Skriv hvis liste du vil se">
 <input type="submit" value="Se huskeliste">
</form>

<%ArrayList<String> liste = (ArrayList<String>) request.getServletContext().getAttribute("liste");%>
<%for(String ting: liste){%>
<li><%=ting%> </li>
<%}%>

</body>
</html>
