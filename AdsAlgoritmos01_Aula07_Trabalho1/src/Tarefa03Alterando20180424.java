/*
 * Tarefa03
Altere o exercicio anterior colocando quantidades iniciais para cada nota. 
Lembrando que ao faltar alguma nota o valor deverá ser suprido pela próximas notas.
 */

import java.util.Scanner;
public class Tarefa03Alterando20180424 {
	
	static int menorNota = 10;
	static int valorAtual = 0, valorDisponivel = 0;
	static int qtNotas100, qtNotas50, qtNotas20, qtNotas10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insereNotasNoCaixa(3,4,5,6); //qtNotas100, qtNotas50, qtNotas20, qtNotas10
				
		while(valorDisponivel >= valorAtual) {
			valorDisponivel = mostraValorDisponivelParaSaque();
			System.out.println("NOTAS DISPONIVEIS");
			System.out.println("Qt de notas de 100: " + qtNotas100);
			System.out.println("Qt de notas de 50: " + qtNotas50);
			System.out.println("Qt de notas de 20: " + qtNotas20);
			System.out.println("Qt de notas de 10: " + qtNotas10);
			valorAtual = lerNumero("Digite um valor para saque: ");
			if(valorDisponivel >= valorAtual)
				saque();
			else System.out.println("Valor indisponivel para saque.");
		}
		
		System.out.println("Operacao Finalizada.");

	}//fim do main

	private static void saque() {
		
		if(qtNotas100 > 0) qtNotas100 -= calculaNotas(valorAtual, 100);
		if(qtNotas50 > 0) qtNotas50 -= calculaNotas(valorAtual, 50);
		if(qtNotas20 > 0) qtNotas20 -= calculaNotas(valorAtual, 20);
		if(qtNotas10 > 0) qtNotas10 -= calculaNotas(valorAtual, menorNota);
		
	}

	private static void insereNotasNoCaixa(int i, int j, int k, int l) {
		qtNotas100 = i;
		qtNotas50 = j;
		qtNotas20 = k;
		qtNotas10 = l;		
		
	}//---------------------------------

	private static int mostraValorDisponivelParaSaque() {
		int valorDisponivel = 	qtNotas100 * 100 +
				        		qtNotas50 * 50 +
				        		qtNotas20 * 20 +
				        		qtNotas10 * 10;
		System.out.println("Valor Disponivel para saque: " + valorDisponivel);
		return(valorDisponivel);
		
	}//---------------------------------

	private static int calculaNotas(int valor, int valorNota) {
			int notas = valor/valorNota;
			int resto = 0;
			resto = valor - notas*valorNota;
			System.out.println("Qt de notas de " + valorNota + " necessarias: " + notas);
						
			valorAtual = resto;
			return notas;
		
	}//---------------------------------

	private static int lerNumero(String msg) {
		System.out.print(msg);
		int numero = new Scanner(System.in).nextInt();
		if(numero < 0) return lerNumero(msg);
		else if (numero < menorNota) { //valor da nota mais baixa
			System.out.println("Valor muito baixo.");
			return lerNumero(msg);
		}
		return numero;
	
	}//---------------------------------

}// fim da classe
