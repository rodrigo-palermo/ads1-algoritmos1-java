/*
 * Modificação do exercício 01, para conceitos de variáveis globais e métodos
 */

/*
 * 1.	Ler dois números N1 e N2 (nesta ordem) e imprimir as variáveis 
 *      N1 e N2, nesta ordem (ordem de digitação).
 */

import java.util.Scanner;

public class Exercicio01metodos {

	//declaracao GLOBAL de variaveis
	//static	int n1, n2;
	
	public static void main(String[] args) {
		
		// (digitar-i)
		//digitarNumerosI();
		
		// (digitar-ii)
		// se só variavel global 
	    //n1 = digitarNumerosII("n1: ");
	    //n2 = digitarNumerosII("n2: ");
	    
	    // (digitar-ii)
	 	// se só variavel local, deve-se declarar/inicializar 
	 	//int n1 = digitarNumerosII("n1: ");
	 	//int n2 = digitarNumerosII("n2: ");
		
	    // (mostrar-i)
	    //mostrarNumerosI();
		
        // (mostrar-ii) com passagem de parametros para variaveis locais
	    //mostrarNumerosII(n1, n2);
	    
	    //(simples-i) simplificação para UMA UNICA LINHA DE COMANDO
	    mostrarNumerosII(digitarNumerosII("n1: "),digitarNumerosII("n2: "));

	} // Fim do main
	
	// (digitar-i) Metodo sem retorno e parametro, com variavel global
	/*public static void digitarNumerosI() {
		//entrada de dados
		System.out.print("Digite o primeiro numero:");
		n1 = new Scanner(System.in).nextInt();
		System.out.print("Digite o segundo numero:");
		n2 = new Scanner(System.in).nextInt();
	}*/// Fim do metodo
	
	// (digitar-ii) Metodo com retorno, com parametro, com variavel global ou local fora do metodo, com var interna ao metodo
	public static int digitarNumerosII(String mensagem) {
		//int num;
		System.out.print("Digite o "+mensagem);
		//int num = new Scanner(System.in).nextInt();
		//return num;
		return new Scanner(System.in).nextInt();  // sem instanciar como int num antes
	}// Fim do metodo

	// (mostrar-i) Metodo sem retorno, sem parametro, com variavel global
	/*public static void mostrarNumerosI() {
		//saida de dados
		System.out.println("Primeiro numero: " + n1);
		System.out.println("Segundo numero: " + n2);
	}*/// Fim do metodo
	
	// (mostrar-ii) Metodo sem retorno, com parametro, com varivel local
	public static void mostrarNumerosII(int num1, int num2) {
         //saida de dados
        System.out.println("Primeiro numero: " + num1);
        System.out.println("Segundo numero: " + num2);
	}// Fim do metodo

}// Fim da Classe
