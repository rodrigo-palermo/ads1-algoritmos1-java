import java.util.Scanner;

public class Exercicio04Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  quantidade = lerNumero();
		imprimeTrianguloAsterisco(quantidade);
		

	}//end of main

	private static int lerNumero(){
		System.out.print("Digite a quantidade de linhas: ");
		return new Scanner(System.in).nextInt();
	}
	
	private static void imprimeTrianguloAsterisco(int quantidade) {
		for(int k=0; k<quantidade+1; k++) {
			for(int col=0;col<k;col++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	


}//end of Class
