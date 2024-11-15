package test;


//Sastādīt programmu, kas nosaka vai masīvs A[N], kas aizpildīts ar nejaušiem skaitļiem intervālā [10;99], satur vērtību 50. 


import java.util.Scanner;

public class Masivi3010Uzd5 {

	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		System.out.print("Masīva elementu skaits:");
		int n = dati.nextInt();
		dati.close();
		
		// Izveido masīvu
		int [] A = new int [n];
		int i;
		int min, index, max;
		for(i=0; i<n; i++) {
		A[i]= (int) (Math.random()*90)+10; //[10;99]
		System.out.print(A[i]+ " ");
		
	}
	
	//Meklē vērtību 50
	
	boolean ir=false;
	for(i=0; i<n; i++){
		if(A[i]==50){
			ir=true;
			System.out.print("\nMasīva "+(i+1)+". elements ir 50");
		}
	}
	if(ir==false) System.out.println("\nMasīvā nav vērtības 50");
	
	
	//meklē min
	 min=A[0]; index=0;
	for(i=1; i<5; i++){
		if(A[i]<min) {min=A[i]; index=i;}
	}
	System.out.print("\nMasīva "+(index+1)+". elements satur mazāko vērtību " + min); 

	//meklē max
		 max=A[0]; index=0;
		for(i=1; i<5; i++){
			if(A[i]>max) {max=A[i]; index=i;}
		}
		System.out.print("\nMasīva "+(index+1)+". elements satur lielāko vērtību " + max); 



		
		
		
		
		
		
	}
	}


