package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo10 {

	public static void main(String[] args) {

		// Variables
		Scanner scanner = new Scanner(System.in);
		double precio, porcDcto, importeBruto, dcto, importeNeto;
		int cantidad;
		// Lectura de datos
		System.out.println("LECTURA DE DATOS");
		System.out.println("======================================");
		System.out.print("Precio: ");
		precio = scanner.nextDouble();
		System.out.print("% de descuento: ");
		porcDcto = scanner.nextDouble();
		System.out.print("Cantidad: ");
		cantidad = scanner.nextInt();
		// Proceso
		importeBruto = precio * cantidad;
		dcto = 0.0;
		if(cantidad>=6){
			dcto = importeBruto * porcDcto/100;
		}
		importeNeto = importeBruto - dcto;
		// Reporte
		System.out.println("");
		System.out.println("REPORTE");
		System.out.println("======================================");
		System.out.println("Importe bruto: " + importeBruto);
		System.out.println("Descuento: " + dcto);
		System.out.println("Importe neto: " + importeNeto);
		
	}

}
