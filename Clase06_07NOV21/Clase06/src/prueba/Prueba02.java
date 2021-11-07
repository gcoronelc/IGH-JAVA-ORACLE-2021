package prueba;

import service.DemoService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		DemoService demoService = new DemoService();
		
		demoService.sumar(5,8);
		demoService.sumar(5L,8L);
		demoService.sumar(5,8L);
		demoService.sumar(5.0,8.0);
		demoService.sumar(5.0f,8.0f);
		
	}
}
