package prueba;

import service.Clase1;
import service.Clase2;
import service.Clase3;
import service.Clase4;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba05 {

    public static void main(String[] args) {
		 
		 Object bean = new Clase2();
		 
		 System.out.println("Compatible con Clase1: " + (bean instanceof Clase1));
		 System.out.println("Compatible con Clase2: " + (bean instanceof Clase2));
		 System.out.println("Compatible con Clase3: " + (bean instanceof Clase3));
		 System.out.println("Compatible con Clase4: " + (bean instanceof Clase4));

    }

}
