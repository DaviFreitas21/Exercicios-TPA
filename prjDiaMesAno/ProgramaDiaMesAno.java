package prjDiaMesAno;

import java.util.Scanner;

public class ProgramaDiaMesAno {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int dia, mes, ano, i=0;
	
	while (i!=1) {
		System.out.println("Digite o dia:");
		dia = ler.nextInt();
		System.out.println("Digite o mês:");
		mes = ler.nextInt();
		System.out.println("Digite o ano:");
		ano = ler.nextInt();
		
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dia++;
			if (dia>31) {
				mes++;
				dia=1;
				if (mes>12) {
					ano++;
					mes=1;
				}
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dia++;
			if (dia>30) {
				mes++;
				dia=1;
			}
			break;
		case 2:
			dia++;
			if (ano%400==0) {
				if (dia>29) {
					mes++;
					dia=1;
				}	
			}
			if (ano%100!=0) {
				if (ano%4==0) {
					if (dia>29) {
						mes++;
						dia=1;
					}
				}
			}
			else if(dia>28){
				mes++;
				dia=1;
			}
		}
		System.out.println("A data de amanhã será: "+dia+"/"+mes+"/"+ano+".");
		System.out.println("Deseja encerrar? Digite 1 se sim, ou qualquer outro número se não. ");
		i = ler.nextInt();
		if (i==1) {
			System.out.println("Programa encerrado.");
		}
	}
	ler.close();
	}
}