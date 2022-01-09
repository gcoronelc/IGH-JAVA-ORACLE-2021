package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.dto.ComboDto;
import com.igh.eurekaapp.service.ComboService;
import com.igh.eurekaapp.service.impl.ComboServiceImpl;
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

	public CuentaController() {
		comboService = new ComboServiceImpl();
	}

	public List<ComboDto> getMonedas() {
		return comboService.getMonedas();
	}

	public List<ComboDto> getClientes() {
		return comboService.getClientes();
	}
}
