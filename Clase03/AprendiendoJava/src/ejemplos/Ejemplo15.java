package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo15 {

	public static void main(String[] args) {

		int notas[][];

		notas = new int[3][4];
		notas[1][3] = 20;

		for (int i = 0; i < notas.length; i++) {
			int[] fila = notas[i];
			for (int j = 0; j < fila.length; j++) {
				int nota = fila[j];
				System.out.print("\t" + nota);
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------");
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print("\t" + notas[i][j]);
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------");
		for (int[] fila : notas) {
			for (int nota : fila) {
				System.out.print("\t" + nota);
			}
			System.out.println("");
		}

	}

}
