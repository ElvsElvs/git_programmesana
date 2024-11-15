
import java.util.Scanner;
import java.text.DecimalFormat;


public class PraktiskaisUzdevums1 {

	public static void main(String[] args) {
	int studSk, kritSk;
	Scanner scan = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat("0.##");
	
	do {
		System.out.println("Cik studentiem aprēķināt gala atzīmi?");
		while(!scan.hasNextInt()) {
			System.out.println("Cik studentiem aprēķināt gala atzīmi?");
			scan.next();
		}
		
		studSk = scan.nextInt();
		}while (studSk<1);
	String [] studenti = new String[studSk];
	do {
		System.out.println("Kāds būs kritēriju skaits?");
		while (!scan.hasNext()) {
			System.out.println("Kāds būs kritēriju skaits?");
			scan.next();
		}
		kritSk = scan.nextInt();
		
	} while (kritSk<1);
	String [] kriteriji = new String [kritSk];                        //MD  PD  Eks
	int [] kritSvars = new kritSvars [kritSk];                         //20   30  50  
	int [][] kritVertejumi = new int [studSk] [kritSk];     // Peteri   6    10  10
	double [] semVert = new double [studSk];
	

		
		
		
		scan.close();
		
	}

}

