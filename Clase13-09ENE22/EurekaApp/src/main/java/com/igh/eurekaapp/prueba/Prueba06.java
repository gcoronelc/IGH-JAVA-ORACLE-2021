package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.db.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba06 {

	public static void main(String[] args) {
		String sql = "SELECT CHR_CUENCODIGO,CHR_MONECODIGO,CHR_SUCUCODIGO,CHR_CLIECODIGO, "
				  + "DEC_CUENSALDO,VCH_CUENESTADO,INT_CUENCONTMOV FROM CUENTA WHERE CHR_SUCUCODIGO=? ";
		Connection cn = null;
		PreparedStatement pstm;
		ResultSet rs = null;
		int filas;
		String rowData;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, "002");
			rs = pstm.executeQuery();
			while (rs.next()) {
				rowData = "";
				rowData += rs.getString("CHR_CUENCODIGO") + " - ";
				rowData += rs.getString("CHR_MONECODIGO") + " - ";
				rowData += rs.getDouble("DEC_CUENSALDO") + " - ";
				rowData += rs.getString("VCH_CUENESTADO") + " - ";
				rowData += rs.getString("INT_CUENCONTMOV");
				System.out.println(rowData);
			}
			rs.close();
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
