package com.misEjercicios.java;

import java.util.Random;

public class OnceEjercicio {

	public static void main(String[] args) {
		/* 11. Cree un programa que simule el lanzamiento de dos dados y muestre la suma de los resultados*/

		Random dado = new Random();
		
		int dado1 = dado.nextInt(6) + 1 ;
		System.out.println("El primer dado callo:" + dado1);
		
		int dado2 = dado.nextInt(6) + 1;
		System.out.println("El segundo dado callo:" + dado2);
		
		int sumaDados = dado1 + dado2;
		System.out.println("La suma de los dados es de:" + sumaDados);
	}
}
