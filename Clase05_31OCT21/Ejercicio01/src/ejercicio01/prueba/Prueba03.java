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
public class Prueba03 {

    public static void main(String[] args) {
		 // Variables
		 int promFinal;
		 String estado;
		 // Datos
		 promFinal = 15;
		 // Proceso
		 NotasService notasService = new NotasService();
		 estado = notasService.obtenerEstado(promFinal);
		 // Reporte
		 System.out.println("Estado: " + notasService.obtenerEstado(promFinal));        
    }

}
