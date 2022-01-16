package com.igh.eurekaapp.service.impl;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.service.ReporteService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class ReporteServiceImpl implements ReporteService {

	@Override
	public List<Map<String, ?>> obtenerListaCuentas() {
		final String SQL = "SELECT SUCUCODIGO ||  ' - ' || SUCUNOMBRE SUCURSAL,"
				  + "CUENCODIGO CUENTA,"
				  + "CLIECODIGO || ' - ' || CLIENOMBRE || ' ' || CLIEPATERNO CLIENTE,"
				  + "MONENOMBRE MONEDA, CUENSALDO SALDO "
				  + "FROM V_CUENTA ";
		List<Map<String, ?>> lista = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(SQL);
			rs = pstm.executeQuery();
			lista = JdbcUtil.rsToList(rs);
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Se ha producido un error, intentelo nuevamente.");
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

}
