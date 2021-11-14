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
public class CrudEmpleadoImpl implements CrudSpec{

	@Override
	public void read() {
		System.out.println("LEctura de empleados");
	}

	@Override
	public void create() {
		System.out.println("Empleado creado.");
	}

	@Override
	public void update() {
		System.out.println("Empleado actualizado.");
	}

	@Override
	public void delete() {
		System.out.println("Empleado eliminado");
	}

}
