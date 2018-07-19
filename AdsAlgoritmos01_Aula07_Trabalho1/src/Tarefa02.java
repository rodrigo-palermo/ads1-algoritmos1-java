/*
 * Tarefa02
Faça um algoritmo que simule um saque automático. Receba um valor e 
mostre quantas notas são necessárias para pagar este valor.
(apenas notas de 100, 50, 20, 10)
Exemplo:
Digite um valor para saque:  340
Qt de notas de 100: 3
Qt de notas de 50: 0
Qt de notas de 20: 2
Qt de notas de 10: 0
 */

import java.util.Scanner;
public class Tarefa02 {
	
	static int menorNota = 10;
	static int valorAtual = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valorAtual = lerNumero("Digite um valor para saque: ");
		calculaNotas(valorAtual, 100);
		calculaNotas(valorAtual, 50);
		calculaNotas(valorAtual, 20);
		calculaNotas(valorAtual, menorNota);

	}

	private static void calculaNotas(int valor, int valorNota) {
			int notas = valor/valorNota;
			int resto = 0;
			resto = valor - notas*valorNota;
			System.out.println("Qt de notas de " + valorNota + ": " + notas);
			
			valorAtual = resto;
		
	}

	private static int lerNumero(String msg) {
		System.out.print(msg);
		int numero = new Scanner(System.in).nextInt();
		if(numero < 0) return lerNumero(msg);
		else if (numero < menorNota) { //valor da nota mais baixa
			System.out.println("Valor muito baixo.");
			return lerNumero(msg);
		}
		return numero;
	
	}

}
