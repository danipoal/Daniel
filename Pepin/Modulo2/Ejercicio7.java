/*
7. Crear un programa que pide 10 números por teclado y nos dice cuál es el más grande.
 
8. Lo mismo, diciendo además cuál es el más pequeño.
 */
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mayor = 0;	
		int menor = 0;
		int numero = 0;
		
		System.out.println("Introduce 10 numeros para ver cual es el mayor");
		for(int i = 0; i<10; i++){	//Iniciamos bucle para recoger numeros, luego ifs mayor o menor
			numero = sc.nextInt();
			
			if(numero > mayor){
				mayor = numero;
				}
			if(numero < menor){
				menor = numero;
				}
			}
		System.out.println("El mayor numero es: " + mayor);
		System.out.println("El menor es: " + menor);
	}
}

