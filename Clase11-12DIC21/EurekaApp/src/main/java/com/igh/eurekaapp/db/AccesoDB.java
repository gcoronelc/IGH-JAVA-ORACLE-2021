package com.igh.eurekaapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class AccesoDB {

	private AccesoDB() {
	}

	public static Connection getConnection() throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String urlDB = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "eureka";
		String pass = "admin";
		Connection cn = null;
		try {
			// Paso 1: Cargar el driver a memoria 
			Class.forName(driver).getConstructor().newInstance();
			// Paso 2: Obtener el objeto Connection 
			cn = DriverManager.getConnection(urlDB, user, pass);
		} catch (SQLException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new SQLException("No se encontró el driver de la base de datos.");
		} catch (Exception e) {
			throw new SQLException("No se puede establecer la conexión con la BD.");
		}
		return cn;
	}

}
