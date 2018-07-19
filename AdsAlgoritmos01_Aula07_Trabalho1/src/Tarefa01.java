import java.util.Scanner;

/*
 * Tarefa01
Faça um algoritmo que receba um valor e mostre quantas notas são necessárias para 
completar este valor (considerar notas de 100, 50, 20,10).

Exemplo:
Digite um valor:  340
Qt de notas de 100: 3 e faltam 40 Reais
Qt de notas de  50: 6  e faltam 40 Reais
Qt de notas de  20: 17 
Qt de notas de  10: 34

Critérios:
Aceitar somente valores acima de zero.
Se valor não puder ser pago, mostrar a mensagem: “Valor muito baixo.”
 */
public class Tarefa01 {
	
	static int menorNota = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = lerNumero("Digite um valor: ");
		calculaNotas(numero, 100);
		calculaNotas(numero, 50);
		calculaNotas(numero, 20);
		calculaNotas(numero, menorNota);

	}

	private static void calculaNotas(int numero, int valorNota) {
			int notas = numero/valorNota;
			int resto = 0;
			resto = numero - notas*valorNota;
			System.out.print("Qt de notas de " + valorNota + ": " + notas);
			
			if( resto > 0 && numero > valorNota) {
				System.out.println(" e faltam " + resto + " Reais");
			}
			else System.out.println("");
		
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
