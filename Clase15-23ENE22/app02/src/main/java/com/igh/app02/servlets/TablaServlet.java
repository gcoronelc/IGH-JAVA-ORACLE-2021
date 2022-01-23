package com.igh.app02.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TablaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Variables
		int numero;
		List<Map<String,Integer>> tabla = new ArrayList();
		// Datos
		numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		for(int i=1; i<=12; i++) {
			Map<String,Integer> row = new HashMap<>();
			row.put("col1", numero);
			row.put("col2", i);
			row.put("col3", numero*i);
			tabla.add(row);
		}
		System.out.println("Filas: " + tabla.size());
		// Reporte
		request.setAttribute("tabla", tabla);
		request.setAttribute("numero", numero);
		
		RequestDispatcher rd = request.getRequestDispatcher("tabla.jsp");
		rd.forward(request, response);
	}

}
