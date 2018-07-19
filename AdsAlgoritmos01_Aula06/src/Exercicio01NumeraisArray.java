import java.util.Scanner;

	/*
	 * Modificacao do Exercicio 01 - aula anterior (Aula 05)
	 * Utilizar Array para guardar ultimos 5 numeros digitados fora do intervalo 
	 */

	/*
	 * ALTERAR: 
	 * 1- Metodo para ler numero e devolver se estiver no inervalo - com do while (com IF dentro, repetindo a CONDICAO de TESTE)
	 * 1-1 - RECURSAO: Pode ser tirado o DO WHILE, retornndo o numero se estiver no intervalo certo. E Retornar o proprio metodo se o valor for falso.
	 * 2- Metodo para parte de soma
	 * 3- metodo para parte de multiplicacao
	 * 4- Nos metodos, usar somente difivao e mod, e somente 2 varives A e B para cada
	 */

	public class Exercicio01NumeraisArray {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num, div_inteira, pri, seg, ter, qua, resto_centena, resto_dezena, resto_unidade;
			int numerosForaDoIntervalo[] = new int [5];
			int i = 0;
			do {
				System.out.println("Digite numero entre 1000 e 9999. Digite [0] para sair.");
				num = new Scanner(System.in).nextInt();
				if(!(num < 1000 || num > 9999)) {
					pri = num/1000;                         //Por ser inteiro, o "pri" pega somente a parte inteira da divisao
					resto_centena = num-pri*1000;
					seg = resto_centena/100;
					resto_dezena = resto_centena-seg*100;
					ter = resto_dezena/10;
					qua = resto_dezena-ter*10;
					System.out.println("1o: "+pri);
					System.out.println("2o: "+seg);
					System.out.println("3o: "+ter);
					System.out.println("4o: "+qua);
					//System.out.println(resto_centena);
					//System.out.println(resto_dezena);
					System.out.println("Soma 1o e 4o: "+(pri+qua));
					System.out.println("Multiplica 2o e 3o: "+(seg*ter));
				}
				else if(num != 0){	
					System.out.println("Numero fora do intervalo");
					numerosForaDoIntervalo[i]=num;
					if(i<4)
						i++;
					else i=0; //Reinicia a pilha na posicao 0
				}
			}while(num != 0);
			
			System.out.println("Ultimos numeros fora do intervalo:");
			for(int k=0;k<numerosForaDoIntervalo.length;k++)
				if(numerosForaDoIntervalo[k]!=0)
					System.out.println(numerosForaDoIntervalo[k]);
			System.out.println("Fim do programa");

		}// end of main

	}// end of Class

