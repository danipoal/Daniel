/*
1. Mostrar por pantalla todos los números del 1 al 25.
¿Cuántas formas conoces de hacer este ejercicio?

2. Mostrar por pantalla todos los números del 10 al 1.
¿Cuántas formas conoces de hacer este ejercicio? ¿Cuál es tu favorita?

3. Mostrar por pantalla todos los números pares comprendidos entre 10 y 30.
Aplicar buenas prácticas de programación: Legibilidad y documentación.
 */
import java.util.Arrays;

public class Ejercicio1 {
	
	public static void forma1(){
		for(int i = 1; i <=25 ; i++){
			System.out.print(i + "\n");
		}
	}
	
	public static void ejercicio2(){
		for(int i = 10; i > 0; i--){
			System.out.print(i + "\n");
		}
	}
		public static void ejercicio3(){
			for(int i = 10; i <=30; i++){
				if(i % 2 == 0){
					System.out.print(i + "\n");
				}
			}
			
		}
	public static int[] ejercicio3b(){
		int[] numeros = new int[20];
		int indice = 0;
		for(int i = 10; i <= 30; i+=2){
			numeros[indice] = i;
			indice++;
		}
		return numeros;
	}
	
	public static void main (String[] args) {
		//forma1();
		//ejercicio2();
		
		int[] numeros = new int[30];
		numeros = ejercicio3b();
		
		System.out.print(Arrays.toString(numeros));	//Esto imprime la direccion de memoria, pero se añade toString
	}
}

