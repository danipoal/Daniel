//6. Crear un programa que pide cinco números por teclado y muestra su promedio.
import java.util.Scanner;

public class Promedio {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int suma = 0;
		
		for(; contador <= 5; contador++){
			System.out.print("Introduce un numero: ");
			
			int numero = sc.nextInt();
			
			suma = suma + numero;
			
		}	
			
		int promedio = (suma)/ 5;
		System.out.printf("La media de estos numeros son %d", promedio);
	}
}

