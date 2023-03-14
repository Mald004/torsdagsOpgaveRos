package com.example.torsdagsopgaveros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@WebServlet(name = "ServletSeHuskeliste", value = "/ServletSeHuskeliste")
public class ServletSeHuskeliste extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String navn = request.getParameter("navn");

        Map<String,Bruger> personer =(Map<String, Bruger>) request.getServletContext().getAttribute("personer");
        ArrayList<String>huskeliste = new ArrayList<>();

        huskeliste = personer.get(navn).getHuskeliste();

        if(huskeliste!=null){
            getServletContext().setAttribute("liste",huskeliste);
            request.getRequestDispatcher("adminstratorside.jsp").forward(request,response);
        }else{
            System.out.println("is empty");
            request.getRequestDispatcher("adminstratorside.jsp").forward(request,response);
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
