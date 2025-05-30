package com.misEjercicios.java;

import java.util.Scanner;

public class OctavoEjercicio {

	public static void main(String[] args) {
		/* 8. Cree un programa que tome el valor de un producto
		 e imprima su precio final si éste tiene siempre
		 un descuento del 10%*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el precio del producto:");
		int precio = entrada.nextInt();
		double descuento = 0.10;
		
		double mul = precio * descuento;
		double precioFinal = precio - mul;
		System.out.println("El precio del producto es de:" + precioFinal  + " pesos, teniendo siempre un descuento del 10%");
		
		entrada.close();
	}

}
