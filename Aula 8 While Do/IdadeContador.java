package prjAula1108;

import java.util.Scanner;

public class IdadeContador {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i=1, idade, maior=0, menor=0;
		
		while(i<6){
			System.out.println("Digite a idade:");
			idade = ler.nextInt();
			if (idade>17) {
				maior++;
			}
			else {
				menor++;
			}
			i++;
		}
		System.out.println(maior+" são maiores de idade e "+menor+" são menores de idade.");
	}

}
