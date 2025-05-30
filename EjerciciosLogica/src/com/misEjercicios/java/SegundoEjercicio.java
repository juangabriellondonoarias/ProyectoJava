package com.misEjercicios.java;

import java.util.Scanner;

public class SegundoEjercicio {

	public static void main(String[] args) {
		/* 2. Cree un programa que lea dos números y muestre su producto, su módulo, su cociente,
		 su suma y su resta.*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el primer numero:");
		int num1 = entrada.nextInt();
		System.out.print("Ingrese el segundo numero:");
		int num2 = entrada.nextInt();
		
		int suma = num1 + num2;
		System.out.println("la suma es:" + suma);
		
		int resta = num1 - num2;
		System.out.println("La resta es:" + resta);
		
		int mul = num1 * num2;
		System.out.println("La multiplicacion es:" + mul);
		
		double cociente2 = (double) num1 / num2;
		System.out.println("El cociente es:" + cociente2);
		
		int modulo = num1 % num2;
		System.out.println("El modulo es:" + modulo);
		
		entrada.close();
	}

}
