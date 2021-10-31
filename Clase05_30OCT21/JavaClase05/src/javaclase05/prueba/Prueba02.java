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
public class Prueba02 {

	public static void main(String[] args) {

		Persona juana = new Persona("Marrones", "Castaño", 160, 28, "Ingeniera de Sistemas");

		System.out.println("Color de ojos: " + juana.getColorOjos());
		System.out.println("Color de pelo: " + juana.getColorPelo());
		System.out.println("Talla: " + juana.getTalla());
		System.out.println("Edad: " + juana.getEdad());
		System.out.println("Profesión: " + juana.getProfesion());
		
	}

}
