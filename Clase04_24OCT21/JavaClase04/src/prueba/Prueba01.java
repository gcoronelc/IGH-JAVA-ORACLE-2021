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
public class Prueba01 {

    public static void main(String[] args) {
		 // Variables
		 double precio, importe;
		 int cantidad;
		 // Datos
		 precio = 89.99;
		 cantidad = 5;
		 // Proceso
		 MyService myService = new MyService();
		 importe = myService.calcVenta(precio, cantidad);
		 // Reporte
		 System.out.println("Precio: " + precio);
		 System.out.println("Cantidad: " + cantidad);
		 System.out.println("Importe: " + importe);
        
    }

}
