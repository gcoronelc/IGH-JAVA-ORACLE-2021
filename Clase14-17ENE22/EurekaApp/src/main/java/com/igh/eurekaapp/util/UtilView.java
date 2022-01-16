package com.igh.eurekaapp.util;

import com.igh.eurekaapp.dto.ComboDto;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class UtilView {

	private UtilView() {
	}

	public static void llenarCombo(JComboBox<ComboDto> combo, List<ComboDto> lista) {
		combo.removeAllItems();
		for (ComboDto bean : lista) {
			combo.addItem(bean);
		}
		combo.setSelectedIndex(-1);
	}

	public static void validarCombo(JComboBox<ComboDto> combo, String mensaje) {
		if (combo.getSelectedIndex() == -1) {
			combo.requestFocus();
			throw new RuntimeException(mensaje);
		}
	}

	public static void validarDouble(JTextField control, String mensaje) {
		try {
			Double numero = Double.parseDouble(control.getText());
		} catch (Exception e) {
			control.requestFocus();
			throw new RuntimeException(mensaje);
		}
	}
	
	public static void validarDoublePositivo(JTextField control, String mensaje) {
		try {
			Double numero = Double.parseDouble(control.getText());
			if(numero<0){
				throw new RuntimeException(mensaje);
			}
		} catch (Exception e) {
			control.requestFocus();
			throw new RuntimeException(mensaje);
		}
	}

	public static void validarClaveCuenta(JPasswordField control) {
		String dato = String.valueOf(control.getPassword());
		if (dato.length() != 6) {
			control.requestFocus();
			throw new RuntimeException("La clave debe tener 6 caracteres.");
		}
	}

}
