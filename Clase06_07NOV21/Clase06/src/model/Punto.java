package model;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Punto {

	private double abscisa;
	private double ordenada;

	// constructor por defecto
	public Punto() {
	}

	// Constructor adicional
	public Punto(double abscisa, double ordenada) {
		this.abscisa = abscisa;
		this.ordenada = ordenada;
	}

	public double getAbscisa() {
		return abscisa;
	}

	public void setAbscisa(double abscisa) {
		this.abscisa = abscisa;
	}

	public double getOrdenada() {
		return ordenada;
	}

	public void setOrdenada(double ordenada) {
		this.ordenada = ordenada;
	}

	public String getCuadrante() {
		return "En construcción";
	}

}
