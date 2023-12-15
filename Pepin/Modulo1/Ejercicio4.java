import java.util.Scanner;

//4. Se quiere calcular la longitud de una rueda de bicicleta. Para ello, se puede pedir a usuario que
//mida su diámetro y lo introduzca por teclado. La unidad de medida será centímetro


public class Ejercicio4 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		final double pi = 3.14;
		
		System.out.print("Introduce el diametro de la rueda: ");
		double diametro = sc.nextDouble();
		double longitud = pi * diametro;
		
		System.out.printf("La longitud de una rueda del diametro indicado es:  %.2f cm", longitud);
	}
}

