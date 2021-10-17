package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo16 {

	public static void main(String[] args) {
		
		int[][] notas = {
			{12,65,12,56,23,98,58},
			{54,76,89,23,65},
			{87,34,56,12},
			{43,56,87,12,34,56}
		};
		
		for (int[] fila : notas) {
			for (int dato : fila) {
				System.out.print("\t" + dato);
			}
			System.out.println("");
		}
		
	}

}
