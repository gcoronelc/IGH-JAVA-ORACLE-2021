package com.igh.eurekaapp.service.impl;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.dto.ComboDto;
import com.igh.eurekaapp.dto.EmpleadoDto;
import com.igh.eurekaapp.service.ComboService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class ComboServiceImpl implements ComboService {

	private final String SQL_MONEDAS = "select chr_monecodigo CODIGO, vch_monedescripcion ETIQUETA from moneda";

	@Override
	public List<ComboDto> getMonedas() {
		List<ComboDto> lista = new ArrayList<>();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(SQL_MONEDAS);
			rs = pstm.executeQuery();
			while (rs.next()) {
				lista.add(mapRow(rs));
			}
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

	@Override
	public List<ComboDto> getClientes() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public ComboDto mapRow(ResultSet rs) throws SQLException {
		ComboDto bean = new ComboDto();
		bean.setCodigo(rs.getString("CODIGO"));
		bean.setEtiqueta(rs.getString("ETIQUETA"));
		return bean;
	}

}
