package com.misEjercicios.java;

import java.util.Scanner;

public class TercerEjercicio {

	public static void main(String[] args) {
		/* 3. En un almacén de electrodomésticos se venden éstos a crédito y de contado.
		Si el cliente compra a crédito, el valor del electrodoméstico aumenta en un 5% 
		por cada mes que dure el crédito. Cree un programa para un almacén donde el administrador
		ingrese el precio de un electrodoméstico y el plazo en meses para pagarlo a crédito
		y muestre el valor fijo de las cuotas mensuales que deberá pagar por el electrodoméstico.*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el valor del el Electrodomestico:");
		int precio = entrada.nextInt();
		System.out.print("Ingrese el plazo de cuotas en meses a pagar:");
		int cuotas = entrada.nextInt();
		double aumento= 0.05;
		
		double precioAumento = (precio * aumento);
		
		
		double precioFinal = precio / cuotas + precioAumento;
		double precioTotal= precioFinal * cuotas;
		System.out.println("El valor a pagar en total es de:" + precioTotal +  ", el valor a pagar cada mes es de:" + precioFinal + ", con el 5% de aumento.");
		
	}

}
