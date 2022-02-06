package com.igh.eurekaapp.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public interface CuentaService {
	
	String crearCuenta(String codCliente, String codMoneda, Double importe, String clave, String empleado);
	
	/*
	
	void deposito();
	
	void retiro();
	
	void transferencia();
	
	void darDeBaja();
	
	*/

}
