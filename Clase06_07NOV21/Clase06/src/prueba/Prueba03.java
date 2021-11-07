package prueba;

import model.Punto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba03 {

    public static void main(String[] args) {
		 
        Punto punto1 = new Punto();
		  punto1.setAbscisa(3);
		  punto1.setOrdenada(4);
		  
		  Punto punto2 = new Punto(3, 4);
		  
		  System.out.println("Cuadrante punto 1: " + punto1.getCuadrante());
		  System.out.println("Cuadrante punto 2: " + punto1.getCuadrante());
    }

}
