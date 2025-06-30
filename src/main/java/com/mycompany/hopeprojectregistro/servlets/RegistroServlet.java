package com.mycompany.hopeprojectregistro.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String fotoPerfil = request.getParameter("foto-perfil");
        String biografia = request.getParameter("biografia");
        String fechaNacimiento = request.getParameter("fecha-nacimiento");
        String pais = request.getParameter("pais");
        String nombreUsuario = request.getParameter("nombre-usuario");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
        String confirmarContrasena = request.getParameter("confirmar-contrasena");
        
        
        request.setAttribute("nombre", nombre);
        request.setAttribute("apellidos", apellidos);
        request.setAttribute("fotoPerfil", fotoPerfil);
        request.setAttribute("biografia", biografia);
        request.setAttribute("fechaNacimiento", fechaNacimiento);
        request.setAttribute("pais", pais);
        request.setAttribute("nombreUsuario", nombreUsuario);
        request.setAttribute("correo", correo);
        request.setAttribute("contrasena", contrasena);
        request.setAttribute("confirmarContrasena", confirmarContrasena);
        
        request.getRequestDispatcher("/registro.jsp").forward(request, response);
    }
}