package com.example.torsdagsopgaveros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletFjernFraHuskeliste", value = "/ServletFjernFraHuskeliste")
public class ServletFjernFraHuskeliste extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ting = request.getParameter("ting1");

        ArrayList<String> huskeliste = (ArrayList<String>) getServletContext().getAttribute("huskeliste");

        for (int i = 0; i < huskeliste.size(); i++) {
            if(huskeliste.get(i).equalsIgnoreCase(ting)){
                huskeliste.remove(i);
                getServletContext().setAttribute("huskeliste",huskeliste);
                request.getRequestDispatcher("WEB-INF/huskeListe.jsp").forward(request,response);
            }else{
                System.out.println("Er der ikke");
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
