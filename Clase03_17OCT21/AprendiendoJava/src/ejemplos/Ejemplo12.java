package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Número: ");
		int n = scanner.nextInt();
		String msg = "si es primo"; // Se asume que si es primo 
		for (int k = 2; k < n; k++) {
			if (n % k == 0) {
				msg = "no es primo";
				break;
			}
		}
		System.out.println("n: " + n);
		System.out.println("Resultado: " + msg);
	}

}
