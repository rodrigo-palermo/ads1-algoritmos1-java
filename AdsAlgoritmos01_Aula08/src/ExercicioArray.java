import java.util.Scanner;

/*
 * /*
 * Crie um array com 10 posições de números inteiros.
 * Para manipular este array utilize o seguinte menu:
 * 
 * Menu
 * ======================
 * 0- Mostrar o conteúdo do array
 * 1- Preencher o array
 * 2- Localizar um número no array e mostrar sua posição
 * 3- Mostrar o número de um determinado indice
 * 4- Mostrar a soma de todos os indices pares
 * 5- Mostrar a soma de todos os números pares do array
 * 6- Calcular a média do array
 * 7- Inverter os números do array
 * 8- Ler dois indices e trocar os valores entre si.
 * 9- Organizar os números (pares no inicio e impares no final)
 *    Escolha:
 * 
 */

public class ExercicioArray {
	 
	 static int array[] = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		while(true) {
			mostraMenu();
			int escolha = new Scanner(System.in).nextInt();
			if(escolha == 99) preencheArrayRandomico(array);
			if(escolha == 0) mostraArray(array);
			if(escolha == 1) preencheArray(array);
			if(escolha == 2) mostraIndiceDoValor(array);
			if(escolha == 3) mostraValorDoIndice(array);
			if(escolha == 4) mostraSomaIndicesPares(array);
			if(escolha == 5) mostraSomaValoresPares(array);
			if(escolha == 6) calculaMediaValores(array);
			if(escolha == 7) inverteOrdem(array);
			if(escolha == 8) inverteDoisValores();
			if(escolha == 9) organizaParImpar();
		}


	}

	//OPCAO DE SUPORTE 99 - inicializa array aleatoriamente
	private static void preencheArrayRandomico(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("|Indice: " + i + " |Valor: ");
			array[i] = (int) (Math.random()*100);
		}
		System.out.println("*** array preenchido randomicamente***");
		mostraArray(array);
		
	}//--------------------------------
	
    //OPCAO 0
	private static void mostraArray(int[] array) {
		System.out.println("======== ARRAY ========");
		for(int i = 0; i < array.length; i++) {
			System.out.println("|Indice: " + i + " |Valor: " + array[i]);
		}
		System.out.println("=======================\n");
	}//--------------------------------
	
	//OPCAO 1
	private static void preencheArray(int[] array) {
		System.out.println("Digite valores para o array:");
		for(int i = 0; i < array.length; i++) {
			System.out.print("|Indice: " + i + " |Valor: ");
			array[i] = digitaValor();
		}
		
	}//--------------------------------
	
	//OPCAO 2
	private static void mostraIndiceDoValor(int[] array) {
		System.out.println("Digite o valor procurado:");
		int qtdeIndices = 0;
		int valor = digitaValor();
		for(int i = 0; i < array.length; i++)
			if(array[i] == valor) {
				System.out.println("Indice: " + i);
				qtdeIndices++;
			}
		if(qtdeIndices == 0)
			System.out.println("Nao existe o valor procurado no array");
	}//--------------------------------
	
	//OPCAO 3
	private static void mostraValorDoIndice(int[] array) {
		System.out.println("Digite o indice [de 0 a " + (array.length-1) + "]: ");
		int indice = digitaValor();
		
		if(indice < 0 || indice > array.length)
			System.out.println("Nao existe o indice procurado no array");
		else
			System.out.println("Valor: " + array[indice]);
	}//--------------------------------
	
	//OPCAO 4
	private static void mostraSomaIndicesPares(int[] array) {
		int soma = 0;
		for(int i = 2; i < array.length; i+=2)
			soma += array[i];
		System.out.println("Soma: " + soma);
	}//--------------------------------
	
		
	//OPCAO 5
	private static void mostraSomaValoresPares(int[] array) {
		int soma = 0;
		for(int i = 0; i < array.length; i++)
			if(array[i]%2 == 0) {
				soma += array[i];
			}
		if(soma > 0)
			System.out.println("Soma: " + soma);
		else
			System.out.println("Nao existem valores pares no array");
	}//--------------------------------
		
	//OPCAO 6
	private static void calculaMediaValores(int[] array) {
		int soma = 0, media = 0;
		for(int i = 0; i < array.length; i++)
			soma += array[i];
		media = soma/array.length;
		System.out.println("Media: " + media);
	}//--------------------------------
	
	//OPCAO 7
	private static void inverteOrdem(int[] array) {
		int buffer[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			buffer[i] = array[array.length - 1 - i];
		}
		mostraArray(buffer);
	}
	
	//OPCAO 8
	private static void inverteDoisValores() {
		int indice01, indice02, valorBuffer;
		System.out.print("Digite o primeiro indice: ");
		indice01 = digitaValor();
		System.out.print("Digite o segundo indice: ");
		indice02 = digitaValor();
		valorBuffer = array[indice01];
		array[indice01] = array[indice02];
		array[indice02] = valorBuffer;
		mostraArray(array);
	}
	
	//OPCAO 9
    private static void organizaParImpar() {
		for(int i = 0;i<array.length-1;i++)
			if(array[i]%2 != 0) {
				for(int j=i;j<array.length-1;j++)
				    inverteDoisValores(j,j+1);
			}
				
		
	}
	
	private static void inverteDoisValores(int indice01, int indice02) {
		// TODO Auto-generated method stub
		int valorBuffer;
		valorBuffer = array[indice01];
		array[indice01] = array[indice02];
		array[indice02] = valorBuffer;
		
	}

	//DIGITA VALOR
	private static int digitaValor() {
		return new Scanner(System.in).nextInt();
	}//--------------------------------
	
	//MENU
	private static void mostraMenu() {
		System.out.println("========= MENU ========="
				 + "\n========================"
				 + "\n 0- Mostrar o conteúdo do array"
				 + "\n 1- Preencher o array"
				 + "\n 2- Localizar um número no array e mostrar sua posição"
				 + "\n 3- Mostrar o número de um determinado indice"
				 + "\n 4- Mostrar a soma de todos os indices pares"
				 + "\n 5- Mostrar a soma de todos os números pares do array"
				 + "\n 6- Calcular a média do array"
				 + "\n 7- Inverter os números do array"
				 + "\n 8- Ler dois indices e trocar os valores entre si."
				 + "\n 9- Organizar os números (pares no inicio e impares no final)"
				 + "\n    Escolha:");
		
	}//--------------------------------
	
	
	
	

}
