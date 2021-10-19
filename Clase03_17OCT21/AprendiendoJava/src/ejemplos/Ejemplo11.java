package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo11 {

	public static void main(String[] args) {
		
		for (int i = 1; i <10; i++) {
			if(i==4) continue;
			System.out.println("i = " + i);
			if(i==7) break;
		}
		System.out.println("Chau bucle.");

	}

}
