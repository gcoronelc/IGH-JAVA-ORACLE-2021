package ejemplos;

import java.util.Scanner;

/*
Este ejemplo muestra la flexibilidad de la estructura for.
Calcula el MCD y MCD de dos numeros.
 */
/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo08 {

	public static void main(String[] args) {
		// Variables
		int n1, n2, n1_aux, n2_aux, mcd, mcm;
		// Lectura de datos
		n1 = leerEnteroPositivo("Ingrese valor de n1: ");
		n2 = leerEnteroPositivo("Ingrese valor de n2: ");
		// Proceso
		n1_aux = n1;
		n2_aux = n2;
		for (; n1 != n2;) {
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		mcd = n1;
		mcm = n1_aux * n2_aux / mcd;
		// Reporte
		System.out.println("");
		System.out.println("n1 => " + n1_aux);
		System.out.println("n2 => " + n2_aux);
		System.out.println("mcd => " + mcd);
		System.out.println("mcm => " + mcm);
	}

	private static int leerEnteroPositivo(String etiqueta) {
		Scanner scanner = new Scanner(System.in);
		int n;
		// Proceso: Inicio
		do {
			System.out.print(etiqueta);
			n = scanner.nextInt();
		} while (n <= 0);
		// Proceso: Fin
		return n;
	}

}
