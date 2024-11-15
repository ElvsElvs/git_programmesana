package test;

//Sastādīt programmu, kas atbilstoši lietotāja ievadītajam mēneša kārtas numuram izdrukā ekrānā mēneša nosaukumu.




import java.util.Scanner; 

public class Masivi0611Uzd8 {
	public static void main(String[] args) {
		Scanner dati = new Scanner (System.in);
		System.out.print("Masīvu rindu skaits: ");
		int r= dati.nextInt();
		System.out.print("Masīvu kolonnu skaits: ");
		int k= dati.nextInt();
		dati.close();
		
		
	int[][] A = new int[r][k];
	int i, j, sum=0; 
	for (i=0; i<r; i++) {
		for (j=0; j<k; j++){
			A[i][j] =(int) (Math.random()*10);
			sum+= A[i][j];
			System.out.print(A[i][j]+ "\t");
		
	}
	
	
	System.out.println();
}
	System.out.println("Visu elementu summa: "+sum );
	
	
	for (i=0; i<r; i++) {
		sum=0;
		for(j=0; j<k; j++) sum+=A[i][j];
		System.out.println((i+1)+". Rindas summa "+sum);
		}
		
		
		
		for (j=0; j<k; j++) {
			sum=0;
			for(i=0; i<k; i++) sum+=A[i][j];
			System.out.println((j+1)+". Kolonnas summa "+sum);
	}
	
	
}
}



