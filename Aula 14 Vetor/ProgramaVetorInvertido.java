package prjAula14;

import java.util.Scanner;

public class ProgramaVetorInvertido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i, j;
		final int TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		j = TAM-1;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
			b[j] = a[i];
			j--;
		}
		
		System.out.print("Vetor A invertido: [");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("].");
		ler.close();
	}

}
