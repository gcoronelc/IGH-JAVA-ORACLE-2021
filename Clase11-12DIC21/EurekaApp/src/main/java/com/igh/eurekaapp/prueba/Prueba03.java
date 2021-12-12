package com.igh.eurekaapp.prueba;

import com.igh.eurekaapp.db.AccesoDB;
import java.sql.Connection;
import java.sql.Statement;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba03 {

    public static void main(String[] args) {
		 String sql = "INSERT INTO SUCURSAL(CHR_SUCUCODIGO,VCH_SUCUNOMBRE,VCH_SUCUCIUDAD,"
					+ "VCH_SUCUDIRECCION,INT_SUCUCONTCUENTA) " 
					+ "VALUES('777','LOS OLIVOS','LIMA','CALLE 5 560',0)";
		 Connection cn = null;
		 Statement stm = null;
		 int filas;
		 try {
			 cn = AccesoDB.getConnection();
			 stm = cn.createStatement();
			 filas = stm.executeUpdate(sql);
			 System.out.println("Se han insertado " + filas + " registros.");
			 stm.close();
		 } catch (Exception e) {
			 System.out.println("ERROR: " + e.getMessage());
		 } finally{
			 try {
				 cn.close();
			 } catch (Exception e) {
			 }
		 }
    }

}
