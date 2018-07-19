import java.util.Scanner;

public class Vets100 {
	
	static int vGeral[] = new int[5];
	static int vMenor[] = new int[5];
	static int vMaior[] = new int[5];
	static int indiceVGeral = 0;
	static int indiceVMenor = 0;
	static int indiceVMaior = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		preencheVetor(vGeral);

	}// fim do main

	private static int somaVetor(int[] vetor) {
		int soma = 0;
		for(int i=0;i<vetor.length;i++)
			soma += vetor[i];
		return soma;
	}//-----------------------------------------------------

	private static void preencheVetor(int[] vetor) {
		//int soma = 0;
		System.out.println(" === Preenchendo o vetor geral ===");
		//for(int i=0;i<vetor.length;i++)
		while(true){
			vetor[indiceVGeral]=digitaNumero("Digite um numero inteiro: ");
			int soma = somaVetor(vGeral);
			mostraVetor(" *** vGeral *** ",vGeral);
			System.out.println(" [SOMA de vGeral: "+soma+"]");
			if(soma<100) preencheVMenor(vetor[indiceVGeral]);
			else preencheVMaior(vetor[indiceVGeral]);
			indiceVGeral++;
			if(indiceVGeral == vetor.length) {
				indiceVGeral = 0;
				System.out.println(" === Reiniciando indice do vetor geral ===");
			}
		}
		
	}//-----------------------------------------------------

	private static void preencheVMaior(int num) {
		vMaior[indiceVMaior]=num;
		indiceVMaior--;
		if(indiceVMaior < 0) indiceVMaior = 4;
		mostraVetor(" +++ Copiando numero para vMaior +++ ",vMaior);
		
	}

	private static void preencheVMenor(int num) {
		vMenor[indiceVMenor]=num;
		indiceVMenor++;
		if(indiceVMenor == vMenor.length) indiceVMenor = 0;
		mostraVetor(" --- Copiando numero para vMenor ---",vMenor);
		
	}//-----------------------------------------------------

	private static void mostraVetor(String nome, int[] vetor) {
		System.out.println("Impressao de Vetor: "+nome);
		System.out.println("indice:valor");
		for(int i=0;i<vetor.length;i++)
			System.out.println("  ["+i+"] :"+vetor[i]);
		
	}//-----------------------------------------------------

	private static int digitaNumero(String mensagem) {
		System.out.print(mensagem);
		int num = 0;
		boolean numValido;
	    do {
	    	try {
				num = new Scanner(System.in).nextInt();
				numValido = true;
			}catch (Exception erro) {
				System.out.print("Entrada invalida! Digite novamente:");
				numValido = false;
			}
	    }while(!numValido);
			
		return num;
		
	}//-----------------------------------------------------

}//fim da classe
