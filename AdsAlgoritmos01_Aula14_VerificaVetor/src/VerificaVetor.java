import java.util.Scanner;

public class VerificaVetor {
	
	static int v[] = new int[10];

	public static void main(String[] args) {
		inicializaVetor();
		mostraVetor();
		while(true)
			atribuiValor();

	}// end of main

	private static void atribuiValor() {
		int ind = digitaIndice("Digite um indice (0 a 9): ");
		int num = digitaInteiro("Digite um valor inteiro para gravar nesta posicao: ");
		gravaVetor(ind,num);
		mostraVetor();
	}//----------------------------------

	private static void mostraVetor() {
		String vetor = "\nVetor v = [", indices = "\n(indices) ";
		int tamanho = 0;
		for(int i = 0; i<v.length; i++) {
			vetor += v[i];
			tamanho = String.valueOf(v[i]).length();
			indices+= String.format("(%"+(tamanho)+"s)", i);
			
			if(i < v.length-1)
				vetor += "; ";
		}
		vetor += "]\n";
		System.out.print(indices);
		System.out.println(String.format("%s", vetor));
		
	}//----------------------------------

	private static void gravaVetor(int ind, int num) {
		int indDisp = procuraIndiceDisponivel(ind);
		v[indDisp] = num;
		
	}//----------------------------------

	private static int procuraIndiceDisponivel(int ind) {
		for(int i = ind; i<v.length; i++) //procura de ind até fim
			if(v[i] == -1)
				return i;
		/*for(int i = 0; i<ind; i++) //procura de 0 ate ind
			if(v[i] == -1)
				return i;*/
		for(int i = ind; i>=0; i--) //procura de ind ate 0
			if(v[i] == -1)
				return i;
		inicializaVetor(); //se completo, inicializa vetor
		return ind; //retorna o mesmo ind qua agora esta disponivel
	}//----------------------------------

	private static int digitaInteiro(String msg) {
		try{
			int num = Integer.parseInt(teclado(msg));
			return num;
		}catch(Exception e) {
			System.out.println("Entrada invalida! Deve ser numero");
		}
		return digitaInteiro(msg);
	}//----------------------------------

	private static int digitaIndice(String msg) {
		try{
			int ind = Integer.parseInt(teclado(msg));
			if(ind < 0 || ind > 9)
				System.out.println("Indice fora do intervalo.");
			else return ind;
		}catch(Exception e) {
			System.out.println("Entrada invalida! Deve ser numero positivo");
		}
		return digitaIndice(msg);
	}//----------------------------------

	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
		
	}//----------------------------------

	private static void inicializaVetor() {
		for(int i=0; i<v.length;i++)
			v[i]=-1;
		
	}//----------------------------------

}// end of class
