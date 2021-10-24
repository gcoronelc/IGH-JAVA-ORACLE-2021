package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Ejemplo04 {

	public static void main(String[] args) {

		// El tipo de dato de la variable
		// depende del dato que se le asigna.
		var a = 10;
		var b = 98.59f;
		var c = "Gustavo Coronel";

		// Mostrando el tipo de datos
		System.out.println("a: " + ((Object)a).getClass().getSimpleName());
		System.out.println("b: " + ((Object)b).getClass().getSimpleName());
		System.out.println("c: " + ((Object)c).getClass().getSimpleName());
		
		// Explicando un caso
		Object o;
		o = a;
		System.out.println(o.getClass().getSimpleName());
		
		Ejemplo01 o1 = new Ejemplo01();
		System.out.println(o1.getClass().getSimpleName());
		
		o = o1;
		System.out.println(o.getClass().getSimpleName());
		
	}

}
