import java.util.Scanner;

/*
Faça um algoritmos para simular a venda de passagens
de onibus. Considere as poltronas como sendo um array,
ou seja, se o onibus possui 40 lugares, declare um 
array de 40 posicoes.
Segue o menu para controlar as vendas das passagens.

Menu
=====================
1- Venda
2- Cancelamento
   Escolha:
   
Na opção 1, deves digitar a poltrona. Não esquecendo de 
	marcar somente as poltronas que estiverem disponíveis.	
Na opção 2, dever verificar se a poltrona desejada está
	vendida e disponibiliza-la novamente para venda.
Crie um método que mostre as poltronas para visualização
de quais estão livres e quais estão vendidas.

Exemplo:
[ 1]x [ 2]x   x[ 4] x[ 3]
[ 5]x [ 6]    x[ 8] x[ 7]
[ 9]  [10]x   x[12]  [11]
[13]  [14]x    [16] x[15]
[17]  [18]     [20]  [19]
[21]  [22]     [24]  [23]
[25]  [26]     [28]  [27]
[29]  [30]     [32]  [31]
[33]  [34]     [36]  [35]
[37]  [38]     [40]  [39]

*/

public class Desafio02Onibus {
	
	static int lugares = 0;
	static int[] onibus = new int[40];

	public static void main(String[] args) {
		lugares = 40;
		while(true)
		    mostraMenu();

	}// fim do main

	private static void mostraMenu() {
		System.out.println("Menu");
		System.out.println("================");
		System.out.println("1- Venda");
		System.out.println("2- Cancelamento");
		System.out.println("   Escolha:");
		
		mostraOnibus();
		
		int e = new Scanner(System.in).nextInt();
		
		switch(e) {
		case 1: venda(); break;
		case 2: cancela(); break;
		default: break;
		}
		
		
		
	}

	private static void cancela() {
		System.out.println("CANCELAMENTO --- Digite o numero da poltrona:");
		int poltrona = new Scanner(System.in).nextInt();
		if(onibus[poltrona-1] == 0)
			System.out.println("Poltrona já está desocupada.");
		else {
			System.out.println("Cancelamento realizado com sucesso.");
			onibus[poltrona-1] = 0;
		}
			
		
	}

	private static void venda() {
		System.out.println("VENDA --- Digite o numero da poltrona:");
		int poltrona = new Scanner(System.in).nextInt();
		if(onibus[poltrona-1] == 1)
			System.out.println("Poltrona ocupada. Tente outra.");
		else {
			System.out.println("Venda realizada com sucesso.");
			onibus[poltrona-1] = 1;
		}
		
	}

	private static void mostraOnibus() {
		System.out.println("Lugares no Onibus:");
		String space = " ";
		String ocupado = "X";
		int filas = 4;
		int flagAvanca = 0;
		//onibus[2] = 1;
		
		for(int i = 0;i<onibus.length;i++) {
			
			
			if((i+2)%filas == 0) { // se o proximo é multiplo de filas, imprime ele antes do anterior
				if((i+2) < onibus.length)
				    flagAvanca = 1;
				System.out.print("  [");
				
				if(i+2 < 10)
					System.out.print(space);
				System.out.print((i+2) + "]");
				if(onibus[i+1] != 0)
					System.out.print(ocupado);
				else System.out.print(space);
				System.out.print(space);
				if((i+2)%filas == 0)
				
			    System.out.print("[");
				if(i+1 < 10)
					System.out.print(space);
				System.out.print((i+1) + "]");
				if(onibus[i] != 0)
					System.out.print(ocupado);
				else System.out.print(space);
				System.out.print(space);
			    System.out.println();
			}
			else if((i+1) != onibus.length){	
				System.out.print("[");
				
				if(flagAvanca == 1) {
				    i+=1;
				    flagAvanca = 0;
			    }
			
			    if(i+1 < 10)
				    System.out.print(space);
			    System.out.print((i+1) + "]");
			    if(onibus[i] != 0)
				    System.out.print(ocupado);
			    else System.out.print(space);
			    System.out.print(space);
			    if((i+1)%filas == 0)
				    System.out.println();
			
			}
			

				
		}
		System.out.println("\n");
	}// -----------------------------

}// fim da classe
