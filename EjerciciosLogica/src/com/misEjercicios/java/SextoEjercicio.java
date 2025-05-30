package com.misEjercicios.java;

import java.util.Scanner;

public class SextoEjercicio {

	public static void main(String[] args) {
		/* 6. Cree un programa que tome el lado de un cubo e imprima su volumen.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el lado del cubo:");
		int ladoCubo = entrada.nextInt();
		
		int volumenCubo = ladoCubo * ladoCubo * ladoCubo;
		System.out.println("El volumen del cubo es de:" + volumenCubo);
		
		entrada.close();
	}
}
