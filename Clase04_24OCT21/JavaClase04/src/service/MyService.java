package service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class MyService {
	
	public double calcVenta(double precio, int cantidad){
		double venta;
		venta = precio * cantidad;
		return venta;
	}
	
	public double solesToDolares(double soles){
		double dolares;
		dolares = soles / 3.93;
		return dolares;
	}

}
