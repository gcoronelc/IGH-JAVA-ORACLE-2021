package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.dto.ComboDto;
import com.igh.eurekaapp.service.ComboService;
import com.igh.eurekaapp.service.CuentaService;
import com.igh.eurekaapp.service.impl.ComboServiceImpl;
import com.igh.eurekaapp.service.impl.CuentaServiceImpl;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class CuentaController {

	private ComboService comboService;
	private CuentaService cuentaService;

	public CuentaController() {
		comboService = new ComboServiceImpl();
		cuentaService = new CuentaServiceImpl();
	}

	public List<ComboDto> getMonedas() {
		return comboService.getMonedas();
	}

	public List<ComboDto> getClientes() {
		return comboService.getClientes();
	}
	
	public String crearCuenta(String codCliente, String codMoneda, Double importe, String clave, String empleado){
		return cuentaService.crearCuenta(codCliente, codMoneda, importe, clave, empleado);
	}
}
