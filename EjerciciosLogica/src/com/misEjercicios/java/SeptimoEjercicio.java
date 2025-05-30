package com.misEjercicios.java;

import java.util.Scanner;

public class SeptimoEjercicio {

	public static void main(String[] args) {
		/* 7. Cree un programa que tome el precio de un producto 
		e imprima su precio final al consumidor con un IVA de 19%.*/
		
		Scanner entrada = new Scanner(System.in);
		
		double IVA = 0.19;
		
		System.out.println("Ingrese el precio del producto:");
		int precio = entrada.nextInt();
		
		double precioIva = precio * IVA;
		int precioIva2 = (int) precioIva;
		
		int precioFinal = precio + precioIva2;
		System.out.println("El precio del producto es de:" + precioFinal + ", teniendo un 19% de IVA");
		
		entrada.close();
	}
}
