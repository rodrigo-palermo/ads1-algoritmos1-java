/*
 * 	Manipulando Array
	Crie um algoritmo que manipule os seguintes arrays: aNome[10] e aSalario[10]. 

	Utilizando o seguinte menu: 
 */

import java.util.Scanner;

public class Cadastro {
	
	static String[] aNome = new String[10];
	static double[] aSalario = new double[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char escolha = 'a';
		
	    while(escolha != '0') {
	    	escolha = escolhaMenu();
	    	switch(escolha) {
	    	case '9': cadastroTeste(); break;
	    	case '1': cadastra(); break;
	    	case '2': lista(); break;
	    	case '3': mostraSalarioDaPessoa(); break;
	    	case '4': pessoasSalarioAcimaMedia(); break;
	    	case '5': aumentoPercentualGeral(); break;
	    	case '6': aumentoPercentualSalarioAbaixoMedia(); break;
	    	default: break;
	    	}
	    }

	    
		
		

	}// fim  do main

	private static void aumentoPercentualSalarioAbaixoMedia() {
		if(!listaVazia()) {
			System.out.println("=== Aplicar percentual de aumento somente para salarios abaixo da media ===");
			double percentual = Double.parseDouble(teclado("Digite o percentual de aumento: "));
			percentual*=0.01;
			for(int i=0;i<procuraPosicao();i++) {
				if(aSalario[i]<mediaDeSalarios()) {
					aSalario[i]+=aSalario[i]*percentual;
				}
			}
		}         
		
	}//---------------------------------------

	private static void aumentoPercentualGeral() {
		
		if(!listaVazia()) {
			System.out.println("=== Aplicar percentual de aumento para todos ===");
			double percentual = Double.parseDouble(teclado("Digite o percentual de aumento: "));
			percentual*=0.01;
			for(int i = 0; i<procuraPosicao();i++)
				aSalario[i]+=aSalario[i]*percentual;
		}
		
	}//----------------------------------------

	private static boolean listaVazia() {
		if(procuraPosicao() == 0) {
			System.out.println("\nLista vazia. Cadastre pelo menos um funcionario.");
			return true;
		}
		return false;	
	}//----------------------------------------
	
	private static void pessoasSalarioAcimaMedia() {
		int contador = 0;
		System.out.println("\n=== Pessoas com salario acima da media ===");
		if(!listaVazia()) {
			for(int i=0;i<procuraPosicao();i++) {
				if(aSalario[i]>mediaDeSalarios()) {
					contador++;
					System.out.println(aNome[i]);
				}
			}
		if(contador == 0)
			System.out.println("***Nao existem pessoas nessas condicoes***");
		}
		
	}//----------------------------------------

	private static double mediaDeSalarios() {
		double soma = 0;
		int quantidade = 0;
		for(int i=0;i<procuraPosicao();i++) {
			quantidade++;
			soma+=aSalario[i];
		}
			
		return soma/quantidade;
	}//----------------------------------------

	private static void cadastroTeste() {
		aNome[0] = "asd";
		aSalario[0] = 100;
		aNome[1] = "qwe";
		aSalario[1] = 500;
		
	}//----------------------------------------

	private static void mostraSalarioDaPessoa() {
		if(!listaVazia()) {
			String nome = "0";
			do{
				System.out.println("\n=== Pesquisa Salario ===");
				System.out.println("Digite [fim] para finalizar");
				nome = teclado("Digite o nome da pessoa: ");
				if(procuraIndice(nome) == 999) 
					System.out.println("Nome inexistente no cadastro. Tente novamente");
				else 
					System.out.println("  Salario: R$ "+aSalario[procuraIndice(nome)]);
			}while(!nome.toLowerCase().equals("fim"));
				
				
		    }		
		
	}//--------------------------------



	private static int procuraIndice(String nome) {
		for(int i = 0; i<aNome.length-1; i++)
			if(aNome[i] != null)
				if(aNome[i].equals(nome))
				    return i;
		return 999;
	}//------------------------------------------
	   

	private static void lista() {
		if(!listaVazia()) {
			System.out.println("\n=== Listagem de Funcionarios e Salarios ===");
			for(int i = 0; i< procuraPosicao(); i++) {
				System.out.print((i+1)+"- Nome: "+aNome[i]);
				System.out.println("  Salario: R$ "+aSalario[i]);
			}
		}
		
		
	}//--------------------------------

	private static void cadastra() {
		System.out.println("\n=== Cadastro de funcionario ===");
		for(int i=procuraPosicao();i<aNome.length-1;i++) {
			
			System.out.println("Digite [fim] para finalizar");
			String nome = teclado("Digite o Nome: ");
			if(nome.toLowerCase().equals("fim"))
				break;
			aNome[i] = nome;
			aSalario[i] = Double.parseDouble(teclado("Digite o salario: "));
		}

	}//--------------------------------

	private static int procuraPosicao() {
		for(int i = 0; i<aNome.length-1; i++)
			if(aNome[i] == null)
				return i;
		return 0; //recomeca cadastro do inicio, apagando informacoes anteriores
	}

	private static char escolhaMenu() { 

	String menu = "\n"; 

	menu += "\n Menu"; 

	menu += "\n------------------------"; 

	menu += "\n0- Finaliza"; 

	menu += "\n1- Cadastra"; 

	menu += "\n2- Lista"; 

	menu += "\n3- Mostra o salario de uma pessoa"; 

	menu += "\n4- Mostra o nome das pessoas que ganham"; 

	menu += "\n  acima da media"; 

	menu += "\n5- Aplique um percentual de aumento a todos"; 

	menu += "\n6- Aplique um percentual de aumento somente"; 

	menu += "\n  para quem ganha abaixo da media."; 

	menu += "\n  Escolha: "; 

	return teclado(menu).charAt(0); 

	} 


	public static String teclado(String mensagem) { 

	System.out.print(mensagem); 

	return new Scanner(System.in).nextLine() ; 

	}

}// fim da classe
