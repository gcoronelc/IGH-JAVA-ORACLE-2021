package com.igh.todobarato.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class PagoService {
	
	/**
	 * Permite calcular el impuesto del pedido.
	 * @param importe El valor del importe.
	 * @return Retorna el impuesto respectivo.
	 */
	public double calcularImpuesto(double importe){
		double impuesto;
		impuesto = importe * 0.18;
		return impuesto;
	}
	
	/**
	 * Retorna el total del pedido.
	 * @param importe El importe del pedido.
	 * @return Retorna el total del pedido, imcluido el impuesto.
	 */
	public double calcularTotal(double importe){
		double total;
		total = importe + calcularImpuesto(importe);
		return total;
	}

}
