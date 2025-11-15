package prjAula15;

import java.util.Scanner;

public class ProgramaTabuadaVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[],r,multi,i;
		final int TAM=5;
		a = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° valor de A:");
			a[i]= ler.nextInt();
		}
		
		System.out.println("A tabuada de todos os índices escritos anteriormente:");
		for (i=0; i<TAM; i++) {
			for (multi=1; multi<11; multi++) {
				r= a[i] * multi;
				System.out.println(a[i]+" x "+multi+" = "+r);
			}
		}
	}

}
