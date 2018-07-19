import java.util.Scanner;

public class Controle {
	
	static int vCod[] = new int[10];
	static int vQt[] = new int[10];
	static int vCodLojas[] = {1,3,5,7};
	static String vLojas[] = {"Matriz", "Filial 1", "Filial 2", "Filial 3"};
	static int vProdutos[] = {10,20,30,40,42,44,50,70};
	static int larguraMenu = 40;

	public static void main(String[] args) {
		mostraControle();
		System.out.println("\nPrograma Finalizado");

	}//end of main
	
	private static void cadastraProduto() {
		if(!cadastroCompleto()) {
			mostraLojas();
			mostraProdutos();
			String codigo = verificaCodigo("  Digite o codigo conforme Loja e Produto [ENTER para retornar]: ");
			if(codigo.isEmpty())
				return;
			int posicao = posicaoDisponivel();
			vCod[posicao] = Integer.parseInt(codigo);
			vQt[posicao] = verificaQuantidade("  Digite a quantidade: ");
			
		}
		else System.out.println("Impossivel cadastrar. Cadastro de produtos ja esta completo");
		
		
	}//-----------------------------------
	

	private static int verificaQuantidade(String mens) {
		System.out.println(mens);
		try {
			int qt = Integer.parseInt(teclado(""));
			if(qt<0)
				System.out.println("Qtd negativa invalida!");
			else return qt;
			}catch (Exception e) {
				System.out.println("Qtd contem caracteres invalidos!");
		}
		return verificaQuantidade(mens);
	}//-----------------------------------

	private static String verificaCodigo(String mens) {
		System.out.println(mens);
		String codigo = teclado("");
		if(codigo.isEmpty())
			return codigo;
		try {
			int codigoInt = Integer.parseInt(codigo);
			if(codigo.length()<0 || codigo.length()>3)
				System.out.println("Codigo deve conter 3 digitos!");
			else{
				if(!existeLoja(Integer.parseInt(codigo.substring(0,1))))
					System.out.println("Codigo da Loja incorreto!");
				else if(!existeProduto(Integer.parseInt(codigo.substring(1,3))))
					System.out.println("Codigo de Produto incorreto!");
				else return codigo;
			}			
		}catch (Exception e) {
			System.out.println("Codigo contem caracteres invalidos!");
		}
		return verificaCodigo(mens);
	}//-----------------------------------

	private static boolean existeProduto(int produto) {
		for(int i = 0; i<vProdutos.length; i++)
			if(produto == vProdutos[i])
				return true;
		return false;
	}//-----------------------------------

	private static boolean existeLoja(int loja) {
		for(int i = 0; i<vLojas.length; i++)
			if(loja == vCodLojas[i])
				return true;
		return false;
	}//-----------------------------------

	private static int posicaoDisponivel() {
		int posicao = 0;
		for(int i =0; i<vCod.length; i++)
			if(vCod[i] == 0)
				return i;
			else posicao++;
		return posicao;
	}//-----------------------------------

	private static boolean cadastroCompleto() {
		if(vCod[vCod.length-1] != 0)
				return true;
		return false;
	}//-----------------------------------

	private static void mostraProdutos() {
		String lista = "Codigos dos Produtos: ";
		for(int i = 0; i<vProdutos.length; i++) {
			lista += String.format("%1$s", vProdutos[i]);
			if(i < vProdutos.length-1)
				lista += "; ";
		}
		System.out.println(lista);
		
	}//-----------------------------------

	private static void mostraLojas() {
		String lista = "\nLojas: ";
		for(int i = 0; i<vLojas.length; i++) {
			lista += String.format("%1$s - %2$s",vCodLojas[i], vLojas[i]);
			if(i < vLojas.length-1)
				lista += "; ";
		}
		System.out.println(lista);
		
	}//-----------------------------------

	private static void listaProdutos() {
		if(!listaProdutosVazia()) {
			String lista =  "\nLista de Produtos";
		       lista += "\n-----------------";
		       lista += "\nPRODUTO QUANTIDADE\n";
		       for(int i = 0; i<vCod.length; i++)
		    	   if(vCod[i] != 0) {
		    		   lista += String.format("%1$-7s %2$s",vCod[i], vQt[i]);
		    		   if(i < vLojas.length-1)
		    			   lista += "\n";
		    		   }
		       System.out.println(lista);
		}
		else
			System.out.println("\nLista vazia. Cadastre pelo menos um codigo de produto.\n");
		
	}//-----------------------------------

	private static boolean listaProdutosVazia() {
		for(int i = 0; i<vCod.length; i++)
			if(vCod[i] != 0)
				return false;
		return true;
	}

	private static void listaPorLoja() {
		if(!listaProdutosVazia()) {
		
			String loja = verificaLoja("Digite o codigo da Loja [ENTER para retornar]: ");
			if(loja.isEmpty())
				return;
			String lista =  "\nLista de Produtos da Loja " + loja + ":\n";
			for(int i = 0; i<vCod.length; i++)
				if(String.valueOf(vCod[i]).subSequence(0, 1).equals(loja))
					lista += String.format("%s",vCod[i]) + "\n";
			System.out.println(lista);
			}
		else
			System.out.println("\nLista vazia. Cadastre pelo menos um codigo de produto.\n");
		
	}//-----------------------------------

	private static String verificaLoja(String mens) {
		System.out.println(mens);
		String loja = teclado("");
		if(loja.isEmpty())
			return loja;
		try {
			int lojaInt = Integer.parseInt(loja);
			if(!existeLoja(Integer.parseInt(loja)))
				System.out.println("Loja inexistente!");
			else return loja;
			}catch (Exception e) {
				System.out.println("Codigo contem caracteres invalidos!");
				}
		return verificaLoja(mens);
	}


	private static void mostraControle() {
		String menu = formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("MENU","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("1- Cadastrar o Produto","|");
		menu += formataEspacamento("2- Listar todos os Produtos","|");
		menu += formataEspacamento("3- Listar por Loja","|");
		menu += formataEspacamento("4 ou ENTER - Sair do Programa","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		System.out.println(menu);
		
		String escolha = teclado("  Escolha uma opcao: ");
		if(escolha.isEmpty()) return;
		switch(escolha.charAt(0)) {
		case '4': return;
		case '1': cadastraProduto(); break;
		case '2': listaProdutos(); break;
		case '3': listaPorLoja(); break;
		default: System.out.println("\nOpcao invalida. Tente novamente\n"); break;		
		}
		
		mostraControle();
	}//-----------------------------------
	
	private static String formataEspacamento(String string, String borda) {
		return string = String.format(borda+"%-"+larguraMenu+"s"+borda,string)+"\n";
	}//-----------------------------------

	private static String divisorHorizontal(String caractere) {
		String divisor = "";
		for(int i = 0; i < larguraMenu; i++)
			divisor +=caractere;
		return divisor;
	}//-----------------------------------

	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//-----------------------------------

}//end of class
