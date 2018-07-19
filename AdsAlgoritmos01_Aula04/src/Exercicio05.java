import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int colunaInicial, quantidadeLinhas;
		
		System.out.print("Digite a coluna da posicao inicial: ");
		colunaInicial = new Scanner(System.in).nextInt();
		
		System.out.print("Digite a quantidade de linhas: ");
		quantidadeLinhas = new Scanner(System.in).nextInt();
		
		
		for(int lin=1;lin<=quantidadeLinhas;lin++) {
			for(int espaco = 1;espaco<=colunaInicial;espaco++) {
				System.out.print(" ");
			}
			for(int col=1;col<=lin;col++) {
				System.out.print("*");
			}
				
			
			System.out.println("");
		}
		

	}

}