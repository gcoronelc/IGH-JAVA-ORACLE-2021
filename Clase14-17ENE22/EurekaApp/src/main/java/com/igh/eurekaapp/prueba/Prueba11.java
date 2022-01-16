package com.igh.eurekaapp.prueba;

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
public class Prueba11 {

	public static void main(String[] args) {
		try {
			ComboService service = new ComboServiceImpl();
			List<ComboDto> lista = service.getClientes();
			for (ComboDto bean : lista) {
				System.out.println(bean);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
