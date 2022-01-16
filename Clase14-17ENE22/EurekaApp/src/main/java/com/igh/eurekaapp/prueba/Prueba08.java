package com.igh.eurekaapp.prueba;

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
public class Prueba08 {

	public static void main(String[] args) {
		try {
			// Datos
			String usuario = "cromero";
			String clave = "chicho";
			// Proceso
			LogonService service = new LogonServiceImpl();
			EmpleadoDto bean = service.validarUsuario(usuario, clave);
			// Reporte
			if(bean==null){
				System.out.println("Datos incorrectos.");
			} else {
				System.out.println("Hola " + bean.getNombre());
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		} 
	}

}
