package com.igh.sumaapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TipoSaludo", urlPatterns = {"/Hola", "/Hi"})
public class TipoSaludo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
			case "/Hola":
				procesarHola(request, response);
				break;
			case "/Hi":
				procesarHi(request, response);
				break;
		}
	}

	private void procesarHola(HttpServletRequest request, HttpServletResponse response) throws IOException {
		responder(request, response, "Hola todo el mundo.");
	}

	private void procesarHi(HttpServletRequest request, HttpServletResponse response) throws IOException {
		responder(request, response, "Hello everyone.");
	}

	private void responder(HttpServletRequest request, HttpServletResponse response, String mensaje) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>NENSAJE</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + mensaje + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
