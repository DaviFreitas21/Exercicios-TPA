package prjAula15;

import java.util.Scanner;

public class ProgramaRotinaDeBusca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], n=0,nExiste=0, i, j;
		final int TAM=10;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Digite o número que você quer encontrar.");
		n = ler.nextInt();
		
		for (i=0; i<TAM; i++) {
			if (a[i]==n) {
				nExiste=1;
			}
		}
		if (nExiste==1) {
			System.out.println("Esse número existe no vetor A.");
		}
		else {
			System.out.println("Esse número não existe no vetor A.");
		}			
	}

}
