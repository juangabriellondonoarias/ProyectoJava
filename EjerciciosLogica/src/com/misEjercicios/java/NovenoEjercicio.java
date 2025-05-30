package com.misEjercicios.java;

import java.util.Scanner;

public class NovenoEjercicio {

	public static void main(String[] args) {
		/*9. Cree un programa que lea una cantidad e imprima un
		 porcentaje a calcular requerido sobre esa cantidad.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una cantidad:");
		int cantidad = entrada.nextInt();
		
		System.out.println("Ingrese el porcentaje que deseas a calcular ");
		int porcentaje = entrada.nextInt();
		
		int precioFinal = (cantidad * porcentaje) / 100 ;
		System.out.println("El:" + porcentaje + "%, de:" + cantidad + ", es de:" + precioFinal);
		
		entrada.close();
	}

}
