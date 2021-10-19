package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo05 {

	public static void main(String[] args) {
		// Variables;
		int notas[] = {20, 18, 15, 16, 14};
		// Reporte 1
		System.out.println("REPORTE 1");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota[" + i + "] = " + notas[i]);
		}
		// Reporte 2
		System.out.println("REPORTE 2");
		for (int nota : notas) {
			System.out.println(nota);
		}
	}

}
