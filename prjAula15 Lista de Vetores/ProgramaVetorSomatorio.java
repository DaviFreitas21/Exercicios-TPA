package prjAula15;

import java.util.Scanner;

public class ProgramaVetorSomatorio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], i, j, soma;
		final int TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();	
		}
		for (i=0; i<TAM; i++) {
			soma = 0;
			for (j=i; j<TAM; j++) {
			soma += a[j];	
			}
			b[i] = soma;				
		}
		System.out.print("Vetor B: [ ");
		for (i=0;i<TAM; i++) {
		System.out.print(b[i]+" ");			
		}
		System.out.println("].");
	}

}
