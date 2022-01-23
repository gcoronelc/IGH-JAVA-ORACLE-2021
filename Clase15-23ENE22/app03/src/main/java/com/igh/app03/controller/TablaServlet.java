package com.igh.app03.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igh.app03.service.TablaService;

public class TablaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables
		int numero;
		List<Map<String,Integer>> tabla = new ArrayList();
		// Datos
		numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		TablaService tablaService = new TablaService();
		tabla = tablaService.tablaMultiplicar(numero);
		// Reporte
		request.setAttribute("tabla", tabla);
		request.setAttribute("numero", numero);
		RequestDispatcher rd = request.getRequestDispatcher("tabla.jsp");
		rd.forward(request, response);
	}

}
