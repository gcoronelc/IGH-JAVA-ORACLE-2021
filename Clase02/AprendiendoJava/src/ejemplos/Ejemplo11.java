package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo11 {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		int numero, resto;
		String reporte;
		// Lectura de datos
		System.out.println("LECTURA DE DATOS");
		System.out.println("======================================");
		System.out.print("Número entero: ");
		numero = scanner.nextInt();
		// Proceso
		resto = numero % 2;
		if(resto==0){
			reporte = numero + " es par.";
		} else {
			reporte = numero + " es impar.";
		}
		// Reporte
		System.out.println("");
		System.out.println("REPORTE");
		System.out.println("======================================");
		System.out.println(reporte);
		
	}

}
