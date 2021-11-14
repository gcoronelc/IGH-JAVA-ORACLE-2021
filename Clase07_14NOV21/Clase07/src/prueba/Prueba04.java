package prueba;

import venta.VentaAbstract;
import venta.VentaConDescuento;
import venta.VentaNormal;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba04 {

    public static void main(String[] args) {
		 VentaAbstract bean = new VentaConDescuento();
		 System.out.println("Importe: " + bean.calcular(40, 18));
    }

}
