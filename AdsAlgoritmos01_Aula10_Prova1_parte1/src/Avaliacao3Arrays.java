import java.util.Scanner;

public class Avaliacao3Arrays {
	
	static int v1[] = new int[5];
	static int v2[] = new int[6];
	static int v3[] = new int[8];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -1;
		
		inicializaVetor(v1);
		inicializaVetor(v2);
		inicializaVetor(v3);
		
		while(num != 0) {
			num = digitaNumero("Digite um numero interio positio, ou [0] para sair.");
			if(num%2 == 0 || (num > 10 && num <= 100))
				insereNumeroEmVetor(num,"Inserindo em v1",v1);
			if(num%2 != 0 || (num > 50 && num <= 150))
				insereNumeroEmVetor(num,"Inserindo em v2",v2);
			if((num > 0 && num < 10) || (num > 40 && num <= 120))
				insereNumeroEmVetor(num,"Inserindo em v3",v3);
		}
		
		System.out.println("Fim do programa");
		
		

	}


	private static void insereNumeroEmVetor(int num, String mensagem, int[] vetor) {
		
		for(int i =0; i<vetor.length; i++)
			if(vetor[i] == -1) {
				vetor[i] = num;
				break;
			}
		mostraVetor(mensagem,vetor);
		if(vetor[vetor.length-1] != -1)
			inicializaVetor(vetor);
	
	}//------------------------------------------


	private static void mostraVetor(String mensagem, int[] vetor) {
		System.out.print(mensagem+": {");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);
			if(i != vetor.length -1)
				System.out.print("; ");
		}
		System.out.println("}");
			
		
	}//------------------------------------------


	private static void inicializaVetor(int[] vetor) {
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = -1;
		
	}//------------------------------------------


	private static int digitaNumero(String mensagem) {
		int num = 0;
		boolean numValido = false;
		System.out.println(mensagem);
		while(!numValido || num < 0) {
			try {
				num = new Scanner(System.in).nextInt();
			    numValido = true;
			    }
			catch(Exception e){
				System.out.println("Conteudo invalido. Digite novamente.");
				numValido = false;
				}
			if(num < 0) {
				System.out.println("Erro: Numero negativo. Digite novamente.");
				numValido = false;
			}
			}
		return num;
				
	}//------------------------------------------

}
