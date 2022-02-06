package com.igh.eurekaapp.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.igh.eurekaapp.service.ReporteService;
import com.igh.eurekaapp.service.impl.ReporteServiceImpl;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

@WebServlet({ "/ReporteCuentas1", "/ReporteCuentas2", "/ReporteClientes1", "/ReporteClientes2" })
public class ReporteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/ReporteCuentas1":
			reporteCuentas1(request, response);
			break;
		case "/ReporteCuentas2":
			reporteCuentas2(request, response);
			break;
		}
	}

	private void reporteCuentas1(HttpServletRequest request, HttpServletResponse response) {
		try {
			// Data
			ReporteService reporteService = new ReporteServiceImpl();
			List<Map<String, ?>> lista = reporteService.obtenerListaCuentas();
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			// Objeto JasperReport
			String reporte = "/reportes/ReporteCuentas2.jrxml";
			InputStream is = getClass().getResourceAsStream(reporte);
			JasperReport jasperReport = JasperCompileManager.compileReport(is);
			// Ejecutar el reporte
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, null, data);
			// Enviar PDF
			enviarPDF(response, bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void reporteCuentas2(HttpServletRequest request, HttpServletResponse response) {
		try {
			// Data
			ReporteService reporteService = new ReporteServiceImpl();
			List<Map<String, ?>> lista = reporteService.obtenerListaCuentas();
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			// Objeto JasperReport
			String reporte = "/reportes/ReporteCuentas2.jrxml";
			InputStream is = getClass().getResourceAsStream(reporte);
			JasperReport jasperReport = JasperCompileManager.compileReport(is);
			// Ejecutar el reporte
			byte[] bytes = JasperRunManager.runReportToPdf(jasperReport, null, data);
			// Enviar PDF
			descargarPDF(response, bytes, "listadoCuentas.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void descargarPDF(HttpServletResponse response, byte[] bytes, String nombre) throws IOException {
		response.setContentType("application/x-download");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + nombre + "\"");
		response.setContentLength(bytes.length);
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes, 0, bytes.length);
		out.flush();
		out.close();
	}

	private void enviarPDF(HttpServletResponse response, byte[] bytes) throws IOException {
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes, 0, bytes.length);
		out.flush();
		out.close();
	}
}
