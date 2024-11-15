package test;





import java.util.Scanner; 

public class Masivi0611temasizpratne8 {
	   static void Druka(int x){
		   if(x%10==1 && x!=11) System.out.println(x+" bumbu.");
		   else System.out.println(x+" bumbas.");
	   }
	   public static void main(String[] args) {
	      int bumbas1, bumbas2;
	      Scanner dati=new Scanner(System.in);
	      System.out.print("Ievadi cik bumbas paņēma 1.spēlētājs: ");
	      bumbas1=dati.nextInt();
	      System.out.print("Ievadi cik bumbas paņēma 2.spēlētājs: ");
	      bumbas2=dati.nextInt();
	      System.out.print("1.spēlētājs paņēma "); Druka(bumbas1);
	      System.out.print("2.spēlētājs paņēma "); Druka(bumbas2);
	      dati.close();
	   }


	
	}

