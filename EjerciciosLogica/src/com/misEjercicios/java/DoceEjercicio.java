package com.misEjercicios.java;

import java.util.Scanner;

public class DoceEjercicio {
	public static void main(String[] arg) {
		/* 12. Cree un programa que realice la conversión de grados Celsius a Fahrenheit*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese los Celsius para convertir a fahrenheit:");
		int celsius = entrada.nextInt();
		
		double conversion = (celsius * 1.8) + 32;
		System.out.println("La conversion de:" + celsius + "°C, a fahrenheit es de:" + conversion + "°F");
		
		entrada.close();
	}

}
