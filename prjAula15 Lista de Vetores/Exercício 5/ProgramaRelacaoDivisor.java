package prjAula15;

import java.util.Scanner;

public class ProgramaRelacaoDivisor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, j;
		final int TAM=3;
		a= new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}

		System.out.println("Divisores de cada índice:");
		for (i=0;i<TAM;i++) {
			System.out.print(a[i]+": ");
			for (j=1; j<=a[i]; j++) {
				if (a[i]%j==0) {
				System.out.print(j+" ");				
				}
			}
			System.out.println("");
		}
	}

}
