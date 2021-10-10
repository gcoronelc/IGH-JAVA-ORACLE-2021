package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		System.out.print("a = ");
		a = scanner.nextInt();
		System.out.print("b = ");
		b = scanner.nextInt();
		System.out.println("\n");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		b += a;
		System.out.println("\n");
		System.out.println("Nuevo valor de b = " + b);
	}

}
