/*
9. Para la gestión de una clase de matemáticas formada por 14 alumnos, se desea un programa
que, introduciendo los datos necesarios, nos permita saber la calificación media, quién tiene la
nota más baja y quién tiene la nota más alta.
 * 
 */

import java.util.Scanner;
public class Ejercicio9 {
	
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce las notas de los 14 alumnos\n");
		
		int contador = 0;
		int nota = 0;
		int mayor = 0;
		int menor = 0;
		int suma = 0;
		
		
		while(contador < 14){
			nota = sc.nextInt();
			suma = suma + nota;
			if(nota > mayor){
				mayor = nota;
				}
			if(nota < menor){
				menor = nota;
				}
			contador++;		
		}
		System.out.printf("La Calificacion media es %d , la mayor es %d y la menor %d .", suma/14, mayor, menor);
	}
}

