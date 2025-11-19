package prjAula15;

public class ProgramaFatorial {

	public static void main(String[] args) {
		int a[], b[], i, j;
		final int TAM=15;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			a[i]=i;
			int fat=1;
			for (j=1;j<=a[i];j++) {
				fat*=j;
			}
			b[i]=fat;
		}
		
		System.out.print("Vetor B: [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("].");
	}

}
