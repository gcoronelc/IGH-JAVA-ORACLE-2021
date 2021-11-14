package com.igh.casadecambio.prueba;

import com.igh.casadecambio.service.impl.DolaresToSoles;
import com.igh.casadecambio.service.impl.SolesToDolares;
import com.igh.casadecambio.service.impl.SolesToEuros;
import com.igh.casadecambio.service.spec.TipoCambio;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba {

    public static void main(String[] args) {
		 // Variables
		 double importe, cambio;
		 // Datos
		 importe = 1000;
		 // Proceso
		 TipoCambio service = new SolesToEuros();
		 cambio = service.ejecutarCambio(importe);
		 // Reporte
		 System.out.println("Cambio: " + cambio);
    }

}
