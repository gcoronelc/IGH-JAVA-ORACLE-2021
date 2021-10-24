package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Ejemplo03 {

	public static void main(String[] args) {
		int mes = 11;
		String dato = switch (mes) {
			case 1,2,3 ->
				"1er trimestre";
			case 4,5,6 ->
				"2do trimestre";
			default ->
				"2do sementre";
		};
		System.out.println("Dato: " + dato);

	}

}
