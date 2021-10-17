package ejemplos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo09 {

	public static void main(String[] args) {
		
		int arreglo[] = {43,56,12,34,76,23};
		int suma = 0; 
		
		for( int numero: arreglo ) 
			suma += numero; 
		
		System.out.println( "Suma => " + suma );
		
		

	}

}
