package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.db.AccesoDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba04 {

	public static void main(String[] args) {
		String sql = "SELECT CHR_SUCUCODIGO,VCH_SUCUNOMBRE,VCH_SUCUCIUDAD,"
				  + "VCH_SUCUDIRECCION,INT_SUCUCONTCUENTA FROM SUCURSAL ";
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		int filas;
		String rowData;
		try {
			cn = AccesoDB.getConnection();
			stm = cn.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				rowData = "";
				rowData += rs.getString("CHR_SUCUCODIGO") + " - ";
				rowData += rs.getString("VCH_SUCUNOMBRE") + " - ";
				rowData += rs.getString("VCH_SUCUCIUDAD") + " - ";
				rowData += rs.getString("VCH_SUCUDIRECCION");
				System.out.println(rowData);
			}
			rs.close();
			stm.close();
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
