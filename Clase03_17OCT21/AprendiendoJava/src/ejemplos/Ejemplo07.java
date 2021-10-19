package ejemplos;

import java.util.Scanner;

/*
El siguiente ejemplo permite elevar un número entero a una potencia.
La restricción es considerar solo números enteros, y la potencia solo positivos.
*/

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo07 {

	public static void main(String[] args) {
		// Variables
		Scanner scanner = new Scanner(System.in);
		int base, exponente, potencia;
		// Lectura de la base
		System.out.print("Ingrese la base: ");
		base = scanner.nextInt();
		// Lectura del exponente 
		do{
			System.out.print("Ingrese el exponente: ");
			exponente = scanner.nextInt();
		}while(exponente<=0);
		// Proceso
		potencia = 1;
		for (int i = 1; i <= exponente; i++) {
			potencia *= base;
		}
		// Reporte
		System.out.println("Base: " + base);
		System.out.println("Exponente: " + exponente);
		System.out.println("Potencia: " + potencia);
	}

}
