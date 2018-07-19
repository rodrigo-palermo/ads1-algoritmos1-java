
/*
 * 6.	Fazer um algoritmo para ler dois nÃºmeros e mostrar o maior deles.
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// declarar as variáveis
		int vA, vB;
		
		// alimentar as variaveis
		System.out.print("Digite 2 numeros: ");
		vA = new Scanner(System.in).nextInt();
		vB = new Scanner(System.in).nextInt();

		// mostrar o maior valor digitado
		if (vA > vB) {
			System.out.print("Maior: " + vA);
		}
		else if (vA < vB) {
			System.out.print("Maior: " + vB);
		}
		else {
			System.out.print("Numeros iguais");
		}

	}// End of method main

}// End of Class
