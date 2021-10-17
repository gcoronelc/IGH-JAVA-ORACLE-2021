package ejemplos;

/*


*/

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class Ejemplo08 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n1_aux = n1, n2_aux = n2, mcd, mcm;
		for (; n1 != n2;) {
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		mcd = n1;
		mcm = n1_aux * n2_aux / mcd;
		System.out.println("n1 => " + n1_aux);
		System.out.println("n2 => " + n2_aux);
		System.out.println("mcd => " + mcd);
		System.out.println("mcm => " + mcm);
	}

}
