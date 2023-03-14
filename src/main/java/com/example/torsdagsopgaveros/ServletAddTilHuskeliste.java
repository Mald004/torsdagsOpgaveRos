package com.example.torsdagsopgaveros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletAddTilHuskeliste", value = "/ServletAddTilHuskeliste")
public class ServletAddTilHuskeliste extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String ting = request.getParameter("ting");

    ArrayList<String>huskeliste = (ArrayList<String>) getServletContext().getAttribute("huskeliste");
if(huskeliste !=null){
    huskeliste.add(ting);
    getServletContext().setAttribute("huskeliste",huskeliste);
    request.getRequestDispatcher("WEB-INF/huskeListe.jsp").forward(request,response);
}else{
    System.out.println("fuck");
}

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
