package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.controller.ReporteController;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba13 {
	
	public static void main(String[] args) {
		Prueba13 bean = new Prueba13();
		bean.ejecutar();
	}

	public void ejecutar() {
		try {
			// Proceso
			ReporteController control = new ReporteController();
			List<Map<String, ?>> lista = control.obtenerListaCuentas();
			// Preparar reporte
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			Map pars = new HashMap();
			String reporte = "/reportes/ReporteCuentas2.jrxml";
			InputStream is = getClass().getResourceAsStream(reporte);
			if (is == null) {
				throw new RuntimeException("No carga el reporte.");
			}
			JasperReport rep = JasperCompileManager.compileReport(is);
			JasperPrint print = JasperFillManager.fillReport(rep, pars, data);
			// Mostrar Reporte
			JasperViewer viewer = new JasperViewer(print, false);
			viewer.setTitle("Mi Reporte");
			viewer.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
