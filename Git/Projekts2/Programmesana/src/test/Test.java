package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);
    double A, B , C , D , X, N, M ;

        System.out.print("Ievadiet studentu grupas Budžetu (eur): ");
         A = dati.nextDouble();

        System.out.print("Ievadiet paredzamo attālumu (km): ");
        B = dati.nextDouble();

        System.out.print("Ievadiet autobusa degvielas patēriņu (litri uz 100 km): ");
        C = dati.nextDouble();

        System.out.print("Ievadiet degvielas cenu (eur/litrā): ");
        D = dati.nextDouble();

     
        X = (C / 100) * B;
        N = X * D;
        M = (A / D) * (100 / C);

        if (N <= A) {
            System.out.printf("Studentu grupa spēs atļauties aizbraukt izvēlētajā ekskursijā. Ar atvēlēto Budžetu var nobraukt līdz %.2f km.\n", M);
        } else {
            System.out.printf("Studentu grupai nepietiek līdzekļu, lai aizbrauktu izvēlētajā ekskursijā, jo ar atvēlēto budžetu var nobraukt tikai %.2f km.\n", M);
        }
        

        dati.close();

    }
}