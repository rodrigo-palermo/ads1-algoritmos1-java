import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  quantidade = lerNumero();
		imprimeAsterisco(quantidade);
		

	}//end of main

	private static int lerNumero(){
		System.out.print("Digite a quantidade de asteriscos: ");
		return new Scanner(System.in).nextInt();
	}
	
	private static void imprimeAsterisco(int quantidade) {
		for(int k=0; k<quantidade; k++) {
			System.out.println("*");
		}
	}
	
}//end of Class
