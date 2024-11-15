package test;

//Sastādi programmu, kas lietotājam pajautā ievadīt pasta indeksu formā LV-xxxx, kur x - ir cipars,
//un pārbauda pasta indeksa korektumu izmantojot regulārās izteiksmes.


import java.util.Scanner; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Masivi0611temasizpratne6 {
	public static void main(String[] args) {
		Scanner dati = new Scanner (System.in);
		System.out.print("Pasta indekss (LV-****): ");
		String index = dati.next();
		
		
		Pattern sablons = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", Pattern.CASE_INSENSITIVE);
		Matcher parbaude = sablons.matcher(index);
		if (parbaude.matches()) System.out.println("Korekts pasta indekss.");
		else System.out.println("Nederīgs pasta indekss.");

	
		
	

	
	}

}
