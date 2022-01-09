package com.igh.eurekaapp.service.impl;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.service.CuentaService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class CuentaServiceImpl implements CuentaService {

	@Override
	public String crearCuenta(String codCliente, String codMoneda, Double importe, String clave, String empleado) {
		final String SQL1 = "select count(1) cont from cliente where chr_cliecodigo=?";
		final String SQL2 = "select count(1) cont from moneda where chr_monecodigo=?";
		final String SQL3 = "select count(1) cont from empleado where chr_emplcodigo=?";
		final String SQL4 = "select chr_sucucodigo sucursal from asignado where chr_emplcodigo=? and dtt_asigfechabaja is null";
		final String SQL5 = "select int_sucucontcuenta cont from sucursal where chr_sucucodigo=? for update";
		final String SQL6 = "update sucursal set int_sucucontcuenta=? where chr_sucucodigo=?";
		final String SQL7 = "insert into cuenta(chr_cuencodigo,chr_monecodigo,chr_sucucodigo,chr_emplcreacuenta, "
				  + "chr_cliecodigo,dec_cuensaldo,dtt_cuenfechacreacion,vch_cuenestado,int_cuencontmov,chr_cuenclave) "
				  + "values(?,?,?,?,?,?,SYSDATE(),'ACTIVO',?,?)";
		final String SQL8 = "insert into movimiento(chr_cuencodigo,int_movinumero,dtt_movifecha,chr_emplcodigo,chr_tipocodigo,dec_moviimporte) "
				  + "values(?,1,SYSDATE(),?,'001',?)";
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int cont, contCuenta, nroMovs;
		String sucursal, nroCuenta;
		try {
			// Iniciar la Tx
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false); // Inicia la Tx
			// Paso 1: Verificar cliente
			pstm = cn.prepareStatement(SQL1);
			pstm.setString(1, codCliente);
			rs = pstm.executeQuery();
			rs.next();
			cont = rs.getInt("CONT");
			rs.close();
			pstm.close();
			if (cont == 0) {
				throw new SQLException("Cliente no existe.");
			}
			// Paso 2: Verificar moneda
			pstm = cn.prepareStatement(SQL2);
			pstm.setString(1, codMoneda);
			rs = pstm.executeQuery();
			rs.next();
			cont = rs.getInt("CONT");
			rs.close();
			pstm.close();
			if (cont == 0) {
				throw new SQLException("Moneda no existe.");
			}
			// Paso 3: Verificar empleado
			pstm = cn.prepareStatement(SQL3);
			pstm.setString(1, empleado);
			rs = pstm.executeQuery();
			rs.next();
			cont = rs.getInt("CONT");
			rs.close();
			pstm.close();
			if (cont == 0) {
				throw new SQLException("Empleado no existe.");
			}
			// Paso 3.5: Verificar importe
			if (importe < 0.0) {
				throw new SQLException("El importe no puede ser negativo.");
			}
			// Paso 4: Obtener código de sucursal
			pstm = cn.prepareStatement(SQL4);
			pstm.setString(1, empleado);
			rs = pstm.executeQuery();
			sucursal = null;
			if (rs.next()) {
				sucursal = rs.getString("SUCURSAL");
			}
			rs.close();
			pstm.close();
			if (sucursal == null) {
				throw new SQLException("Empleado no tiene autorización.");
			}
			// Paso 5: Contador de sucursal para cuenta
			pstm = cn.prepareStatement(SQL5);
			pstm.setString(1, sucursal);
			rs = pstm.executeQuery();
			rs.next();
			contCuenta = rs.getInt("CONT");
			rs.close();
			pstm.close();
			contCuenta++;
			pstm = cn.prepareStatement(SQL6);
			pstm.setInt(1, contCuenta);
			pstm.setString(2, sucursal);
			pstm.executeUpdate();
			pstm.close();
			// Paso 6: Generación de cuenta
			nroCuenta = sucursal + String.format("%05d", contCuenta);
			// Paso 7: Registrar de cuenta
			nroMovs = (importe > 0.0) ? 1 : 0;
			pstm = cn.prepareStatement(SQL7);
			pstm.setString(1, nroCuenta);
			pstm.setString(2, codMoneda);
			pstm.setString(3, sucursal);
			pstm.setString(4, empleado);
			pstm.setString(5, codCliente);
			pstm.setDouble(6, importe);
			pstm.setInt(7, nroMovs);
			pstm.setString(8, clave);
			pstm.executeUpdate();
			pstm.close();
			// Paso 8: Registrar movimiento
			if (importe > 0.0) {
				pstm = cn.prepareStatement(SQL8);
				pstm.setString(1, nroCuenta);
				pstm.setString(2, empleado);
				pstm.setDouble(3, importe);
				pstm.executeUpdate();
				pstm.close();
			}
			// Confirmar Tx
			cn.commit();
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Proceso abortado, intentelo mas tarde.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return nroCuenta;
	}

}
