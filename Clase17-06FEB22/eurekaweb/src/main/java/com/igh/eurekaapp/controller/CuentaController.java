package com.igh.eurekaapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igh.eurekaapp.dto.ComboDto;
import com.igh.eurekaapp.dto.EmpleadoDto;
import com.igh.eurekaapp.service.ComboService;
import com.igh.eurekaapp.service.CuentaService;
import com.igh.eurekaapp.service.impl.ComboServiceImpl;
import com.igh.eurekaapp.service.impl.CuentaServiceImpl;

@WebServlet({ "/CrearCuentaForm", "/CrearCuentaProc" })
public class CuentaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/CrearCuentaForm":
			crearCuentaForm(request, response);
			break;
		case "/CrearCuentaProc":
			crearCuentaProc(request, response);
			break;
		}
	}

	
	private void crearCuentaProc(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// Datos
		String cliente = request.getParameter("cliente");
		String moneda = request.getParameter("moneda");
		Double importe = Double.parseDouble(request.getParameter("importe"));
		String clave = request.getParameter("clave");
		// Empleado
		HttpSession session = request.getSession();
		EmpleadoDto bean = (EmpleadoDto) session.getAttribute("usuario");
		// Proceso
		CuentaService cuentaService = new CuentaServiceImpl();
		String mensaje, nroCuenta;
		try {
			nroCuenta = cuentaService.crearCuenta(cliente, moneda, importe, clave, bean.getCodigo());
			mensaje = "Cuenta: " + nroCuenta;
		} catch (Exception e) {
			mensaje = e.getMessage();
		}
		// Reporte
		response.setContentType("text/plain;charset=UTF-8");
        ServletOutputStream out = response.getOutputStream();
        out.print(mensaje);
        out.flush();
	}
	
	private void crearCuentaForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Datos
		ComboService comboService = new ComboServiceImpl();
		List<ComboDto> clientes = comboService.getClientes();
		List<ComboDto> monedas = comboService.getMonedas();
		// Reporte
		request.setAttribute("clientes", clientes);
		request.setAttribute("monedas", monedas);
		RequestDispatcher rd = request.getRequestDispatcher("crearCuenta.jsp");
		rd.forward(request, response);
	}
}
