package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo13 {

	public static void main(String[] args) {
		
		// Contador:
		// Variable que se incrementa en un valor constante
		
		// Encontrar la cantidad de multiplos de 3 entre <m,n>
		
		// Variables
		int m, n, temp, resto, contador;
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
		contador = 0;
		while(m<=n){
			resto = (m++%3);
			contador += (resto==0)?1:0;
		}

		// Reporte
		System.out.println("");
		System.out.println("Multiplos de 3: " + contador);
	}

}
