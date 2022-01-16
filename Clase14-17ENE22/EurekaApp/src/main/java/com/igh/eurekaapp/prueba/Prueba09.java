package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.service.CuentaService;
import com.igh.eurekaapp.service.impl.CuentaServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba09 {

	public static void main(String[] args) {
		try {
			// Datos
			String cliente = "00007";
			String moneda = "02";
			Double importe = 0.0;
			String clave = "123456";
			String empleado = "0002";
			// Proceso
			CuentaService service = new CuentaServiceImpl();
			String cuenta = service.crearCuenta(cliente, moneda, importe, clave,empleado);
			// Reporte
			System.out.println("Cuenta: " + cuenta);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		} 
	}

}
