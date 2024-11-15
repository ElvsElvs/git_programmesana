package test;

//Sastādīt programmu, kas izveido kāršu kavu ar 36 kārtīm, sajauc to un atbilstoši spēlētāju skaitam, 
//kuru ievada lietotājs (2 līdz 6 spēlētāji), iedala 6 kārtis katram spēlētājam, nosaka trumpi un galda kārtis




import java.util.Scanner; 

public class Masivi0611temasizpratne3 {
	public static void main(String[] args) {
	String [] [] A =  new String [9][9];
	int i, j;
	A[0][0]= "  ";
	for (j=1; j<9; j++) A[0][j]=" "+(char)(64+j);
	for (i=1; i<9; i++) A[i][0]=" "+(char)(57-i);
	for (i=1; i<9; i++)
		for (j=1; j<9; j++)
		if ((i+j)%2==0) A[i][j]= " ◻"; else A[i][j]= " ";
	for (i=1; i<4; i++)
		for (j=1; j<9; j++)
		if ((i+j)%2!=0) A[i][j]= " ◎";
	for (i=6; i<9; i++)
		for (j=1; j<9; j++)
		if ((i+j)%2!=0) A[i][j]= " ◉";

	
	
	for (i=0; i<9; i++) {
		for(j=0; j<9; j++) {
			System.out.print(A[i][j]+ " ");
			
		}
		System.out.println();
	}
	

		
	}

}