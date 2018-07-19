
/*
 * 7.	Ler 3 números e imprimi-los em ordem crescente.
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3;
		double menor, meio, maior;

		System.out.print("Digite 3 numeros reais, apertando ENTER após cada um:\n");
		n1 = new Scanner(System.in).nextInt();
		n2 = new Scanner(System.in).nextInt();
		n3 = new Scanner(System.in).nextInt();

		if (n1 < n2) {
			menor = n1;
			if (n1 < n3)
				if (n3 < n2) { // ordem 132
					meio = n3;
					maior = n2;
				} else { // ordem 123
					meio = n2;
					maior = n3;
				}
			else { // ordem 312
				menor = n3;
				meio = n1;
				maior = n2;
			}
		} else {
			menor = n2;
			if (n2 < n3)
				if (n3 < n1) { // ordem 231
					meio = n3;
					maior = n1;
				} else { // ordem 213
					meio = n1;
					maior = n3;
				}
			else { // ordem 321
				menor = n3;
				meio = n2;
				maior = n1;
			}
		}

		System.out.println("Ordem crescente: " + menor + " <= " + meio + " <= " + maior);

	}// End of method main

}// End of Class Exercicio07
