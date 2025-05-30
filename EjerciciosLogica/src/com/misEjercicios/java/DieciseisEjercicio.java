package com.misEjercicios.java;

import java.util.Scanner;

public class DieciseisEjercicio {

	public static void main(String[] args) {
		/* 16. Cree un programa que dados a, b y c, use la fórmula
		general para resolver la ecuación cuadrática correspondiente.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de la a:");
		int a = entrada.nextInt();

		System.out.println("Ingrese el valor de la b:");
		int b = entrada.nextInt();
		
		System.out.println("Ingrese el valor de la c:");
		int c = entrada.nextInt();
		
		int raiz = b*b;
        int raiz2 = 4*a*c;
        int division = 2*a;
        int raizSuma= raiz-raiz2;
        double solucionRaiz = Math.sqrt(raizSuma);

            double solucionSum = -b+solucionRaiz;
            double resultado = solucionSum/division;
            
            double solucionSum2 = -b-solucionRaiz;
            double resultado2 = solucionSum2 / division;

            double formulaPositiva = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
            double formulaNegativa = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

            System.out.println("Resultado cuadratica positiva de la primera forma es:" + resultado);
            System.out.println("Resultado cuadratica negativa de la primera froma es:" + resultado2);
            System.out.println("-------------------------------------------");
            System.out.println("Resultado cuadratica positiva de la segunda forma es: " + formulaPositiva);
            System.out.println("Resultado cuadratica negativa de la segunda forma es: " + formulaNegativa);
        
		entrada.close();
	}
}

