/*
7. La raíz cuadrada de 2 fue posiblemente el primer número irracional conocido en la historia. Así,
por ejemplo, en la India, antes de Cristo, textos matemáticos (el Sulbasutras) describían una
forma sencilla de obtener una aproximación de este número utilizando la siguiente fórmula:


Escribe un programa que calcule y muestre por pantalla el resultado de la anterior fórmula, y que
muestre, además, el valor de la raíz cuadrada de 2 calculada con la función matemática sqrt().
 */


public class Ejercicio7 {
	
	public static void main (String[] args) {
		//Da diferente numero si le ponemos el .0 al final en los denominadores
		double raizFormula2 = 1.0 + 1/3.0 + 1/(3.0*4) + 1/(3*4*34.0);
		
		double raiz2 = Math.sqrt(2);
		
		System.out.printf("El calculo de la raiz por formula es %f y de .sqrt es %f", raizFormula2, raiz2);
	}
}

