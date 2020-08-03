import java.util.Scanner;

public class Cono {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Radio del cono completo: ");
		double r1 = sc.nextDouble ();
		
		System.out.println("Altura del cono completo: ");
		double h1 = sc.nextDouble ();
		
		System.out.println("Radio del cono deficiente: ");
		double r2 = sc.nextDouble ();
		
		System.out.println("Altura del cono deficiente: ");
		double h2 = sc.nextDouble ();
		
		double volumenConoCompleto = (Math.PI * (r1 * r1)) * h1;
		double volumenConoDeficiente = (Math.PI * (r2 * r2)) * h2;
		double volumenTroncoCono = volumenConoCompleto - volumenConoDeficiente;
		
		System.out.println("El volumen del cono completo es: " + volumenConoCompleto );
		System.out.println("El volumen del cono deficiente es: " + volumenConoDeficiente );
		System.out.println("El volumen del tronco del cono es: " + volumenTroncoCono );
	}

}
