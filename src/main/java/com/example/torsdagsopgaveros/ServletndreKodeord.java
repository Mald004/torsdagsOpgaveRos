package com.example.torsdagsopgaveros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Map;

@WebServlet(name = "ServletÆndreKodeord", value = "/ServletÆndreKodeord")
public class ServletndreKodeord extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String gamlekode = request.getParameter("gamlekode");
    String nyekode = request.getParameter("nyekode");
    String navn = (String) getServletContext().getAttribute("navn");
        System.out.println("Navn: "+ navn);
        System.out.println("nyekode" + nyekode);
        System.out.println("gamelekode" + gamlekode);

    Map<String,Person> personMap = (Map)getServletContext().getAttribute("personer");

    personMap.get(navn).setKodeord(nyekode);

    getServletContext().setAttribute("personer",personMap);
    request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
