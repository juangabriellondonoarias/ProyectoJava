package com.misEjercicios.java;

import java.util.Scanner;

public class Recursividad {

	    public static long calcularFactorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        else {
	            System.out.println("Calculando factorial de " + n + ": " + n + " * factorial(" + (n - 1) + ")");
	            return n * calcularFactorial(n - 1);
	        }
	    }

	    public static void main(String[] args) {
	    	System.out.println("Ingrese el numero para calcular el factorial:");
	        Scanner entrada = new Scanner(System.in);
	        int numero = entrada.nextInt();
	        long resultado = calcularFactorial(numero);
	        System.out.println("El factorial de " + numero + " es: " + resultado);
	}
}
