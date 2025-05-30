package com.misEjercicios.java;

import java.util.Scanner;

public class QuintoEjercicio {

	public static void main(String[] args) {
		// 5. Cree un programa que tome el radio de un círculo e imprima su área y perímetro.
		
		Scanner entrada = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Ingrese el radio");
		int r = entrada.nextInt();
		
		double area = pi * (r * r);
		System.out.println("El area del circulo es de:" + area);
		
		double perimetro = 2 * pi * r;
		System.out.println("El perimetro del circulo es de:" + perimetro);
		
		entrada.close();
	}

}
