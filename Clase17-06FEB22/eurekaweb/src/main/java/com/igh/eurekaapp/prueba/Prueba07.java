package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.db.AccesoDB;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba07 {

	public static void main(String[] args) {
		String sql = "{call EUREKA.usp_egcc_saldo_cuenta(?,?)}";
		Connection cn = null;
		CallableStatement cstm = null;
		int filas;
		Double saldo;
		try {
			cn = AccesoDB.getConnection();
			cstm = cn.prepareCall(sql);
			cstm.setString(1, "00100002");
			cstm.registerOutParameter(2, java.sql.Types.DOUBLE);
			cstm.executeUpdate();
			saldo = cstm.getDouble(2);
			cstm.close();
			if(saldo==-100.0){
				throw new Exception("Cuenta no existe.");
			}
			System.out.println("Saldo: " + saldo );
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
