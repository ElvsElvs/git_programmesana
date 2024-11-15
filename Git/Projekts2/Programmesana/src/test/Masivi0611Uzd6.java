package test;

//Sastādīt programmu, kas izveido masīvu A[5][7] un aizpilda tā vērtības ar nejaušiem skaitļiem intervālā [0;100]. 
//Pārskatāmā veidā izdrukāt masīva elementu vērtības ekrānā




public class Masivi0611Uzd6 {
	public static void main(String[] args) {
	int[][] A = new int[5][7];
	int i, j; 
	for (i=0; i<5; i++) {
		for (j=0; j<7; j++){
		A[i] [j] = (int) (Math.random()*101);
		System.out.print(A[i][j]+ "\t");
		
	}
	
	
	System.out.println();
}
}
}
