package prjAula14;

import java.util.Scanner;

public class ProgramaVetorQuadrado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i;
		final int TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			b[i] = a[i]*a[i];
		}
		System.out.println("O quadrado dos elementos do vetor A são: ");
		for (i=0; i<TAM; i++) {
				System.out.print(b[i]+" ");	
		}
		ler.close();
	}

}
