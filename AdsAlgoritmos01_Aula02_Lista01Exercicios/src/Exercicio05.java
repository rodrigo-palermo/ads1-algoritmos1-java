
/*
 * 5.	Ler um conjunto de 5 dados numéricos e imprimir sua soma e sua média.
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, n4, n5, soma, media;

		System.out.print(
				"Digite cinco numeros reais para encontrar a media. " + "\nApos digitar cada numero, aperte ENTER");
		n1 = new Scanner(System.in).nextDouble();
		n2 = new Scanner(System.in).nextDouble();
		n3 = new Scanner(System.in).nextDouble();
		n4 = new Scanner(System.in).nextDouble();
		n5 = new Scanner(System.in).nextDouble();

		soma = (n1 + n2 + n3 + n4 + n5);
		media = soma / 5.0;

		System.out.println("Soma:  " + soma);
		System.out.print("Media: " + media);

	}

}