package prueba;

import bo.impl.CrudClienteImpl;
import bo.impl.CrudEmpleadoImpl;
import bo.spec.CrudSpec;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba06 {

    public static void main(String[] args) {
		 
		 CrudSpec bean = new CrudEmpleadoImpl();
		 
		 bean.create();
		 bean.read();
		 bean.update();
		 bean.delete();
		 
    }

}
