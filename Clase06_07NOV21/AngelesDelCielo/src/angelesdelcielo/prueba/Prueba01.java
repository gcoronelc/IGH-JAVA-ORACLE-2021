package angelesdelcielo.prueba;

import angelesdelcielo.service.MyMath;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			long f = MyMath.factorial(i);
			System.out.println("Factorial de " + i + " es " + f);
		}
	}

}
