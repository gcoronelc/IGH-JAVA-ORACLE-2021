package prueba;

import javax.swing.JOptionPane;
import model.Persona;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba04 {
	
	private String profesor = "Gustavo Coronel";

    public static void main(String[] args) {
		 
		 Persona gustavo = new Persona("Frances");
		 Persona claudia = new Persona("Ingles");
		 System.out.println("Idioma: " + Persona.IDIOMA);
		 mostrarIdioma();
		 new Persona("Quechua");
		 mostrarIdioma();
		 System.out.println("PI: " + Math.PI);
		 
		 JOptionPane.showMessageDialog(null, "Hola Gustavo.");
		 
		 // Un método con alcance de clase, no tiene acceso a variables y métodos de instancia.
		 //System.out.println("Profesor: " + profesor);
		 
    }

	private static void mostrarIdioma() {
		System.out.println(Persona.IDIOMA);
	}
	 
}
