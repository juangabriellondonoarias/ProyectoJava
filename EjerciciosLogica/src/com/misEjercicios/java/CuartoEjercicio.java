package com.misEjercicios.java;

import java.util.Scanner;

public class CuartoEjercicio {

	public static void main(String[] args) {
		// 4. Cree un programa que tome la base y la altura de un triángulo e imprima su área.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese la base del triangulo:");
		int base = entrada.nextInt();
		
		System.out.println("Ingrese la altura del triangulo:");
		int altura = entrada.nextInt();
		
		int area = (base * altura) / 2;
		System.out.println("El area del trinagulo es de:" + area);
		
		entrada.close();
	}
}
