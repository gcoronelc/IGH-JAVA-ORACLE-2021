package com.igh.eurekaapp.service.impl;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.dto.ComboDto;
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
	private final String SQL_CLIENTES = "select chr_cliecodigo CODIGO , VCH_CLIEPATERNO || ' ' || VCH_CLIEMATERNO || ' ' || VCH_CLIENOMBRE ETIQUETA from cliente order by VCH_CLIEPATERNO";

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
		List<ComboDto> lista = new ArrayList<>();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(SQL_CLIENTES);
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
	public ComboDto mapRow(ResultSet rs) throws SQLException {
		ComboDto bean = new ComboDto();
		bean.setCodigo(rs.getString("CODIGO"));
		bean.setEtiqueta(rs.getString("ETIQUETA"));
		return bean;
	}

}
