package aprendiendojavaclase01.programas;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Programa03 {

	public static void main(String[] args) {
		
		// Usando Scanner para obtener información del usuario 
		Scanner scanner = new Scanner(System.in);
		
		// Declaración de variable
		int n1, n2, suma;
		
		// Datos
		// Se solicita al usuario que ingrese los 2 números
		System.out.print("Número 1: ");
		n1 = scanner.nextInt();
		System.out.print("Número 2: ");
		n2 = scanner.nextInt();
		
		// Proceso
		suma = n1 + n2;
		
		// Reporte
		System.out.println("Suma: " + suma);
		
	}

}
