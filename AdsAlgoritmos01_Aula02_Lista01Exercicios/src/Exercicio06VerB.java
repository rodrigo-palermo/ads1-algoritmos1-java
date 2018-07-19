/*
 * Explicação de METODOS usada na AULA 03 - ALGORITMOS
 */

import java.util.Scanner;

public class Exercicio06VerB {

	
	public static void main(String[] args) {
		
		
		// mostrar o maior valor digitado
		mostraMaiorNumero(
				digitaNumero("Digite 1o numero: "),
				digitaNumero("Digite 2o numero: ")
				);

	}// End of method main
	
	public static int digitaNumero(String mensagem) {
		System.out.println(mensagem);
		return new Scanner(System.in).nextInt();
	}
	
	public static void mostraMaiorNumero(int vA, int vB) {
		if (vA > vB) {
			System.out.println("Maior: " + vA);
		}
		else if (vA < vB) {
			System.out.println("Maior: " + vB);
		}
		else {
			System.out.println("Numeros iguais");
		}
	}

}// End of Class