package prjAula1108;

import java.util.Scanner;

public class ProgramaTabuada {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		int i=1, r, n;
		System.out.println("Digite o número para apresentar a tabuada:");
		n= in.nextInt();
		do {
			r = n*i;
			System.out.println(n+"x"+i+"="+r);
			i++;
		} while (i<=10);
		in.close();
	} 
}
