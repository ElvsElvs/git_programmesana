package test;

///3. uzdevums

//Sastādīt programmu, kas izveido un aizpilda ar nejaušiem skaitļiem, un izdrukā ekrānā divdimensiju masīvu A[7][7].
//Aizpildītajā masīvā sakārtot trešās un piektās kolonas elementus augošā secībā un izdrukāt pārveidoto masīvu ekrānā.




public class Masivi0611temasizpratne13 {
	static void AizpildaMasivu(int [][] A) {
		for(int i=0; i<7; i++)
		for(int j=0; j<7; j++) 
			A[i][j]=(int)(Math.random()*10);
		
	}
	static void IzdrukaMasivu(int [][] A) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) System.out.print(A[i][j]+" ");
			System.out.println();
	}
	
	System.out.println();
}
	static void SakartoKolonnu(int [][] A, int kolonna) {
		for(int k=0; k<6; k++)
			for(int i=0; i<6-k; i++)
				if(A[i][kolonna]>A[i+1][kolonna]) {
					int pag = A[i][kolonna];
					A[i][kolonna] = A[i+1][kolonna];
							A[i+1][kolonna] = pag;
				}
		
		
	}
	
	
	public static void main(String[] args) {
	int [][] A = new int [7][7];
	AizpildaMasivu(A);
	IzdrukaMasivu(A);
	SakartoKolonnu(A,2);
	SakartoKolonnu(A,4);
	for (int kolonna=0; kolonna<7; kolonna++) SakartoKolonnu(A,kolonna);
	IzdrukaMasivu(A);
	
	
	}

}
