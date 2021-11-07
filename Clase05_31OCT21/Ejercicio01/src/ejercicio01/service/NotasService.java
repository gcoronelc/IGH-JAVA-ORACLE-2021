package ejercicio01.service;

import java.util.Arrays;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class NotasService {

	/**
	 * Calcula el promedio de practicas.
	 *
	 * @param pract1
	 * @param pract2
	 * @param pract3
	 * @param pract4
	 * @return
	 */
	public int promediarPracticas(int pract1, int pract2, int pract3, int pract4) {
		// Variables
		int notaMenor, promedio;
		// Proceso
		notaMenor = obtenerMenorNota(pract1, pract2, pract3, pract4);
		promedio = (pract1 + pract2 + pract3 + pract4 - notaMenor) / 3;
		// Reporte
		return promedio;
	}

	private int obtenerMenorNota(int pract1, int pract2, int pract3, int pract4) {
		// Variables
		int nota;
		// Proceso
		nota = pract1;
		nota = (nota > pract2) ? pract2 : nota;
		nota = (nota > pract3) ? pract3 : nota;
		nota = (nota > pract4) ? pract3 : nota;
		// Reporte
		return nota;
	}

	public int promediarPracticasV2(int pract1, int pract2, int pract3, int pract4) {
		// Variables
		int[] notas;
		int suma, promedio;
		// Proceso
		notas = new int[]{pract1, pract2, pract3, pract4};
		Arrays.sort(notas);
		suma = 0;
		for (int i = 1; i < notas.length; i++) {
			suma += notas[i];
		}
		promedio = suma / 3;
		// Reporte
		return promedio;
	}

	/**
	 * Calcula el promedio final.
	 *
	 * @param pp Promedio de practicas
	 * @param ep Examen parcial
	 * @param ef Examen final
	 * @return Retorna el promedio final del curso.
	 */
	public int promedioFinal(int pp, int ep, int ef) {
		// Variables
		int promedio;
		// Proceso
		promedio = (int) (pp * 0.25 + ep * 0.25 + ef * 0.50);
		// Reporte
		return promedio;
	}
	
	
	public String obtenerEstado(int promFinal){
		// Variables
		String estado;
		// Proceso
		estado = (promFinal>=14)?"Aprobado":"Desaprobado";
		// Reporte
		return estado;
	}

}
