package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo04 {

	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		int n;
		boolean ok;
		// Lectura
		System.out.print("Número entero: ");
		n = scanner.nextInt();
		// Proceso
		ok = (n % 3 == 0);
		ok &= (n % 5 == 0);
		// Reporte
		System.out.println("");
		System.out.println("n = " + n);
		System.out.println("Condicion = " + Boolean.toString(ok));
	}

}
