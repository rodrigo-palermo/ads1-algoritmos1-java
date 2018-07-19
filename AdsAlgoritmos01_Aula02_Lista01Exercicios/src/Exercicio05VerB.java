//TAREFA DE ALGORITMOS (20180320) - refazer com metodos

/*
 * 5.	Ler um conjunto de 5 dados numéricos e imprimir sua soma e sua média.
 */

import java.util.Scanner;

public class Exercicio05VerB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, n4, n5, soma, media;

		System.out.println(
				"Digite cinco numeros reais para encontrar a media. " + "\nApos digitar cada numero, aperte ENTER");
		n1 = lerNumero();
		n2 = lerNumero();
		n3 = lerNumero();
		n4 = lerNumero();
		n5 = lerNumero();

		soma = (n1 + n2 + n3 + n4 + n5);
		media = soma / 5.0;

		System.out.println("Soma:  " + soma);
		System.out.print("Media: " + media);

	}//end of main
	
	private static double lerNumero() {
		return new Scanner(System.in).nextDouble();
		
	}

}//end of Class