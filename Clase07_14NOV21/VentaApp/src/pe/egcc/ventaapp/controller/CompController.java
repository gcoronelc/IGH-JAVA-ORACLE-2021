package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.ItemModel;
import pe.egcc.ventaapp.service.ComprobanteFactory;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class CompController {

	/**
	 * Es para llenar el combo.
	 * @return Retorna un arreglo con os tipos de comprobante.
	 */
	public String[] traerTipos() {
		return ComprobanteFactory.getTipos();
	}

	/**
	 * Procesa la venta.
	 * @param tipo Tipo de comprobante.
	 * @param total Total de la venta.
	 * @return Retorna un arreglo con los datos de la venta.
	 */
	public ItemModel[] procVenta(String tipo, double total) {
		return ComprobanteFactory.getComprobante(tipo).procVenta(total);
	}

}
