import java.util.Scanner;

public class �reaPoligono {

	static final double constante = 4;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir la longitud de un lado del pol�gono: ");
		double s = sc.nextDouble ();
		
		System.out.println("Introducir el n�mero de lados del pol�gono: ");
		double n = sc.nextDouble ();
		
		double a = (n * (s * s) / constante *  + Math.tan(Math.PI/n));
		System.out.println("El �rea del pol�gono es: " + a );
	}

}
