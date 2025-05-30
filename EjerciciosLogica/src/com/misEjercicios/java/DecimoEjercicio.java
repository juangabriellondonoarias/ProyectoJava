package com.misEjercicios.java;

import java.util.Scanner;

public class DecimoEjercicio {

	public static void main(String[] args) {
		/* 10. Cree un programa que tome un número real e imprima su valor absoluto.*/
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		int numero1 = numero.nextInt();
		
		if(numero1 >= 0) {
			int valorAbsoluto = numero1;
			System.out.println("El valor Absoluto de:" + numero1 + ", es :" + valorAbsoluto);
		} else {
			int valorAbsoluto2 = -(numero1);
			System.out.println("El valor Absoluto de:" + numero1 + ", es :" + valorAbsoluto2);
			
			numero.close();
		}	
	}
}
