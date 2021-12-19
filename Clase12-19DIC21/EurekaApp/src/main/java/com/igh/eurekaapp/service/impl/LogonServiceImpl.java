package com.igh.eurekaapp.service.impl;

import com.igh.eurekaapp.db.AccesoDB;
import com.igh.eurekaapp.dto.EmpleadoDto;
import com.igh.eurekaapp.service.LogonService;
import java.sql.PreparedStatement;
import java.sql.Connection;
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
public class LogonServiceImpl implements LogonService {

	@Override
	public EmpleadoDto validarUsuario(String usuario, String clave) {
		EmpleadoDto usuarioDto = null;
		String SQL = "select e.chr_emplcodigo,e.vch_emplpaterno,e.vch_emplmaterno,"
				  + "e.vch_emplnombre,e.vch_emplciudad,e.vch_empldireccion,u.vch_emplusuario "
				  + "from empleado e "
				  + "join usuario u on e.chr_emplcodigo=u.chr_emplcodigo "
				  + "where u.vch_emplusuario=? and vch_emplclave=SHA(?) ";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			pstm = cn.prepareStatement(SQL);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			rs = pstm.executeQuery();
			if(rs.next()){
				usuarioDto = new EmpleadoDto();
				usuarioDto.setCodigo(rs.getString("chr_emplcodigo"));
				usuarioDto.setPaterno(rs.getString("vch_emplpaterno"));
				usuarioDto.setMaterno(rs.getString("vch_emplmaterno"));
				usuarioDto.setNombre(rs.getString("vch_emplnombre"));
				usuarioDto.setCiudad(rs.getString("vch_emplciudad"));
				usuarioDto.setDireccion(rs.getString("vch_empldireccion"));
				usuarioDto.setUsuario(rs.getString("vch_emplusuario"));
				usuarioDto.setClave("*****");
			}
			rs.close();
			pstm.close();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} catch (Exception e) {
			throw new RuntimeException("Se ha producido un error, intentelo nuevamente.");
		}finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return usuarioDto;
	}

}
