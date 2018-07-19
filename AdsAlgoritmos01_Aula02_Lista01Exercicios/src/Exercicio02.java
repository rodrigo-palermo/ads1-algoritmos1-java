
/*
 * 2.	Escreva um algoritmo que leia dois números que deverão ser 
 *      colocados, respectivamente, nas variáveis VA e VB.  
 *      O algoritmo deve, então, trocar os valores de VA por VB e 
 *      vice-versa e mostrar o conteúdo destas variáveis.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vA, vB, temp;

		System.out.print("Digite a primeira variavel inteira: ");
		vA = new Scanner(System.in).nextInt();

		System.out.print("Digite a segunda variavel inteira: ");
		vB = new Scanner(System.in).nextInt();

		temp = vA;
		vA = vB;
		vB = temp;

		System.out.print("vA: " + vA);
		System.out.print("\nvB: " + vB);

	} // Fim do main

}// Fim da Classe