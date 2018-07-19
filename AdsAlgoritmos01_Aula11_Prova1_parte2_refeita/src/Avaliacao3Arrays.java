import java.util.Scanner;

public class Avaliacao3Arrays {
	
	static int v1[] = new int[8];
	static int v2[] = new int[6];
	static int v3[] = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
			preencheVetor(0,v1);
			preencheVetor(0,v2);
			preencheVetor(1,v3);
		}

	}// fim do main

	private static void mostraVetores() {
		mostraVetor(v1);
		mostraVetor(v2);
		mostraVetor(v3);
		
	}//-----------------------------------------

	private static void mostraVetor(int vetor[]) {
		System.out.print("Vetor: {");
		for(int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i != vetor.length-1)
				System.out.print("; ");
			else System.out.println("}");
		}
			
	}//-----------------------------------------

	private static void preencheVetor(int ordem, int[] vetor) {  //Parametro 1: [0] ordem crescente; [1] ordem descrescente
		if(ordem == 0)
			for(int i=0; i<vetor.length; i++) {
			    vetor[i]=digitaNumero();
			    mostraVetores();
		    }
		else
			for(int i=vetor.length-1; i>=0; i--) {
				vetor[i]=digitaNumero();
				mostraVetores();
			}
		
	}//-----------------------------------------

	private static int digitaNumero() {
		System.out.print("Digite um numero inteiro:");
		return new Scanner(System.in).nextInt();
	}//-----------------------------------------

}//fim da classe
