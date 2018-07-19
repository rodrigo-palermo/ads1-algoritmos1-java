
/*
 * 8.	Faça um algoritmo que leia valores para as variáveis A, B e C e 
 * mostre o resultado da seguinte expressão:
 * ( A – B ) * C

 */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, C, resultado;

		System.out.println("Digite tres numeros reais A, B e C para calcular a funcao (A-B)*C. "
				+ "\nApós digitar cada número, aperte ENTER");
		A = new Scanner(System.in).nextDouble();
		B = new Scanner(System.in).nextDouble();
		C = new Scanner(System.in).nextDouble();

		resultado = (A - B) * C;

		System.out.print("Resultado: " + resultado);

	}

}
