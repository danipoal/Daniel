/*
10. Se desea una aplicación que, registrando las temperaturas medias de los doce meses del
año, nos diga cuál es el mes más caluroso y cuál es el más frío. Además, contabilizará todos los
meses que hayan tenido una temperatura inferior a 15ºC y cuántos tuvieron más de 22ºC.
 */

import java.util.Scanner;
public class Ejercicio10 {
	
	public static void main (String[] args) {
		int contadorInferior = 0;
		int contadorSuperior = 0;
		int mayor = 0;
		int menor = 99;
		int temperatura = 0;
		int indiceMayor = 0;
		int indiceMenor = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 1; i <= 12; i++){
			System.out.printf("Indica la temperatura del mes %d: ", i);
			temperatura = sc.nextInt();
			
			if(temperatura < 15) contadorInferior++;
			if(temperatura > 22) contadorSuperior++;
			
			if(temperatura < menor){
				 menor = temperatura;
				indiceMenor = i;
				}
			if(temperatura > mayor){
				 mayor = temperatura;
				 indiceMayor = i;
				}
		}
		
		System.out.printf("El mes mas frio ha sido el %d con %d grados\n", indiceMenor, menor);
		System.out.printf("El mes mas calido ha sido el %d con %d grados\n", indiceMayor, mayor);
		
		System.out.printf("Ha habido %d meses con temperaturas mayores a 22º y %d con menores a 15º", contadorSuperior, contadorInferior);
		
		
	}
}

