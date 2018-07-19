/*
 * 12.	Maria quer saber quantos litros de gasolina precisa colocar em seu carro e 
 * quanto vai gastar para fazer uma viagem até a casa de sua irmã.
	Dados extras:
	-	Distância da casa de Maria até sua irmã : 520 km
	-	Seu carro consome 12 Km/litro de combustível.
	-	Ela abastece sempre no mesmo posto, onde o preço da gasolina é R$ 2,50 o litro.
 *
 * Desenvolva um algoritmo onde o usuário digite a distância, o consumo e o valor do litro 
 * de combustível, com estes dados o algoritmo deverá calcular a quantidade de litros de 
 * combustível para a viagem e o custo da viagem.
 *
 */
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		float distancia, consumo, preco, litros, custoTotal;
		
		System.out.println("Calculadora de viagem: quantidade de combustivel e custo da viagem");
		System.out.println("Digite as informacoes solicitadas");
		System.out.print("Distancia (Km): ");
		distancia = new Scanner(System.in).nextFloat();
		System.out.print("Consumo de combustível  - distancia por litro (Km/L): ");
		consumo = new Scanner(System.in).nextFloat();
		System.out.print("Preco do litro de combustível (R$/L): ");
		preco = new Scanner(System.in).nextFloat();
		
		litros = distancia/consumo;
		custoTotal = litros*preco;
		
		System.out.println("Resultado \n Quantidade de gasolina (L):"+litros);
		System.out.println(" Custo total (R$): "+custoTotal);
		
		

	}// end of method main

}//end of Class
