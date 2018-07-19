
/*
 * 13.	Ler um número N e imprimir F1, F2 ou F3, conforme a condição:
 *	se N <= 10 imprima F1,
 *	se N > 10 e <= 100 imprima F2
 *	se N >100 imprima F3.
 *
 */

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;

		System.out.print("Digite um numero: ");
		n = new Scanner(System.in).nextInt();

		// chaves opcionais para somente um comando em IF ou ELSE
		if (n <= 10) {
			System.out.print("N1");
		} else {
			if (n > 10 && n <= 100) {
				System.out.print("N2");
			} else {
				System.out.print("N3");
			}
		}

	}

}
