package com.misEjercicios.java;

import java.util.Scanner;

public class QuinceEjercicio {

	public static void main(String[] args) {
		/*15. Cree un programa que calcule horas y minutos a partir de segundos.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese los segundos:");
		int segundos = entrada.nextInt();
		
		int conversionAHoras = segundos / 3600;
		System.out.println("La conversion de:" + segundos + " segundos, a horas es de:" + conversionAHoras + " Horas");
		
		int conversionAMinutos = segundos / 60;
		System.out.println("La conversion de:" + segundos + " segundos, a minutos es de:" + conversionAMinutos + " Minutos");
		
		entrada.close();
	}

}
