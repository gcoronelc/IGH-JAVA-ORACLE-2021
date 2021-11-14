package bo.impl;

import bo.spec.CrudSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class CrudClienteImpl implements CrudSpec{

	@Override
	public void read() {
		System.out.println("Consulta de clientes.");
	}

	@Override
	public void create() {
		System.out.println("Cliente creado.");
	}

	@Override
	public void update() {
		System.out.println("Cliente actualizado.");
	}

	@Override
	public void delete() {
		System.out.println("Cliente eliminado");
	}

}
