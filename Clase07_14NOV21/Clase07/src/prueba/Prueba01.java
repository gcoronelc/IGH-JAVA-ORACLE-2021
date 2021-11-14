package prueba;

import service.Clase2;

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
		 // Variables
		 int num1, num2, suma;
		 // Datos
		 num1 = 70;
		 num2 = 90;
		 // Proceso
		 Clase2 clase2 = new Clase2();
		 suma = clase2.sumar(num1, num2);
		 // Reporte
		 System.out.println("Suma: " + suma);
    }

}
