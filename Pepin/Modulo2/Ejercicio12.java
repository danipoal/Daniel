/*
 * Ejercicio12.java
 * 
 * Copyright 2023 Daniel <Daniel@DESKTOP-C5VGCM1>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main (String[] args) {
	double precioProducto = 0.0;
    double precioFinalProducto = 0.0;
    double precioInicial = 10.0;
    int numeroMesCuota = 1;

    System.out.printf("Introduzca el precio del producto: ");
    Scanner sc = new Scanner(System.in);
    
    precioProducto = sc.nextDouble();
    precioFinalProducto = precioProducto + (precioProducto * 0.05);
    System.out.printf("Importe final a devolver: %.2f\n\n", precioFinalProducto);
    for(boolean repetir = true; precioInicial <= precioFinalProducto && repetir; precioInicial = precioInicial * 2)
    {
        precioFinalProducto = precioFinalProducto - precioInicial;
        System.out.printf("- Mes %d: %.2f euros (cantidad pendiente %.2f)\n",numeroMesCuota, precioInicial, precioFinalProducto);
        if(precioFinalProducto <= precioInicial * 2)
        {
            System.out.printf("- Mes %d: %.2f euros (cantidad pendiente 0)\n",numeroMesCuota + 1, precioFinalProducto);
            repetir = false;
        }
        else numeroMesCuota = numeroMesCuota + 1;
    }
    System.out.printf("\nSe ha pagado en un total de %d plazos\n", numeroMesCuota + 1);
	}
}

