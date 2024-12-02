package com.example;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.getWriter().println("Hola, este es un servlet funcionando correctamente.");
        String appName = getServletContext().getInitParameter("appName");
        response.getWriter().println("Nombre de la aplicación: " + appName);
    }
}


