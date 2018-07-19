/*
 * Aula13 - 05/Junho  
Exercício
Exercício Array de Frases
Faça um algoritmo que utilize 2 vetores(arrays). 
vFrase[6] (String),  e vQtVogais[6] de inteiros.

Crie um método para preencher o array vFrase com o seguinte critério:

1- Cada frase não deverá ter menos de 3 caracteres, nem mais de 50 caracteres.
2- Após preenchido o array vFrase, crie um método que peça ao usuário para 
escolher 3 frases, para cada frase escolhida envie-a como parâmetro para 
um método que contará quantas vogais existem nesta frase e armazene este 
dado no array vQtVogais, no mesmo índice da frase recebida de vFrase.
3- Peça ao usuário para escolher uma frase, diferente das escolhidas anteriormente,
após peça para o usuário escolher uma das letras existentes na frase e crie um
método que substitua a letra escolhida por um ponto em toda a frase.
 */

import java.util.Scanner;

public class Controle {
	
	static String vFrase[] = new String[6];
	static int vQtVogais[] = new int[6];
	static int vIndFrasesEscolhidas[] = new int[3];

	public static void main(String[] args) {
		
		while(true) {
			//preencheFrasesDoUsuario();
			preencheFrasesAuto();
			mostraFrases();
			escolhaFrasesParaContarVogais();
			//mostraQtVogaisTodasFrases();
			trocaCharPorPonto("Selecione uma frase, diferente das escolhidas anteriormente.");
			//mostraFrases();
		}
		
	}// fim do main

	private static void mostraFrase(int posicao) {
		System.out.println("Frase "+(posicao)+": "+vFrase[posicao-1]);
	}//-------------------------------------------

	private static void trocaCharPorPonto(String msg) {
		System.out.println(msg);
		int indice = escolhaUmaFrase()-1;
		
		if(!fraseRepetida(indice)) {
			System.out.print("Digite um caractere para substituir por um '.', sem diferenciar letras maisuculas de minusculas: ");
			String c = new Scanner(System.in).next();
			String frase = vFrase[indice];
			vFrase[indice]=frase.replace(c.toLowerCase().charAt(0), '.').replace(c.toUpperCase().charAt(0), '.');
			
			System.out.println();
			mostraFrase(indice+1);
			System.out.println("\n");
		}
		else {
			trocaCharPorPonto("Frase já escolhida. Tente novamente.");
		}
	}//-------------------------------------------

	private static boolean fraseRepetida(int indice) {
		for(int i=0;i<vIndFrasesEscolhidas.length;i++)
			if(vIndFrasesEscolhidas[i]==indice)
				return true;
		return false;
	}//-------------------------------------------

	private static void mostraQtVogaisTodasFrases() {
		System.out.println("\nImpressao de quantidades de vogais das frases:");
		for(int i = 0; i<vQtVogais.length; i++)
			System.out.println("Frase "+(i+1)+": "+vQtVogais[i]+" vogais");
	}//-------------------------------------------

	private static void escolhaFrasesParaContarVogais() {
		System.out.println("Escolha 3 frases para contagem de vogais");
		for(int i = 0; i<3;i++) {
			int indice = escolhaUmaFrase()-1;
			vQtVogais[indice]=contaVogais(vFrase[indice]);
			vIndFrasesEscolhidas[i]=indice;
			System.out.println("   Qtde de vogais: "+vQtVogais[indice]);
		}
	}//-------------------------------------------

	private static int escolhaUmaFrase() {
		System.out.print("Escolha a frase: ");
		return digitaNumero();
	}//-------------------------------------------

	private static int contaVogais(String frase) {
		int count = 0;
		for(int i = 0; i<frase.length(); i++) {
			char c = frase.toLowerCase().charAt(i);
			if(c == 'a' || c == 'e' || c == 'i'|| c == 'o'|| c == 'u')
				count++;
		}
			
		return count;
	}//-------------------------------------------

	private static int digitaNumero() { //falta criar verificacao de digitacao
		return new Scanner(System.in).nextInt();
	}//-------------------------------------------

	private static void mostraFrases() {
		System.out.println("Impressao de frases:");
		for(int i = 0; i<vFrase.length; i++)
			System.out.println((i+1)+": "+vFrase[i]);
	}// ---------------------------------------

	private static void preencheFrasesDoUsuario() {
		for(int i = 0; i<vFrase.length; i++)  
			vFrase[i] = digitaFrase(i);
	}// ---------------------------------------
	
	private static void preencheFrasesAuto() {
		vFrase[0] = "Curso de ADS";
		vFrase[1] = "Analise e Desenvolvimento de Sistemas";
		vFrase[2] = "Faculdade Senac";
		vFrase[3] = "Rodrigo de Avila Palermo";
		vFrase[4] = "Professor Ivonei";
		vFrase[5] = "Porto Alegre - RS";
	}// ---------------------------------------

	private static String digitaFrase(int indice) {
		System.out.print("Digite a frase ["+(indice+1)+"]: ");
		int tamanho = 0;
		
	    String frase = new Scanner(System.in).nextLine();
	    tamanho = frase.length();
		if(tamanho > 3 && tamanho < 50)
			return frase;
		System.out.println("ERRO. Tamanho minimo 3 e maximo 50 caracteres");
	    return digitaFrase(indice);
	}// ---------------------------------------

}//fim da classe
