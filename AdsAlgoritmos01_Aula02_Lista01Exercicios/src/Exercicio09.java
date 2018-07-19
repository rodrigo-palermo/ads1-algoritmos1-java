
/*
 * 9.	Faça um algoritmo que mostre o resultado da expressão abaixo:
 * (( x – 5) * y) – z
 * Obs: Ler valores para as variáveis x, y e z.
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y, z, resultado;

		System.out.println("Digite tres numeros reais x, y e z para calcular a funcao (( x – 5) * y) – z "
				+ "\nApós digitar cada número, aperte ENTER");
		x = new Scanner(System.in).nextDouble();
		y = new Scanner(System.in).nextDouble();
		z = new Scanner(System.in).nextDouble();

		resultado = ((x - 5) * y) - z;

		System.out.print("Resultado: " + resultado);

	}

}