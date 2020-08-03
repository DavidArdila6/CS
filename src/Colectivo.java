import java.util.Scanner;
import java.text.NumberFormat;

public class Colectivo {

	static final double valorViaje = 10000;
	static final double valorViajeEmpresa = 2000;
	static final double capacidadColectivo = 30;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir el número de personas que van a ser transportadas: ");
		double personas = sc.nextDouble ();
		
		double viajes = (personas * 1) / capacidadColectivo;
		double dinero = personas * valorViaje;
		double propietario = Math.ceil(viajes) * valorViajeEmpresa;
		NumberFormat moneda = NumberFormat.getCurrencyInstance();
				
		
		System.out.println ("El número de viajes necesarios para transportar los turistas es: " + Math.ceil(viajes));
		System.out.println ("Dinero que deben pagar los turistas: " + moneda.format(dinero));
		System.out.println ("Dinero que debe pagar el conductor al propietario: " + moneda.format(propietario));
		
			
	}

}
