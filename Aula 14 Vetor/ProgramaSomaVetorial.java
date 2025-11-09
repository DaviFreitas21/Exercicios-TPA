package prjAula14;

import java.util.Scanner;

public class ProgramaSomaVetorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM=10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor B:");
			b[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println("A soma dos vetores A e B é");
		System.out.print("C: ");
		for (i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		ler.close();
	}

}
