import java.util.Scanner;

public class APS3 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		boolean de = true;
		int le = 0;
		int ld = 1;
		int c = 20;
		String st = "";
		while (true) {
			if (de) {
				for (int i = le; i < ld; i++) {
					System.out.print(st + ".");
				}
				System.out.println();
				ld++;
			} else {
				if (st.length() < ld)
					st += " ";
				ld--;
				System.out.print(st);
				for (int i = le; i < ld; i++) {
					if(ld < 10) System.out.print("/");  //alteracao
					else System.out.print(".");         //alteracao 
				}
				System.out.println();
			}
			if (ld == c) {
				de = false;
			}
			if (ld == le) {
				de = true;
			}
			if (1 == ld) {
				break;
			}
		}
	}
}
