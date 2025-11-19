package prjAula15;

import java.util.Scanner;

public class ProgramaIntersecao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i, j, k=0;
		final int TAM=10;
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(1+i)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(1+i)+"° valor do vetor B:");
			b[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					c[k] = a[i];
					k++;
				}
			}
		}
		
		System.out.print("Vetor C: [ ");
		for (i=0; i<k; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("].");
	}

}
