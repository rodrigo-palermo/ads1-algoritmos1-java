import java.util.Scanner;

public class BatalhaNaval {
	
	private static int lin = 20;
	private static int col = 20;
	static char tabuleiro[][]= new char[lin][col];

	public static void main(String[] args) {
		
		System.out.println("=== BATALHA NAVAL ===");
		inicializaTabuleiroVazio();
		adicionaSubmarinos(3);
		adicionaDestroiers(1);
		mostraTabuleiroComIndex();
		while(true) {
			System.out.println("\n\n== Lance torpedos ==");
			int linha = digitaNumero("Digite o numero da linha: ");
			int coluna = digitaNumero("... e o numero da coluna: ");
			lancaTorpedo(linha-1,coluna-1);
			mostraTabuleiroComIndex();
		}

	}//fim de main

	private static void inicializaTabuleiroVazio() {
		for(int linha=0;linha<tabuleiro.length;linha++)
			for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
				tabuleiro[linha][coluna] = ' ';
		
	}

	private static void lancaTorpedo(int i, int j) {
		switch(tabuleiro[i][j]) {
			case ' ': tabuleiro[i][j] = '~'; System.out.println("\n\n~~~ AGUA ~~~"); break;
			case 'x': tabuleiro[i][j] = '*'; System.out.println("\n\n *** Destruiu submarino ***"); break;
			case 'X': tabuleiro[i][j] = '*'; System.out.println("\n\n*** Atingiu destroier ***"); break;
			default: System.out.println("!!!Tentativa repetida. Tente ooutra posicao!!!");break;
		}
		
	}

	private static void adicionaDestroiers(int quantidade) {
		for(int i=0;i<quantidade;i++) {
			int linha = 0;
			int coluna = 0;
			int tamanho = 5;
			boolean horizontal;
			boolean erro;
			
			do {
				erro = false;
				horizontal=true;
				linha = numeroAletatorioNoMaximo(20);
				coluna = numeroAletatorioNoMaximo(20);
				if(numeroAletatorioNoMaximo(2)==1)
					horizontal = false;
				try {
					if(horizontal)
						for(int c = 0;c<tamanho;c++) {
							//System.out.println("horizontal");
							char contador = tabuleiro[linha][coluna+c];
						}
					else {
						for(int l = 0;l<tamanho;l++) {
							//System.out.println("vertical");
							char contador = tabuleiro[linha+l][coluna];
						}
						
					}
				}catch(Exception e){
					erro = true;
					//System.out.println(e);
				}
				
			}while(erro); // falta verificar se tem navio em alguma posicao
			
			
			if(horizontal)
				for(int c = 0;c<tamanho;c++) {
					tabuleiro[linha][coluna+c]='X';
				}
			else {
				for(int l = 0;l<tamanho;l++) {
					tabuleiro[linha+l][coluna]='X';
				}
		}
		
	}
	}//------------------------

	private static void adicionaSubmarinos(int quantidade) {
		for(int i=0;i<quantidade;i++) {
			int linha = 0;
			int coluna = 0;
			
			do {
				linha = numeroAletatorioNoMaximo(lin);
				coluna = numeroAletatorioNoMaximo(col);
			}while(tabuleiro[linha][coluna] != ' ');
			
			tabuleiro[linha][coluna] = 'x';
		}
	}//------------------------------------------

	private static int numeroAletatorioNoMaximo(int maximo) {
		return (int) (maximo - maximo*Math.random()); //numero randomico, com valor maximo definido como parametro;
	}

	private static int digitaNumero(String mensagem) {
		System.out.print(mensagem);
		return new Scanner(System.in).nextInt();
	}
	
	private static void mostraTabuleiroComIndex() {
		System.out.println("");
		
		for(int linha=0;linha<tabuleiro.length;linha++) {
			if(linha==0) {
				System.out.print("  ");
				for(int coluna=0;coluna<tabuleiro[0].length;coluna++) {
					if(coluna<9)
						System.out.print(" "+(coluna+1));
					else System.out.print((coluna+1));
					System.out.print(" ");
				}
				System.out.println();
			}
			if(linha<9) System.out.print(" "+(linha+1));
			else System.out.print(linha+1);
			/*for(int coluna=0;coluna<tabuleiro[0].length;coluna++) //usando matriz booleana
				if(tabuleiro[linha][coluna]==true)
					System.out.print("[X]");
				else System.out.print("[ ]");*/
			for(int coluna=0;coluna<tabuleiro[0].length;coluna++)
				System.out.print("["+tabuleiro[linha][coluna]+"]");
			if(linha<9) System.out.print(" "+(linha+1));
			else System.out.print(linha+1);
			
			System.out.println();
		
		}
		System.out.print("  ");
		for(int coluna=0;coluna<tabuleiro[0].length;coluna++) {
			if(coluna<9)
				System.out.print(" "+(coluna+1));
			else System.out.print((coluna+1));
			System.out.print(" ");
		}
	}// ------------------------------

}//fim da classe

