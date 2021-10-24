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
	
	public double calcularImpuesto(double importe){
		double impuesto;
		impuesto = importe * 0.18;
		return impuesto;
	}
	
	public double calcularTotal(double importe){
		double total;
		total = importe + calcularImpuesto(importe);
		return total;
	}

}
