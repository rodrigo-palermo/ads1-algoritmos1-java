
/*
 * 1.	Ler dois números N1 e N2 (nesta ordem) e imprimir as variáveis 
 *      N1 e N2, nesta ordem (ordem de digitação).
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//declaracao de variaveis
		int n1, n2;
		
		//entrada de dados
		System.out.print("Digite o primeiro numero:");
		n1 = new Scanner(System.in).nextInt();

		System.out.print("Digite o segundo numero:");
		n2 = new Scanner(System.in).nextInt();

		//saída de dados
		System.out.println("Primeiro numero: " + n1);
		System.out.println("Segundo numero: " + n2);

	} // Fim do main

}// Fim da Classe