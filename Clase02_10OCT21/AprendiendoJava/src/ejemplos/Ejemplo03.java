package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo03 {

	public static void main(String[] args) {

		String nombre = null; // No existe el objeto

		if (nombre != null && nombre.equals("GUSTAVO")) {
			System.out.println("Bienvenido Gustavo");
		} else {
			System.out.println("Bienvenido a la tienda.");
		}
 
	}

}
