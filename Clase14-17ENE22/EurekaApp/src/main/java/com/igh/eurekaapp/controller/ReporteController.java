package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.service.ReporteService;
import com.igh.eurekaapp.service.impl.ReporteServiceImpl;
import java.util.List;
import java.util.Map;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class ReporteController {
	
	private ReporteService reporteService;

	public ReporteController() {
		reporteService = new ReporteServiceImpl();
	}

	public List<Map<String,?>> obtenerListaCuentas(){
		return reporteService.obtenerListaCuentas();
	}

}
