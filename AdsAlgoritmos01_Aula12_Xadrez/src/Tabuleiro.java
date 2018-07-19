import java.util.Scanner;

/*
 * Tabuleiro
Faça um algoritmo onde o usuário entre com as dimensões de uma matriz,
e o algoritmo crie a matriz com o desenho de um xadrez, conforme exemplo.
Tu deves utilizar uma matriz boleana.

Exemplo:
Qt. linhas:  4
Qt. colunas: 5
[x][  ][x][  ][x]
[  ][x][  ][x][  ]
[x][  ][x][  ][x]
[  ][x][  ][x][  ]

 */
public class Tabuleiro {
	
	private static int lin = digitaNumero("Digite o numero de linhas: ");
	private static int col = digitaNumero("Digite o numero de colunas: ");
	static boolean tabuleiro[][]= new boolean[lin][col];

	public static void main(String[] args) {
		
		System.out.println("\n=== Gerando um tabuleiro Xadrez ===");
		//desenhaXadrez(lin,col);
		preencheTabuleiroComXadrez();
		//mostraTabuleiroComIndex();
		mostraTabuleiro();

	}//fim de main

	private static int digitaNumero(String mensagem) {
		System.out.print(mensagem);
		return new Scanner(System.in).nextInt();
	}

	private static void preencheTabuleiroComXadrez() {
		for(int linha=0;linha<tabuleiro.length;linha++) {
			for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
				//solucao rodrigo
				/**/if(linha%2 == 0) {
					if(coluna%2 == 0)
						tabuleiro[linha][coluna]=true;
				}
				else 
					if(coluna%2 != 0)
						tabuleiro[linha][coluna]=true;
				/**/
				//solucao professor
				/** /if((linha%2 == 0 && coluna%2 == 0) || (linha%2 != 0 && coluna%2 != 0))
					tabuleiro[linha][coluna] = true;
				/**/
	
		}
	}//--------------------------------

	private static void desenhaXadrez(int lin, int col) {
		for(int linha=0;linha<lin;linha++) {
			for(int coluna=0;coluna<col;coluna++)
				if(linha%2 == 0)
					if(coluna%2 == 0)
						System.out.print("[X]");
				    else System.out.print("[ ]");
				else {
					if(coluna%2 == 0)
						System.out.print("[ ]");
				    else System.out.print("[X]");
					}
			System.out.println("");		
		}

		
	}// ------------------------------
	
	private static void mostraTabuleiro() {
		System.out.println("");
		for(int linha=0;linha<tabuleiro.length;linha++) {
			for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
				if(tabuleiro[linha][coluna]==true)
					System.out.print("[X]");
				else System.out.print("[ ]");
			System.out.println();
		
		}
	}// ------------------------------
	
	private static void mostraTabuleiroComIndex() {
		System.out.println("");
		
		for(int linha=0;linha<tabuleiro.length;linha++) {
			if(linha==0) {
				for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
					System.out.print("  "+(coluna+1)+"");
				System.out.println();
			}
			System.out.print(linha+1);
			for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
				if(tabuleiro[linha][coluna]==true)
					System.out.print("[X]");
				else System.out.print("[ ]");
			System.out.print(linha+1);
			System.out.println();
		
		}
		for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
			System.out.print("  "+(coluna+1)+"");
	}// ------------------------------

}//fim da classe
