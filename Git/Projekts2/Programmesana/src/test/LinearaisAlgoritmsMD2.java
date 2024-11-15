package test;


import java.util.Scanner;



public class LinearaisAlgoritmsMD2 {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
       
        double A, X, P, C ;

        System.out.print("Ievadiet savu algu pirms nodokļu nomaksas: ");
        X = dati.nextDouble();

        System.out.print("Ievadiet ienākuma nodokli: ");
        P = dati.nextDouble();

        A  = X * P / 100;
        C = X - A;

        System.out.printf("Jūsu alga pēc nodokļu nomaksas ir %.2f EUR \n", C );


        dati.close();
    }
}
