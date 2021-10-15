package com.desarrollasoftware.aprendiendojava14;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {

	public static void main(String[] args) {

		Random random = new Random();
		int n;
		String reporte;

		n = random.nextInt(15);

		switch (n) {
			case 5:
				reporte = "Cinco";
				break;
			case 8:
				reporte = "Ocho";
				break;
			case 10:
				reporte = "Diez";
				break;
			default:
				reporte = "No se.";
				break;
		}

		System.out.println("n = " + n);
		System.out.println(reporte);

	}

}
