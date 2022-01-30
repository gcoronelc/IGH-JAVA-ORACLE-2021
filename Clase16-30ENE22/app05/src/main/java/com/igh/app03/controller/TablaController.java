package com.igh.app03.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.igh.app03.service.TablaService;

@WebServlet(name = "TablaController", urlPatterns = { "/TablaController" })
public class TablaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Variables
		int numero;
		List<Map<String, Integer>> tabla = new ArrayList();
		// Datos
		numero = Integer.parseInt(request.getParameter("numero"));
		// Proceso
		TablaService tablaService = new TablaService();
		tabla = tablaService.tablaMultiplicar(numero);
		// Reporte
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		Gson gson = new Gson();
		String respuesta = gson.toJson(tabla);
		PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(respuesta);
        out.flush();  
	}

}
