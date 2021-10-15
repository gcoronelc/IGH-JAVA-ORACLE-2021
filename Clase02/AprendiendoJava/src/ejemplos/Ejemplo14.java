package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo14 {

	public static void main(String[] args) {
		
		// Acumulador:
		// Variable que se incrementa en un valor no contante
		
		// Encontrar la suma de multiplos de 3 entre <m,n>
		
		// Variables
		int m, n, temp, resto, suma;
		Scanner scanner = new Scanner(System.in);
		
		// Leer los valores de m y n
		System.out.print("Valor de m: ");
		m = scanner.nextInt();
		System.out.print("Valor de n: ");
		n = scanner.nextInt();
		
		// Verificando datos
		if(m > n){
			temp = m;
			m = n;
			n = temp;
		}
		
		// Proceso
		suma = 0;
		while(m<=n){
			resto = (m%3);
			suma += (resto==0)?m:0;
			m++;
		}

		// Reporte
		System.out.println("");
		System.out.println("Multiplos de 3: " + suma);
	}

}
