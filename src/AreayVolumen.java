import java.util.Scanner;

public class AreayVolumen {

	static final double constante = (4.0/3);
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir el valor de un radio en centimetros: ");
		double r = sc.nextDouble ();
		
		double area = Math.PI * Math.pow(r,2);
		System.out.println("El área del circulo es de: " + area + " cm cuadrados");
		
		double volumen = constante * Math.PI * Math.pow(r,3);
		System.out.println("El volumen de una esfera es de: " + volumen + " cm cubicos");
	}

}
