package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.dto.ComboDto;
import com.igh.eurekaapp.service.CuentaService;
import com.igh.eurekaapp.service.impl.CuentaServiceImpl;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba10 {

	public static void main(String[] args) {
		ComboDto bean = new ComboDto("001", "Categoria 1");
		System.out.println(bean);
	}

}
