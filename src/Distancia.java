import java.util.Scanner;

public class Distancia {

	static final double valor = 6371.07;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir latitud de la ciudad A: ");
		double t1 = sc.nextDouble ();
		
		System.out.println("Introducir longitud de la ciudad A: ");
		double g1 = sc.nextDouble ();
		
		System.out.println("Introducir latitud de la ciudad B: ");
		double t2 = sc.nextDouble ();
		
		System.out.println("Introducir longitud de la ciudad B: ");
		double g2 = sc.nextDouble ();
		
		double distancia = valor * 
				Math.acos (Math.sin (t1)) * Math.sin (t2) + Math.cos (t1) * Math.cos (t2) * Math.cos(g2) - g1;
		
		System.out.println("La distancia entre la ciudad A y la ciudad B es de: " + distancia);
	}

}
