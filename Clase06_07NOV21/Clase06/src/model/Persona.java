package model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Persona {

	public static String IDIOMA;
	
	// Inicializador estático
	static {
		IDIOMA = "Español";
	}
	
	private Corazon corazon;

	public Persona() {
	}

	public Persona(String idioma) {
		System.out.println("IDIOMA: " + IDIOMA);
		IDIOMA = idioma;
	}
	
	

}
