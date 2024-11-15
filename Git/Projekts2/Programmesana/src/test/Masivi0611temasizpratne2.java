package test;

//Sastādīt programmu, kas izveido kāršu kavu ar 36 kārtīm, sajauc to un atbilstoši spēlētāju skaitam, 
//kuru ievada lietotājs (2 līdz 6 spēlētāji), iedala 6 kārtis katram spēlētājam, nosaka trumpi un galda kārtis




import java.util.Scanner; 

public class Masivi0611temasizpratne2 {
	public static void main(String[] args) {
		Scanner dati = new Scanner (System.in);
		int n;
		do {
			System.out.print("Ievadi speletaju skaitu: ");
			 n= dati.nextInt();
		} while (n<2 || n>6);
		dati.close();
		
		
		String [] kava = {  "♠6", "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "♠A",
							"♥6", "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♥A",
							"♦6", "♦7", "♦8", "♦9", "♦10", "♦J", "♦Q", "♦K", "♦A",
							"♣6", "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♣A"};
		
		
		
		int i, x;
		String k, pag;
		for (i=0; i<36; i++) {
			 x = (int)(Math.random()*36);
			 pag = kava[i];
			 kava[i] = kava[x];
			 kava[x]= pag;
			
		}
//	for (i=0; i<36; i++) System.out.print(kava[i]+ " ");
		for (i=0; i<n; i++) {
			System.out.print((i+1)+ ". Spēlētaja kārtis: ");
			for(x=0; x<6; x++) System.out.print (kava[i*6+x]+ " ");
			System.out.println();
		}
		if (n==6) System.out.println("Trumpe:"+kava[35]);
		else { 
	System.out.println( "Trumpe: "+kava[n*6]);
	System.out.print("Galds: ");
	for (i=n*6; i<36; i++) System.out.print(kava[i]+ " ");
	
		}
	

		
	}

}