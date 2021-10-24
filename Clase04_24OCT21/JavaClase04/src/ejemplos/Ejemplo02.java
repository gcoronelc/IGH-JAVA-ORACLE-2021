package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		int x = 7;
		switch (x) {
			case 1,2,3 -> System.out.println("1er trimestre");
			case 4,5,6 -> System.out.println("2do trimestre");
			default -> System.out.println("2do sementre");
		}
	}

}
