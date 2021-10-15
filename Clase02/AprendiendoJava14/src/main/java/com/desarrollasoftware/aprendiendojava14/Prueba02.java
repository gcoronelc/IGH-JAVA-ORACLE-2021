package com.desarrollasoftware.aprendiendojava14;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

	public static void main(String[] args) {

		Random random = new Random();
		int mes;
		String reporte;

		mes = random.nextInt(12) + 1;

		reporte = switch (mes) {
			case 1,2,3 -> "Trimestre 1";
			case 4,5,6 -> "Trimestre 2";
			case 7,8,9 -> "Trimestre 3";
			case 10,11,12 -> "Trimestre 4";
		};

		System.out.println("mes = " + mes);
		System.out.println("Trimestre: " + reporte);

	}

}
