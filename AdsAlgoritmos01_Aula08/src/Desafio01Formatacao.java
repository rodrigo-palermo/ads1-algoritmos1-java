import java.util.Scanner;

/*
Faça um algoritmos para ler um número inteiro 
positivo de até 3 dígitos. Este número será
armazenado em um array de inteiros de 8 posições.
Para cada número lido imprima o array conforme
exemplo mostrado abaixo:

Vetor:
0[123] 1[ 33] 2[ 43] 3[  4] 4[322] 5[  4] 6[ 22] 7[ 40]

Importante: Os números dentro do array ([ ]) podem mudar,
mas a impressão fica sempre com a mesma distância.

*/
public class Desafio01Formatacao {
	
	static int[] vetor = new int[8];

	public static void main(String[] args) {
		
		for(int i=0;i<vetor.length-1;i++) {
			vetor[i] = digitaNumero("Digite um numero de ate 3 algarismos para incluir no vetor");
			mostraVetor();
		}
		    

	}//fim de main
	
	private static void mostraVetor() {
		// TODO Auto-generated method stub
		System.out.println("Vetor:");
		String space = " ";
		for(int i = 0;i<vetor.length-1;i++) {
			System.out.print(i + "[");
			if(vetor[i] < 10)
				System.out.print(space + space);
			else if(vetor[i] < 100)
				System.out.print(space);
			System.out.print(vetor[i]+ "] ");
		}
		System.out.println("\n");
	}

	private static int digitaNumero(String msg) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		System.out.println(msg);
		try {
			num = teclado.nextInt();
		}catch(Exception erro) {
			System.out.println("Erro!");
		}
		return num;
	}// --------------------------------

}//fim da classe
