package com.igh.eurekaapp.service;

import com.igh.eurekaapp.dto.ComboDto;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public interface ComboService extends RowMapper<ComboDto> {

	List<ComboDto> getMonedas();

	List<ComboDto> getClientes();

}
