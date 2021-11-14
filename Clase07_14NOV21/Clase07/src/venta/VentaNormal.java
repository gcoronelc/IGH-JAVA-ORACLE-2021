package venta;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class VentaNormal extends VentaAbstract {

	@Override
	public double calcular(double precio, int cantidad) {
		return (precio * cantidad);
	}

}
