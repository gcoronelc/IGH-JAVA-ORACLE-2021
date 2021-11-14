package com.igh.casadecambio.service.spec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public interface TipoCambio {

	double TC_SOLES_TO_DOLARES = 4.12;
	double TC_SOLES_TO_EUROS = 4.80;

	double ejecutarCambio(double importe);

}
