package test;

//
//
//Izveido metodi NaturalsSkaitlis(), kura pajautā lietotājam ievadīt vienu naturālu skaitli un atgriež to izsaucējmetodei.
//
//Izveido metodi, Trijsturis(), kas izdrukā ekrānā "No nogriežņiem x, y un z var izveidot trijstūri" vai 
//"No nogriežņiem x, y un z NEVAR izveidot trijstūri", 
//atkarībā no tā vai uz metodi nodotie 3 veselie skaitļi apmierina trijstūra eksistences nosacījumu vai nē.
//
//Izveido metodi Laukums(), kas izmantojot uz to nodotos trīs naturālos skaitļus - 
//nogriežņa garumus, aprēķina un atgriež trijstūra laukumu.
//
//Sastādīt programmu, kas izmantojot iepriekš izveidotās metodes nosaka, vai atrodams trijstūris(i), 
//kura malu garumi ir trīs nogriežņi no 4 lietotāja ievadītajiem. Ja šāds trijstūris eksistē, aprēķināt tā laukumu.

import java.util.Scanner; 

public class Masivi0611temasizpratne11 {
	static Scanner dati= new Scanner(System.in);

	static int NaturalsSkaitlis() {
		int sk;
		do {
			System.out.print("Ievadi naturālu skaitli: ");
			sk = dati.nextInt();
		}while (sk<1);
		return sk;
		
	
		
	}
		
	static void Trijsturis(int x, int y, int z) {
		if (x<y+z && y<x+z && z<y+x) {
			System.out.print("No nogriežņiem " +x+", "+y+"  un "+z+" var izveidot trijstūri");
			System.out.println(" ar laukumu  "+Laukums(x,y,z));
			} else
				{ System.out.println("No nogriežņiem " +x+", "+y+"  un "+z+" nevar izveidot trijstūri");
		}
	
	}
	
	static double Laukums(int x, int y, int z) {
		double p = (x+y+z) / 2.0;
		double s = Math.sqrt(p*(p-x)*(p-y)*(p-z));
		return s;
	}
		
	public static void main(String[] args) {
		System.out.println("Ievadi 4 nogriežņu garumus:");
		int a = NaturalsSkaitlis();
		int b = NaturalsSkaitlis();;
		int c = NaturalsSkaitlis();
		int d = NaturalsSkaitlis();
		Trijsturis(a,b,c);
		Trijsturis(a,b,d);
		Trijsturis(a,d,c);
		Trijsturis(d,b,c);
		
		
			

	

	
	}

}
