
//6. Tenemos un cajero automático que puede proporcionar billetes de 100€, 50€, 20€ y 10€,
//Se pide realizar un programa que calcule cuál sería el desglose en billetes para una cantidad de
//dinero. Esta cantidad será pedida al usuario por teclado, y el programa proporcionará como
//salida, por pantalla, cuántos billetes de cada son necesarias para satisfacer la petición. Se
//supondrá que se desea el desglose con el menor número de billetes, y se validará que el importe
//solicitado por el usuario sea múltiplo de 10.
import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuanto dinero quieres sacar: ");
		
		int dinero = sc.nextInt();
		int resto = 0;
		
		int cantidadCien = dinero/100;
		resto = dinero % 100;
		
		int cantidadCincuenta = resto / 50;
		resto = resto % 50;
		
		int cantidadVeinte = resto / 20;
		resto = resto % 20;
		
		int cantidadDiez = resto / 10;
		resto = resto % 10;
		
		
		
		System.out.printf("Saldran %d billetes de 100, %d de cincuenta, %d de veinte y %d de diez.", cantidadCien, cantidadCincuenta, cantidadVeinte, cantidadDiez);
		
	}
}

