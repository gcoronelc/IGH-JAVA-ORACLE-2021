package com.igh.app03.prueba;

import java.util.List;
import java.util.Map;

import com.igh.app03.service.TablaService;


public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		int numero;
		List<Map<String, Integer>> tabla;
		// Datos
		numero = 8;
		// Proceso
		TablaService tablaService = new TablaService();
		tabla = tablaService.tablaMultiplicar(numero);
		// Reporte
		for (Map<String, Integer> row : tabla) {
			System.out.println(row.get("col1") + " * " + row.get("col2") + " = " + row.get("col3"));
		}
	}

}
