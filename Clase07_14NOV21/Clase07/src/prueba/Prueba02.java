package prueba;

import service.Clase1;
import service.Clase2;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {

    public static void main(String[] args) {
		 // Variables
		 int num1, num2, suma, producto;
		 // Datos
		 num1 = 10;
		 num2 = 6;
		 // Proceso
		 Clase1 bean = new Clase2();
		 suma = bean.sumar(num1, num2);
		 // producto = bean.multiplicar(num1, num2); // Error
		 // Reporte
		 System.out.println("Suma: " + suma);
		 // System.out.println("Producto: " + producto); // Error
    }

}
