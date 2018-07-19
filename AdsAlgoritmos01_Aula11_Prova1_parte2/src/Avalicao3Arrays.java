import java.util.Scanner;

/*
 * Rodrigo de Avila Palermo
 */
public class Avalicao3Arrays {
	
	static int v1[] = new int[8];
	static int v2[] = new int[6];
	static int v3[] = new int[5];
	static int vetorAtual = 1;
	static int indiceCrescente = 0;
	static int indiceDecrescente = v3.length-1;
	static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mostraVetores();
		while(true) {
			num = digitaNumero("Digite um numero inteiro: ");
			preencheVetores();
			mostraVetores();
		}
		


	}// fim do main

	private static void preencheVetores() {
		if(vetorAtual == 1) {
			if(indiceCrescente != v1.length) {
				insereEmVetor(v1,indiceCrescente);
				indiceCrescente++;
			}
			else{
				vetorAtual = 2;
				indiceCrescente = 0;
			}
		}
		if(vetorAtual == 2) {
			if(indiceCrescente != v2.length) {
				insereEmVetor(v2,indiceCrescente);
				indiceCrescente++;
			}
			else{
				vetorAtual = 3;
				indiceCrescente = 0;				
			}
		}
		if(vetorAtual == 3) {
			
			insereEmVetor(v3,indiceDecrescente);
			indiceDecrescente--;
			if(indiceDecrescente < 0) {
				indiceDecrescente = v3.length-1;
				vetorAtual = 1;
			}
		}
		
	}//-------------------------------

	private static void insereEmVetor(int[] vetor, int indice) {
		vetor[indice] = num;
		
	}//-------------------------------

	private static int digitaNumero(String mensagem) {
		int numero = 0;
		boolean numValido = false;
		System.out.print(mensagem);
		while(!numValido) {
			try {
				numero = new Scanner(System.in).nextInt();
				numValido = true;
			}catch(Exception erro) {
				System.out.println("Entrada inv�lida. Digite novamente.");
				numValido = false;
			}
		}
		return numero;
	}//-------------------------------

	private static void mostraVetores() {
		mostraVetor("v1",v1);
		mostraVetor("v2",v2);
		mostraVetor("v3",v3);
		
	}//-------------------------------

	private static void mostraVetor(String nome, int vetor[]) {
		System.out.print("Vetor " + nome + " : {");
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]);
			if(i != vetor.length-1)
				System.out.print("; ");
			else System.out.println("}");
		}
	}//-------------------------------

}// fim da classe
