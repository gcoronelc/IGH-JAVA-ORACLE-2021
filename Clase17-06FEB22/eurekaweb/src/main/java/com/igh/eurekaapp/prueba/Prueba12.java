package com.igh.eurekaapp.prueba;

import java.util.List;
import java.util.Map;

import com.igh.eurekaapp.service.ReporteService;
import com.igh.eurekaapp.service.impl.ReporteServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba12 {

	public static void main(String[] args) {
		try {
			ReporteService service = new ReporteServiceImpl();
			List<Map<String,?>> lista = service.obtenerListaCuentas();
			for (Map<String, ?> map : lista) {
				System.out.println(map.get("CUENTA").toString() + " - " + map.get("SALDO").toString());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
