package ejemplos;

import java.util.ArrayList;


/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo10 {

	public static void main(String[] args) {
		
		ArrayList<String> amigos = new ArrayList<String>();
		
		amigos.add("Sergio");
		amigos.add("Guino");
		amigos.add("Ricardo");
		amigos.add("Julio");
		amigos.add("Hugo");
		amigos.add("Gustavo");
		
		// Recorrido tipo colección
		for (String dato : amigos) {
			System.out.println(dato);
		}
		
		// Usando programación fincional o lambda
		amigos.forEach((dato) -> {
			System.out.println(dato);
		});
		
		
	}

}
