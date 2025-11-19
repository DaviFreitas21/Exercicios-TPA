package prjAula15;

import java.util.Scanner;

public class ProgramaPalindromo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, j, igual=0;
		final int TAM=3;
		a= new int [TAM];
		j = TAM-1;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° Valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			if (a[i] == a[j]) {
				igual++;
				j--;
			}
		}
		
		if (igual==TAM) {
			System.out.println("Seu vetor é um palíndromo.");
		}
		else {
			System.out.println("Seu vetor não é um palíndromo.");
		}
	}

}
