import java.util.Scanner;
import java.text.NumberFormat;

public class Paseo {

	static final double capacidadBus = 60;
	static final double valorComida = 10000;
	static final double comidaGordos = 5;
	static final double comidaFlacos = 3;
	static final double estudiantesHabitacion = 4;
	static final double valorHabitacion = 25000;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Números de estudiantes gordos que van al paseo: ");
		double gordos = sc.nextDouble ();
		
		System.out.println("Números de estudiantes flacos que van al paseo: ");
		double flacos = sc.nextDouble ();
		
		System.out.println("Número de días que dura el paseo: ");
		double dias = sc.nextDouble ();
		
		double buses = ((gordos * 2) + flacos) / capacidadBus;
		double platosGordos = gordos * comidaGordos;
		double platosFlacos = flacos * comidaFlacos;
		double totalPlatos = platosGordos + platosFlacos;
		double costoComidas = ((platosGordos * valorComida) + (platosFlacos * valorComida) * dias);
		double habitaciones = (gordos + flacos) / estudiantesHabitacion;
		double costoHabitacion = habitaciones * valorHabitacion * dias;
		double costoTotal = costoComidas + costoHabitacion;
		NumberFormat moneda = NumberFormat.getCurrencyInstance();
				
		
		System.out.println ("El número de buses necesarios es: " + Math.ceil(buses));
		System.out.println ("Número de platos de comida requeridos: " + totalPlatos);
		System.out.println ("Costo total de platos de comida: " + moneda.format(costoComidas));
		System.out.println ("Costo total de las habitaciones: " + moneda.format(costoHabitacion));
		System.out.println ("Costo total del paseo: " + moneda.format(costoTotal));
			
	}

}
