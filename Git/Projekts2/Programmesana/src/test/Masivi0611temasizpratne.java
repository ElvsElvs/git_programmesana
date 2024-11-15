package test;

//Sastādīt programmu, kas atbilstoši lietotāja ievadītajam mēneša kārtas numuram izdrukā ekrānā mēneša nosaukumu.




import java.util.Scanner; 

public class Masivi0611temasizpratne {
	public static void main(String[] args) {
		Scanner dati = new Scanner (System.in);
		System.out.print("Ievadi mēneša kārtas numuru(1-12): ");
		int m= dati.nextInt();
		dati.close();
		
		String [] men = {"Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs", 
				"Jūlijs", "Augusts", "Septembris", "Oktobris", "Novembris", "Decembris"};
		if(m<1 || m>12) System.out.println("Kļūda! Tāds mēnesis neeksistē!");
		else System.out.println(men[m-1]);
		
	}

}
