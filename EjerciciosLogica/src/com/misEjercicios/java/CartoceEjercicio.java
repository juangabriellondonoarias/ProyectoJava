package com.misEjercicios.java;

import java.util.Random;
import java.util.Scanner;

public class CartoceEjercicio {

	public static void main(String[] args) {
		/* 14. Cree un programa que genere un número aleatorio dentro de un rango específico.*/
		
		Random numeroAletorio = new Random();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el numero del rango:");
		int numeroElegido = entrada.nextInt();
		
		int numero = numeroAletorio.nextInt(numeroElegido) + 1;
		System.out.println("El numero aleatorio de un rango especifico es:" + numero);
		
		entrada.close();
	}
}
