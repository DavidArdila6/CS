import java.util.Scanner;

public class Combustible {

	static final double LKM = 2.352145; 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir valor de la eficiencia de combustible en (MPG): ");
		double MPG = sc.nextDouble ();
		
		double conversion = LKM / MPG;
		System.out.println(MPG + " MPG es equivalente a " + conversion + "LKM");
	}

}
