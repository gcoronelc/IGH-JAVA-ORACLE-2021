package proyectoejemplo.pruebas;

import proyectoejemplo.dto.SueldoDto;
import proyectoejemplo.service.SueldoService;

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
		SueldoDto sueldoDto;
		// Datos
		sueldoDto = new SueldoDto(5, 20, 90);
		// Proceso
		SueldoService sueldoService = new SueldoService();
		sueldoDto = sueldoService.procesarSueldo(sueldoDto);
		// Reporte
		System.out.println("Total de ingresos: " + sueldoDto.getTotalIngresos());
		System.out.println("Remta: " + sueldoDto.getRenta());
		System.out.println("Total Neto: " + sueldoDto.getTotalNeto());
	}

}
