package prjAula15;

import java.util.Scanner;

public class ProgramaVetorPrimo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, divisor=0, j;
		final int TAM = 10;
		a= new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
			for (j=2; j<=a[i]; j++) {
				if (a[i]%j==0) {
					divisor++;
				}
			}
			if (divisor==2) {
				System.out.println("é um número primo");
				System.out.println(" ");
			}
			else{
				System.out.println("não é um número primo");
				System.out.println(" ");
			}
		}
	}
}
