package test;
//Sastādit programmu, kas izveido masīvu A[100], kurš aizpildīts ar skaitlļiem 100; 99; 98; .....1

public class Masivi3010Uzd3 {

	public static void main(String[] args) {
		int[] A = new int[5];
		A[0]=1;
		A[1]=2;
		A[2]=3;
		A[3]=4;
		A[4]=5;
		int [] B = {3,4,5,6,7};
		int [] C = new int [5];
		System.out.print("Masīvs A: \t");
		for(int i=0; i<5; i++) System.out.print(A[i]+ "\t");
		System.out.print("\nMasīvs B: \t");
		for (int elem : B) System.out.print(elem+ "\t");
		System.out.print("\nMasīvs C: \t");
		for(int i=0; i<5; i++) {
			C[i] = A[i] + B[i];
		
			System.out.print(C[i]+ "\t");
		
	}
	
			
			
		}
	

	}


