package test;

import java.util.Scanner;

public class CikliskaisAlgoritmsMD4 {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);

        System.out.print("Ievadi datora cenu: ");
        double A = dati.nextDouble();

        int M = 0; 
        int X = 0; 

        while (X < A) {
            System.out.print("Cik tev izdevās šomēnes iekrāt:");
            double B = dati.nextDouble();
            
            X += B; 
            M++; 
        }

        System.out.println("Studentam būs nepieciešami " + M + " mēneši, lai iegādātos jaunu datoru!");

        dati.close();
    }
}
