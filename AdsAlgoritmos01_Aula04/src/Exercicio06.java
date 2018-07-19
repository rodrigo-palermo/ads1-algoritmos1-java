import java.util.Scanner;

/*
 * Exercicio06 Faca um programa que receba um numero entre (-1000) e (+9999)
 * e diga se este numero pertence as seguintes faixas:
 * -negativo
 * -zero
 * -unidade
 * -dezena
 * -centena
 * -milhar[
 * -ERRO caso esteja fora do intervalo
 */
public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = lerNumero();
		escreveFaixa(numero);

	}// end of main
	
	private static int lerNumero() {
		System.out.println("Digite um numero ente -1000 e +9999");
		return new Scanner(System.in).nextInt();
	}
	
	private static void escreveFaixa(int numero) {
		
		String faixa="ERRO";
		if(numero<-1000 || numero >=10000)
			faixa = "*** ERRO. Numero fora do intervalo especificado";
		else if(numero<0)
			faixa = "negativo";
		else if (numero==0)
			faixa = "zero";
		else if (numero<10)
			faixa = "unidade";
		else if (numero <100)
			faixa = "dezena";
		else if (numero <1000)
			faixa = "centena";
		else if (numero <10000)
			faixa = "milhar";
			
		System.out.println("Faixa: "+faixa);	
	}
	
	

}//end of Class
