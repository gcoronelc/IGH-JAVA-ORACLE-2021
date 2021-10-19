package aprendiendojavaclase01.programas;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Programa04 {

    public static void main(String[] args) {
		 
		 String edad = "5467";
		 int x = Integer.parseInt(edad);
		 
		double r1 = 20/6;
		double r2 = 20.0/6;
		double r3 = 20/6.0;
		
		 System.out.println("r1: " + r1);
		 System.out.println("r2: " + r2);
		 System.out.println("r3: " + r3);
       
		 System.out.println("5^3: " + Math.pow(5, 3));
		 System.out.println("81^(1/2): " + Math.sqrt(81));
		 System.out.println("81^(1/3): " + Math.pow(81,1.0/3));
		 
		 System.out.println("x: " + x);
		 
    }

}
