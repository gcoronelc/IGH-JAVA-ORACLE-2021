package com.igh.eurekaapp.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Mensaje {

	private Mensaje() {
	}

	public static void info(Component padre, String mensaje){
		JOptionPane.showMessageDialog(padre, mensaje, "EUREKA - INFORMACIÓN", 
				  JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void error(Component padre, String mensaje){
		JOptionPane.showMessageDialog(padre, mensaje, "EUREKA - ERROR", 
				  JOptionPane.ERROR_MESSAGE);
	}
	
	
}
