
/*
 * 4.	Ler três valores numéricos e escrever a média aritmética.
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, media;

		System.out.print(
				"Digite tres numeros reais para encontrar a media. " + "\nApós digitar cada número, aperte ENTER");
		n1 = new Scanner(System.in).nextDouble();
		n2 = new Scanner(System.in).nextDouble();
		n3 = new Scanner(System.in).nextDouble();

		media = (n1 + n2 + n3) / 3.0;

		System.out.print("Média: " + media);

	}

}
