package com.igh.todobarato.prueba;

import com.igh.todobarato.service.PagoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {

    public static void main(String[] args) {
		 // Variables
		 double importe, impuesto, total;
		 // Datos
		 importe = 100.0;
		 // Proceso 
		 PagoService pagoService = new PagoService();
		 impuesto = pagoService.calcularImpuesto(importe);
		 total = pagoService.calcularTotal(importe);
       // Reporte
		 System.out.println("Importe: " + importe);
		 System.out.println("Impuesto: " + impuesto);
		 System.out.println("Total: " + total);
    }

}
