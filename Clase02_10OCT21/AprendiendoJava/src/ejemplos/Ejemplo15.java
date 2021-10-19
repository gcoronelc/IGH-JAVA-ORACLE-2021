package ejemplos;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo15 {

	public static void main(String[] args) {
			
		// Mostrar los números pares entre <m,n>
		
		// Variables
		int m, n, temp, resto;
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
		while(m<=n){
			resto = (m%2);
			if(resto==0){
				System.out.println(m);
			}
			m++;
		}


	}

}
