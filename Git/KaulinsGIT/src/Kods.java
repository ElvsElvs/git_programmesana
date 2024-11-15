
import java.util.Random;
import java.util.Scanner;
public class Kods {
static void mestkaulinu(int reizes) {
	int skaitlis;
	Random rand = new Random();
	for (int i=1; i<=reizes; i++) {
		
	
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Tika uzmests skaitlis: "+skaitlis);
	}
	
}
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner (System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		mestkaulinu(reizes);
		scan.close();
	}

}
