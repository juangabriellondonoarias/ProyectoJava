package com.misEjercicios.java;

import java.util.Scanner;

public class PrimerEjercicio {

	public static void main(String[] args) {
		
		/* 1. Cree un programa que lea la edad de un usuario y muestre cuántos años tendrá el usuario
		dentro de tantos años como éste indique. Por ejemplo, si el usuario tiene 20 años y quiere saber
		cuántos años tendrá dentro de 15 años, el programa deberá mostrar que tendrá 35 años.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la edad que tienes actualmente:");
		int edad = entrada.nextInt();
		
		System.out.print("Ingrese los años que sumados con los de actualmente que vas a tener:");
		int edadAños = entrada.nextInt();
		
		int sumaAños = edad + edadAños;
		
		System.out.println("La edad actual que tienes es de:" + edad);
		System.out.println("Los años sumados con los que vas a tener:" + edadAños);
		System.out.println("Vas a tener:" + sumaAños + " años a futuro.");
		
		entrada.close();
	}

}
