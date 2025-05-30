package com.misEjercicios.java;

import java.util.Scanner;

public class TreceEjercicio {

	public static void main(String[] args) {
		/*13. Cree un programa que calcule el factorial de 5*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el numero a factorial:");
		int numero = entrada.nextInt();
		
		long factorial = 1;
		
		for(int i = 1; i <= numero; i++) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de:" + numero + ", es de:" + factorial);
	}
}
