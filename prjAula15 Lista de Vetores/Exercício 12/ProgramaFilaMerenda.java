package prjAula15;

import java.util.Scanner;

public class ProgramaFilaMerenda {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[], i, j, senha;
		boolean achouSenha=false;
		boolean senhaRepetida=false;
		final int TAM=10;
		a= new int [TAM];
		
		System.out.print("Senhas: [ ");		
		for (i=0; i<TAM; i++) {
			a[i] = (int)(Math.random()*100);
			do {
				for (j=0; j<i; j++) {
					if (a[i]==a[j]){
						senhaRepetida=true;
					}
				}
			} while (senhaRepetida);
			System.out.print(a[i]+" ");
		}
		System.out.print("].");
		System.out.println(" ");
		
		System.out.println("Digite sua senha:");
		senha = ler.nextInt();
		for (i=0; i<TAM; i++) {
			if (senha==a[i]) {
				achouSenha=true;
			}
		}
		
		if(achouSenha) {
			System.out.println("Sua senha é válida.");
		}
		else {
			System.out.println("Sua senha não é válida.");
		}
	}

}
