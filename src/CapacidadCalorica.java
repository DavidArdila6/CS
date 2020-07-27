import java.util.Scanner;

public class CapacidadCalorica {

	static final double capacidadcalorica = 1;
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir masa en gramos de agua: ");
		double masa = sc.nextDouble ();
		
		System.out.println("Introducir temperatura en centigrados: ");
		double temperatura = sc.nextDouble ();
		
		double cantidad = capacidadcalorica * masa * temperatura;
		System.out.println("Cantidad de energía que se requiere para incrementar la temperatura "
				+ "de un gramo de agua en un grado centigrado: " + cantidad);
		

	}

}
