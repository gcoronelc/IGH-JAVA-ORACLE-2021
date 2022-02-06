package com.igh.eurekaapp.service;

import com.igh.eurekaapp.dto.EmpleadoDto;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public interface LogonService {
	
	EmpleadoDto validarUsuario(String usuario, String clave);

}
