package proyectoejemplo.service;

import proyectoejemplo.dto.SueldoDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class SueldoService {

	public SueldoDto procesarSueldo(SueldoDto dto) {
		// Variables
		double totalIngresos;
		double renta;
		double totalNeto;
		// Proceso
		totalIngresos = dto.getHorasPorDia() * dto.getDiasTrabajados() * dto.getPagoHora();
		renta = totalIngresos * (totalIngresos>1500.0?0.08:0.0);
		totalNeto = totalIngresos - renta;
		// Reporte
		dto.setTotalIngresos(totalIngresos);
		dto.setRenta(renta);
		dto.setTotalNeto(totalNeto);
		return dto;
	}

}
