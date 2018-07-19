/*
 * 10.	Fazer um algoritmo para ler duas notas, os pesos de cada nota e mostrar a média ponderada.  
	Cálculo da Média Ponderada = ((nota 1 * peso da nota 1) + (nota 2 * peso da nota 2)) / soma dos pesos

 */

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, p1, n2, p2, mediaPonderada;
		
		System.out.print("Notas e pesos de provas. Digite a nota 1: ");
		n1 = new Scanner(System.in).nextDouble();
		System.out.print("Digite o peso 1: ");
		p1 = new Scanner(System.in).nextDouble();
		System.out.print("Digite a nota 2: ");
		n2 = new Scanner(System.in).nextDouble();
		System.out.print("Digite o peso 2: ");
		p2 = new Scanner(System.in).nextDouble();
		
		mediaPonderada = ((n1*p1)+(n2*p2))/(p1 + p2);
		
		System.out.println("Media Ponderada: "+mediaPonderada);

	}

}
