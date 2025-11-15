package prjAula15;

public class ProgramaPotenciacao {

	public static void main(String[] args) {
		int a[], i;
		final int TAM=11;
		a = new int [TAM];
		
			System.out.print("Vetor A: [ ");		
		for (i=0; i<TAM; i++) {
			a[i]= 1<<i;
			System.out.print(a[i]+" ");
		}
		System.out.println("].");
	}

}
