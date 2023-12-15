
    //5. Crear un programa que permita hacer una cuenta atrás, preguntando al usuario desde qué
    //número desea hacerse la cuenta.

import java.util.Scanner;

public class CuentaAtras{
	
	
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un numero y haremos la cuenta atras: ");
		int numero = sc.nextInt();
		
		for(;numero >= 0; numero--){
			System.out.println(numero);
		}
	
	}
}

