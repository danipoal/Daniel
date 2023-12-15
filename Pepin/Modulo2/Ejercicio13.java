/*
 * Ejercicio13.java
 * 
13. Programa que calcule cuál es el empleado más joven en una oficina de 21 empleados.
14. Lo mismo que el 13, pero sin conocer el número de empleados. Razona la respuesta
 */

import java.util.Scanner;
public class Ejercicio13 {
	
	public static void Ej13(){
		Scanner sc = new Scanner(System.in);
		int edadEmpleado = 0;
		int edadJovenEmpleado = 0;
		System.out.println("Introduce la edad de los empleados:\n");
		for(int i = 1; i <= 21; i++){
			System.out.printf("Empleado %d: ", i);
			
			edadEmpleado = sc.nextInt();
			if(edadEmpleado > edadJovenEmpleado) edadJovenEmpleado = edadEmpleado;
		} 
		System.out.printf("Tiene %d años", edadJovenEmpleado);
	}
	
	
	
	public static void Ej14(){
		Scanner sc = new Scanner(System.in);
		int edadEmpleado = -1;
		int edadJovenEmpleado = Integer.MAX_VALUE;
		int salir = 0;
		int i = 1;
		int jovenEmpleado = 0;
		String texto = "a";
		
		System.out.println("Introduce la edad de los empleados:\n Cuando no haya mas empleados introduce \"exit\"");
		while(edadEmpleado != 0){
			System.out.printf("Empleado %d: ", i);
			i++;
			edadEmpleado = sc.nextInt();
			if(edadEmpleado < edadJovenEmpleado && edadEmpleado != 0){
				edadJovenEmpleado = edadEmpleado;
				jovenEmpleado = i;
			}
			
			
		} 
		System.out.printf("Tiene %d anos el empleado numero %d", edadJovenEmpleado, jovenEmpleado);
	}
	
	public static void main (String[] args) {
		Ej14();
		
	}
}

