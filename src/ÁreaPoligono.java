import java.util.Scanner;

public class ÁreaPoligono {

	static final double constante = 4;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir la longitud de un lado del polígono: ");
		double s = sc.nextDouble ();
		
		System.out.println("Introducir el número de lados del polígono: ");
		double n = sc.nextDouble ();
		
		double a = (n * (s * s) / constante *  + Math.tan(Math.PI/n));
		System.out.println("El área del polígono es: " + a );
	}

}
