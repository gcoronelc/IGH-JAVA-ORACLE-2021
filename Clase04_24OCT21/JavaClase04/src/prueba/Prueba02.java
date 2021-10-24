package prueba;

import service.MyService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {

    public static void main(String[] args) {
		 // Variables
		 double dolares, soles;
		 // Datos
		 soles = 5369;
		 // Proceso
		 MyService myService = new MyService();
		dolares = myService.solesToDolares(soles);
		 // Reporte
		 System.out.println("Soles: " + soles);
		 System.out.println("Dolares: " + dolares);
    }

}
