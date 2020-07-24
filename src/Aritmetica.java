import java.util.Scanner;

public class Aritmetica {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir variable entera a: ");
		int a = sc.nextInt ();
		
		System.out.println("Introducir variable entera b: ");
		int b = sc.nextInt ();
		
		int suma = a + b;
		System.out.println("La suma de a y b es: " + suma);
		
		int diferencia = b - a;
		System.out.println("La diferencia cuando b es restado de a es: " + diferencia);
		
		int producto = a * b;
		System.out.println("El producto de a y b es: " + producto);
		
		int residuo = a / b;
		System.out.println("El residuo de la división de a entre b es: " + residuo);
		
		double logaritmo = Math.log10 (a);
		System.out.println("El logaritmo de a es: " + logaritmo);
		
		double potencia = Math.pow(a, b);
		System.out.println("El resultado de la potencia de a elevado a la b es: " + potencia);
	}

}
