package com.igh.eurekaapp.prueba;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {

	public static void main(String[] args) {
		/*
		String driver = "oracle.jdbc.OracleDriver";
		String urlDB = "jdbc:oracle:thin:@localhost:1521/XE";
		String user = "eureka";
		String pass = "admin";
		 */
		String driver = "com.mysql.cj.jdbc.Driver"; // "com.mysql.jdbc.Driver";
		String urlDB = "jdbc:mysql://localhost:3306/eurekabank";
		String user = "root";
		String pass = "root";

		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
			Connection cn = DriverManager.getConnection(urlDB, user, pass);
			System.out.println("Conexión ok.");
			cn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Error loadingdriver: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
