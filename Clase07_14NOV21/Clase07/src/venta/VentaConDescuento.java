package venta;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class VentaConDescuento extends VentaAbstract{

	@Override
	public double calcular(double precio, int cantidad) {
		// Variable
		double importe;
		// Proceso
		importe = precio * cantidad;
		if(cantidad >= 12){
			importe *= 0.95;
		}
		// Reporte
		return importe;
	}

}
