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
public class Prueba01 {
	
	public static void main(String[] args) {
		// Variables
		int nota1, nota2, nota3, nota4, promedio;
		// Datos
		nota1 = 15;
		nota2 = 18;
		nota3 = 10;
		nota4 = 16;
		// Proceso
		NotasService notasService = new NotasService();
		promedio = notasService.promediarPracticasV2(nota1, nota2, nota3, nota4);
		// Reporte
		System.out.println("Promedio: " + promedio);
	}

}
