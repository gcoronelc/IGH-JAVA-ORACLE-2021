package com.igh.eurekaapp.controller;

import com.igh.eurekaapp.dto.EmpleadoDto;
import com.igh.eurekaapp.service.LogonService;
import com.igh.eurekaapp.service.impl.LogonServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class LogonController {
	
	private LogonService logonService;

	public LogonController() {
		logonService = new LogonServiceImpl();
	}
	
	public EmpleadoDto validarUsuario(String usuario, String clave){
		return logonService.validarUsuario(usuario, clave);
	}

}
