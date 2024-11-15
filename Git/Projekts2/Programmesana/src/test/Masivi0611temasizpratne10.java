package test;



//Izveidot metodi JaunsSkaitlis(), kura pajautā lietotājam ievadīt veselu skaitli no 1 līdz 10 un atgriež to, ja tas patiesi ir skaitlis no 1 līdz 10.
//Izveidot metodi JaunsSkaitlis(), kura pajautā lietotājam ievadīt reālu skaitli no 1 līdz 10 un atgriež to, ja tas patiesi ir skaitlis no 1 līdz 10.
//Izveidot metodi Summa(), uz kuru uz tiek nodoti trīs veseli skaitļi un kura atgriež nodoto skaitļu summu.
//Izveidot metodi Summa(), uz kuru uz tiek nodoti trīs reāli skaitļi un kura atgriež nodoto skaitļu summu.
//
//Sastādi programmu, kas izmantojot metodes Jauns Skaitlis() pajautā lietotājam ievadīt 
//3 veselus skaitļus un 3 reālus skaitļus un pārbauda abu metožu Summa() darbību ar dažādām vērtībās.


import java.util.Scanner; 

public class Masivi0611temasizpratne10 {
	static Scanner dati= new Scanner(System.in);

	static int JaunsSkaitlisV() {
		int sk;
		do {
			System.out.print("Ievadi skaitli no 1 līdz 10: ");
			sk = dati.nextInt();
		}while (sk<1 || sk>10);
		return sk;
		
	}
	static double JaunsSkaitlisR() {
		double sk;
		do {
			System.out.print("Ievadi skaitli no 1 līdz 10: ");
			sk = dati.nextDouble();
		}while (sk<1 || sk>10);
		return sk;
		
	}
		
	static int Summa(int a, int b, int c) {
		return a+b+c;
	}
		static double Summa(double a, double b, double c) {
			return a+b+c;
	}
		
		
	public static void main(String[] args) {
		int a = JaunsSkaitlisV();
		int b = JaunsSkaitlisV();
		int c = JaunsSkaitlisV();
		double A = JaunsSkaitlisR();
		double B = JaunsSkaitlisR();
		double C = JaunsSkaitlisR();
		System.out.println("Veselo skaitļu summa: "+Summa(a,b,c));
		System.out.println("Reālo skaitļu summa: "+Summa(A,B,C));
		
			

	

	
	}

}
