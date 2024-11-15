package test;
//Sastādīt programmu, kas izvada ekrāna masīvu A[20], kas aizpildīts ar nejaušiem skaitļiem - 0 un 1.
//Pēc tam apmainīt masīva A visas 0 pret 1 un visus 1 pret 0. Pārveidoto masīvu izvadīt ekranā.

public class Masivi3010Uzd4 {

	public static void main(String[] args) {
		int[] A = new int[20];
		int i;
		for(i=0; i<20; i++) {
			A[i]=(int) (Math.random()*2);
			System.out.print(A[i]+ " ");
	
		
	}
		
		System.out.println();
		for(i=0; i<20; i++) {
			if(A[i]==0) A[i]=1; else A[i]=0;
			System.out.print(A[i]+ " ");
		}
	
			
			
		}
	

	}


