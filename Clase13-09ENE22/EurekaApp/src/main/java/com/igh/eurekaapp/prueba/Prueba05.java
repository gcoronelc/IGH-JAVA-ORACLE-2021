package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba05 {

	public static void main(String[] args) {
		String sql = "INSERT INTO SUCURSAL(CHR_SUCUCODIGO,VCH_SUCUNOMBRE,VCH_SUCUCIUDAD,"
				  + "VCH_SUCUDIRECCION,INT_SUCUCONTCUENTA) VALUES(?,?,?,?,?)";
		Connection cn = null;
		PreparedStatement pstm = null;
		int filas;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, "888");
			pstm.setString(2, "INDEPENDENCIA");
			pstm.setString(3, "LIMA");
			pstm.setString(4, "AV. ALGO 6789");
			pstm.setInt(5, 0);
			filas = pstm.executeUpdate();
			System.out.println("Se han insertado " + filas + " registros.");
			pstm.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}

}
