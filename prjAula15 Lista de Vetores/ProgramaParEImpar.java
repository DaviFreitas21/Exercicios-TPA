package prjAula15;

import java.util.Scanner;

public class ProgramaParEImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i, indicePar=0, qtdPar=0;
		final int TAM=20;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			if (a[i] % 2 == 0) {
				b[indicePar] = a[i];
				indicePar++;
				qtdPar++;
			}
		}
		
		int indiceImpar=qtdPar, qtdImpar=0;
		for (i=0; i<TAM; i++) {
			if (a[i] % 2 !=0) {
				b[indiceImpar] = a[i];
				indiceImpar++;
				qtdImpar++;
			}
		}
		
		System.out.print("Vetor B: [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");	
		}
		System.out.print("]");
		ler.close();
	}
}
