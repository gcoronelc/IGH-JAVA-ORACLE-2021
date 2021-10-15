package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Número: ");
		int n = scanner.nextInt();
		int k = 0; // Contador 
		int r; // Variable auxiliar 
		System.out.println("Tabla de Multiplicar del numero: " + n);
		while (++k <= 12) {
			r = n * k;
			System.out.println(k + " * " + n + " = " + r);
		}
		System.out.println("--- Fin ---");
	}

}
