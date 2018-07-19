/*
 * 11.	Escrever um algoritmo para ler uma temperatura em Fahrenheit e 
 * apresentá-la convertida em graus Centígrados.
 * Fórmula:	Centígrados = ((Fahrenheit – 32) x 5)/9
 */
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tempF, tempC;
		
		System.out.print("Conversor de temperaturas. Digite a temperatura em graus Fahrenheit: ");
		tempF = new Scanner(System.in).nextFloat();
		
		tempC = ((tempF - 32f)*5f)/9f;
		
		System.out.println("Temperatura em graus Celsius: "+tempC);

	}

}
