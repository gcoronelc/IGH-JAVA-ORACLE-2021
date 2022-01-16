package com.igh.sumaapp.servlets;

import com.igh.sumaapp.service.MatematicaService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo Coronel
 */
@WebServlet(name = "Sumar", urlPatterns = {"/Sumar"})
public class Sumar extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables
		int num1, num2, suma;
		// Datos
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		// Proceso
		MatematicaService service = new MatematicaService();
		suma = service.sumar(num1, num2);
		// Respuesta
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head><title>RESULTADO SOLICITADO</title></head>");
		out.println("<body>");
		out.println("<h1>SUMA DE 2 NUMEROS</h1>");
		out.println("<p>Número 1: " + num1 + "</p>");
		out.println("<p>Número 2: " + num2 + "</p>");
		out.println("<p>Suma: " + suma + "</p>");
		out.println("<a href='index.html'>Retornar</a>");
		out.println("</body></html>");
	}

}
