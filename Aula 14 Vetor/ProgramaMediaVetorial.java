package prjAula14;

import java.util.Scanner;

public class ProgramaMediaVetorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, soma=0, media=0;
		final int TAM=10;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do vetor A:");
			a[i] = ler.nextInt();
			soma = soma + a[i];
			media = (soma/(TAM-1));
		}
		System.out.println("A média dos valores dentro do vetor A é: "+media);
		ler.close();
	}

}
