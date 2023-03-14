package com.example.torsdagsopgaveros;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.print.attribute.HashAttributeSet;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "ServletGåTilAdmin", value = "/ServletGåTilAdmin")
public class ServletGTilAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String navn = request.getParameter("navn");
     String kode = request.getParameter("kode");
     Map<String,Bruger> personMap = (Map) getServletContext().getAttribute("personer");

     if(personMap.containsKey(navn.toLowerCase())&&personMap.get(navn).getKodeord().equalsIgnoreCase(kode)&&personMap.get(navn) instanceof Admins){
         request.getRequestDispatcher("adminstratorside.jsp").forward(request,response);
     }else{
         System.out.println("Du er ikke admin");
         request.getRequestDispatcher("WEB-INF/huskeListe.jsp").forward(request,response);
     }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
