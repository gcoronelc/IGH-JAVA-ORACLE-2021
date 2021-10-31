package javaclase05.model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Persona {

	private String colorOjos;
	private String colorPelo;
	private int talla;
	private int edad;
	private String profesion;

	// Constructor por defecto
	public Persona() {
		System.out.println("Objeto creado.");
		this.colorOjos = "Marrones";
		this.colorPelo = "Negro";
		this.talla = 175;
		this.edad = 24;
		this.profesion = "Ingeniero de Sistemas";
	}

	// Constructor adicional
	public Persona(String colorOjos, String colorPelo, int talla, int edad, String profesion) {
		this.colorOjos = colorOjos;
		this.colorPelo = colorPelo;
		this.talla = talla;
		this.edad = edad;
		this.profesion = profesion;
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("Objeto librerado.");
	}
	
	

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

}
