package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo04 {

	public static void main(String[] args) {
		// Variables;
		final int N = 5;
		int factorial;
		// Proceso 1
		/*
		factorial = 1;
		for (int i = 1; i <= N; i++){
			factorial *= i;
		}*/
		// Proceso 2
		factorial=1;
		for (int i = 2; i <= N; factorial *= i++);
		// Reporte
		System.out.println("Factorial: " + factorial);
	}

}
