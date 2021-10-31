package javaclase05.prueba;

import javaclase05.model.Persona;

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
		
		Persona obj1 = new Persona();
		
		System.out.println("Color de ojos: " + obj1.getColorOjos());
		System.out.println("Color de pelo: " + obj1.getColorPelo());
		System.out.println("Talla: " + obj1.getTalla());
		System.out.println("Edad: " + obj1.getEdad());
		System.out.println("Profesión: " + obj1.getProfesion());
		
	}

}
