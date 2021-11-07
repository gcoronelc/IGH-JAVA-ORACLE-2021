package ejercicio01.prueba;

import ejercicio01.service.NotasService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {

    public static void main(String[] args) {
		 // Variables
		 int pp, ep, ef, promedio;
		 // Datos
		 pp = 12;
		 ep = 8;
		 ef = 18;
		 // Proceso
		 NotasService notasService = new NotasService();
		 promedio = notasService.promedioFinal(pp, ep, ef);
		 // Reporte
        System.out.println("Promedio final: " + promedio);
    }

}
