package prjAula15;

import java.util.Scanner;

public class ProgramaRegrasParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int a[], b[], i;
		final int TAM=10;
		a= new int [TAM];
		b= new int [TAM]; 
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(1+i)+"° valor do Vetor A:");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			if (a[i]%2==0) {
				b[i]= 1;
			}
			else {
				b[i] = 0;
			}
		}
		
		System.out.print("Vetor B: [ ");
		for (i=0; i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("].");
	}

}
