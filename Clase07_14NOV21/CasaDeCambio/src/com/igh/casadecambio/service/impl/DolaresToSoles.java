package com.igh.casadecambio.service.impl;

import com.igh.casadecambio.service.spec.TipoCambio;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class DolaresToSoles implements TipoCambio {

	@Override
	public double ejecutarCambio(double importe) {
		double cambio;
		cambio = importe * TC_SOLES_TO_DOLARES;
		return cambio;
	}

}
