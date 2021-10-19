package ejemplos;

// Encontrar el mayo de 2 numeros
import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		int num1, num2, mayor;
		String reporte = "";
		// Lectura
		/*
		System.out.print("Número 1: ");
		num1 = scanner.nextInt();
		System.out.print("Número 2: ");
		num2 = scanner.nextInt();
		*/
		
		num1 = 60;
		num2 = 60;

		// Proceso
		/*
		if(num1 > num2){
			reporte = "El mayor es " + num1;
		} else {
			if(num2 > num1){
				reporte = "El mayor es " + num2;
			} else {
				reporte = "Son iguales";
			}
		}
		
		
		if (num1 > num2) {
			reporte = "El mayor es " + num1;
		}
		if (num2 > num1) {
			reporte = "El mayor es " + num2;
		}
		if (num1 == num2) {
			reporte = "Son iguales";
		}
		 */
		

		reporte = "Son iguales"; // Punto de partida
		reporte = (num1>num2)?"Mayor: " + num1:reporte;
		reporte = (num2>num1)?"Mayor: " + num2:reporte;

		
		// Reporte
		System.out.println("");
		System.out.println(reporte);
	}

}
