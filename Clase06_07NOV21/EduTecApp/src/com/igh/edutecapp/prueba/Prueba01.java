package com.igh.edutecapp.prueba;

import com.igh.mate.MateService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		MateService mateService = new MateService();
		System.out.println("Promedio de 14, 18: " + mateService.promedio(14, 18));
		
	}

}
