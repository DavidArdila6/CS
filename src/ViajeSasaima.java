import java.util.Scanner;
import java.text.NumberFormat;

public class ViajeSasaima {

	static final double kilometrosASasaima = 80;
	static final double cargaKilosPermitida = 5000;
	static final double precioGasolina = 10000;
	static final double galonGasolinaViaje = 4;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introducir los kilos que requiere transportar: ");
		double kilos = sc.nextDouble ();
		
		double viajes = (kilos * 1) / cargaKilosPermitida;
		double galones = viajes * galonGasolinaViaje;
		double costo = galones * precioGasolina;
		NumberFormat moneda = NumberFormat.getCurrencyInstance();
				
		
		if ( viajes < 1) {
            System.out.println ("El número de viajes necesarios para transportar la carga son: " + 1 );
        } else {
            System.out.println ("El número de viajes necesarios para transportar la carga son: " + Math.ceil(viajes) );
        }
		
		if ( viajes < 1) {
            System.out.println ("El número de galones de gasolina que se gastará en cada viaje: " + galonGasolinaViaje );
        } else {
        	System.out.println("El número de galones de gasolina que se gastará en cada viaje: " + galones );
        }
		if ( viajes < 1) {
            System.out.println ("El costo de la gasolina será de: " + moneda.format(galonGasolinaViaje * precioGasolina) );
        } else {
        	System.out.println("El costo de la gasolina será de: " + moneda.format(costo) );
        }
		
		
	}

}
