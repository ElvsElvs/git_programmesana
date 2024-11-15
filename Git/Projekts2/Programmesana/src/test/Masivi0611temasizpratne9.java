package test;





import java.util.Scanner; 

public class Masivi0611temasizpratne9 {
	static void Izteiksme(int a, int b) {
		int c = a+b;
		System.out.print(a);
		if (b<0) System.out.println(b+ " = " +c);
		else System.out.println("+" + b + " = " + c);
	}
		
		
		
	public static void main(String[] args) {
				Izteiksme(3, 4);
				Izteiksme(-3, 4);
				Izteiksme(4, -3);
				Izteiksme(-4, -3);


	

	
	}

}
