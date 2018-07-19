import java.util.Scanner;

public class Exercicio01NumeraisReescrito {

	static int numerosForaDoIntervalo[] = new int [5];
	static int indice=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do{
			int num = digitaNumero();
			if(num==0)
				break;
			calculaSoma(num);
			calculaMultiplicacao(num);
		}while(true);
		
		System.out.println("Fim do programa");


	}///////////////////////////////// end of main
	
	
	private static int digitaNumero() {
		System.out.println("Digite numero entre 1000 e 9999");
		int num = new Scanner(System.in).nextInt();
		if(num == 0)
			return 0;
		if(num >= 1000 && num <=9999)
			return num;
		else {
			if(indice==numerosForaDoIntervalo.length) indice = 0;
			guardaNumeros(num);
			indice++;
			return digitaNumero();
		}
				
	}/////////////////////////////////

	private static void calculaSoma(int num) {
		int a = num/1000;
		int b = num%10;
		System.out.println("Soma: "+(a+b));
	}/////////////////////////////////
	
	private static void calculaMultiplicacao(int num) {
		int a = (num%1000)/100;
		int b = (num%1000%100/10);
		System.out.println("Multiplicacao: "+a*b);
	}/////////////////////////////////
	
	private static void guardaNumeros(int num) {
		numerosForaDoIntervalo[indice]=num;
		mostraArray(numerosForaDoIntervalo);
	}/////////////////////////////////
	
	private static void mostraArray(int array[]) {
		for(int k=0;k<array.length;k++) {
			if(array[k] != 0)
				System.out.println(k + ": " + array[k]);
		}
	}/////////////////////////////////
	
}// end of class
