package prjAula15;

import java.util.Scanner;

public class ProgramaRelacaoPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[],i,j;
		final int TAM=10;
		a= new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
	
		System.out.println("Relação dos pares até o valor de cada índice:");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+": ");
			for (j=0;j<a[i];j+=2) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}
