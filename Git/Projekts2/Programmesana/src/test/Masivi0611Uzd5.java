package test;

//Sastādīt programmu, kas sakārto masīva A[10], kas aizpildīts ar nejaušiem skaitļiem, 
//elementu vērtības augošā secībā, izmantojot Burbuļa kārtošanas algoritmu.



public class Masivi0611Uzd5 {
	public static void main(String[] args) {
	int[] A = new int[10];
	int i, k, pag;
	for (i=0; i<10; i++) {
		A[i] = (int) (Math.random()*90+10);
		System.out.print(A[i]+ " ");
		
	}
	
	//burbulis
	for (k=0; k<9; k++) {
	for (i=0; i<9-k; i++) {
		if(A[i]>A[i+1]) {
			pag=A[i]; A[i]=A[i+1]; A[i+1]=pag;
		}
	}
	}
	// 
	
	System.out.println();
	for (i=0; i<10; i++) System.out.print(A[i]+ " ");
}
}
