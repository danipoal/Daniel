//5. Se quiere realizar un proceso que permita convertir yenes a euros. Para ello, se considerará
//que un euro equivale a 177 yenes.
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main (String[] args) {
		double cambio = 1 / 177.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los yenes que quieres convertir a Euros: ");
		
		double yenes = sc.nextDouble();
		
		System.out.printf("Tienes %.2f euros.", yenes * cambio);
	}
}

