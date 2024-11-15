package test;

//Sastādīt programmu, kas atbilstoši lietotāja ievadītajam mēneša kārtas numuram izdrukā ekrānā mēneša nosaukumu.




import java.util.Scanner; 

public class Masivi0611temasizpratne5 {
	public static void main(String[] args) {
		Scanner dati = new Scanner (System.in);
		System.out.print("Ievadi 1.vārdu: ");
		String v1 = dati.next();
		System.out.print("Ievadi 2.vārdu: ");
		String v2 = dati.next();
		System.out.print("Ievadi simbolu, kas nav ne burts, ne cipars: ");
		char s = dati.next().charAt(0);
		dati.close();
		int sk = 0;
		
		//1.dala
		v1 = v1.toLowerCase();
		char[] masivs1 = v1.toCharArray();
		for (int i=0; i<v1.length(); i++)
			if(masivs1[i]< 'a'|| masivs1[i]> 'z') 
				masivs1[i]=s;
				sk++;
		System.out.print("Tava parole: " + (""+ masivs1[0]).toUpperCase());
		for(int i=1; i<v1.length(); i++) System.out.print(masivs1[i]);
		//2.dala
		System.out.print((int)(Math.random()*10));
		//3.dala
		v2 = v2.toLowerCase();
		char[] masivs2 = v2.toCharArray();
		for(int i=0; i<v2.length(); i++)
			if (masivs2[i]<'a' || masivs2[i]>'z')  
				masivs2[i]=s;
				sk++;
		for(int i=0; i<v2.length()-1; i++) System.out.print(masivs2[i]);
		System.out.print((""+ masivs2[v2.length()-1]).toUpperCase());
		
		//4.dala
		if (sk==0) 
			System.out.print(s);
			//5.dala
			int garums = v1.length() + 1 + v2.length();
			if (sk==0) garums++;
			while (garums<8) {
				System.out.print(s);
				garums++;
			
			
		}
	
	
	
	}

}
