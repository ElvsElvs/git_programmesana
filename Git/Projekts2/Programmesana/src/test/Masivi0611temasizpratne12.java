package test;

///2. uzdevums
//
//Izveido metodi VeselsSkaitlis(), kura pajautā lietotājam ievadīt vienu veselu skaitli un atgriež to izsaucējmetodei.
//Izveidot metodi Aprekins(), uz kuru tiek nodotas 3 vērtības - 3 veseli skaitļi, 
//bet metode atgriež rezultātu, kas iegūts sareizinot divu mazāko skaitļu summa ar lielāko skaitli.



import java.util.Scanner; 

public class Masivi0611temasizpratne12 {
	static Scanner dati= new Scanner(System.in);

	static int VeselsSkaitlis() {
			System.out.print("Ievadi veselu skaitli: ");
			return dati.nextInt();
	}
		
	
	
	static int Aprekins(int a, int b, int c) {
	int liels = Math.max(Math.max(a,b),c);
	int mazs = Math.min(Math.min(a,b),c);
	int vid = a+b+c - liels-mazs;
	return (mazs+vid)*liels;
	}
		
	public static void main(String[] args) {
		int a = VeselsSkaitlis();
		int b = VeselsSkaitlis();;
		int c = VeselsSkaitlis();
		int d = VeselsSkaitlis();
		System.out.println("Aprēķinu rezultāts: " +Aprekins(a,b,c));
	
		
		
			

	

	
	}

}
