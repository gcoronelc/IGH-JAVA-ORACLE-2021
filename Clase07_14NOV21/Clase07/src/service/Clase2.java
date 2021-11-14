package service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Clase2 extends Clase1{

	public Clase2() {
		super("Gustavo");
		System.out.println("Hola desde Clase2");
	}
	
	@Override
	public int sumar(int n1, int n2) {
		int suma;
		suma = (n1 + n2) * (n1 - n2);
		return suma;
	}

	public int multiplicar(int n1, int n2) {
		return (n1 * n2);
	}

}
