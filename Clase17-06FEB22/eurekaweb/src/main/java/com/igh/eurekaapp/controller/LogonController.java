package com.igh.eurekaapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igh.eurekaapp.dto.EmpleadoDto;
import com.igh.eurekaapp.service.LogonService;
import com.igh.eurekaapp.service.impl.LogonServiceImpl;

/**
 * Servlet implementation class LogonController
 */
@WebServlet({ "/Ingresar", "/Salir" })
public class LogonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/Ingresar":
			ingresar(request, response);
			break;
		case "/Salir":
			salir(request, response);
			break;
		}
	}

	private void ingresar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Datos
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		// Proceso
		LogonService logonService = new LogonServiceImpl();
		EmpleadoDto bean = logonService.validarUsuario(usuario, clave);
		String destino;
		if(bean==null) {
			destino = "index.jsp";
			request.setAttribute("error", "Datos incorrectos");
		} else {
			destino = "main.jsp";
			HttpSession session = request.getSession(true);
			session.setAttribute("usuario", bean);
		}
		// Reporte
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
	}

	private void salir(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}
}
