package test;

// Sastādīt programmu, kas izveido, aizpilda un izdrukā ekrānā masīva A[N][N] element vērtības, 
// tā, ka zem galvenās diagonāles visas vērtības ir -1, uz galvenās diagonāles 0,
// bet virs galvenās diagonāles vērtības ir 1. (Mainīgā N vērtību ievada lietotājs). 




import java.util.Scanner; 

public class Masivi0611Uzd7 {
	public static void main(String[] args) {
		Scanner dati = new Scanner (System.in);
		System.out.print("Masīvu rindu/kolonu skaits: ");
		int n= dati.nextInt();
		dati.close();
	int[][] A = new int[n][n];
	int i, j; 
	for (i=0; i<n; i++) {
		for (j=0; j<n; j++){
			if (i>j) A[i][j] = -1;
			else if (i==j) {A[i][j]=0; System.out.print (" ");}
			else {A[i][j]=1; System.out.print (" ");}
		System.out.print(A[i][j]+ "\t");
		
	}
	
	
	System.out.println();
}
}
}
