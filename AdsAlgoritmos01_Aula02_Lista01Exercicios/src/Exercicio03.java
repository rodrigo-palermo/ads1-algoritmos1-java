
/*
 * 3.	Ler dois valores numéricos e escrever a soma destes.
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		double soma;
		System.out.print("Digite o primeiro numero:");
		n1 = new Scanner(System.in).nextInt();

		System.out.print("Digite o segundo numero:");
		n2 = new Scanner(System.in).nextInt();

		soma = n1 + n2;
		System.out.print("Soma: " + soma);

	} // Fim do main

}// Fim da Classe
