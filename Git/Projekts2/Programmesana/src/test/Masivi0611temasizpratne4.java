package test;

import java.util.Arrays;
import java.util.Scanner;

public class Masivi0611temasizpratne4 {
    public static void main(String[] args) {
        Scanner dati = new Scanner(System.in);

        String[] A = new String[40];
        int i, n = 0;
        char atb;

        do {
            System.out.print("Ievadi kursa biedra vārdu: ");
            String v = dati.next();
            System.out.print("Ievadi kursa biedra uzvārdu: ");
            String u = dati.next();
            System.out.print("Ievadi kursa biedra telefona numuru: ");
            String t = dati.next();
            A[n] = u + " " + v + " tel." + t;
            n++;
            System.out.print("Vai turpināsi datu ievadi (j/n)? ");
            atb = dati.next().charAt(0);
        } while (atb == 'j' && n < 40);

       
        Arrays.sort(A, 0, n);

        System.out.println("Dati par kursa biedriem alfabēta secībā pēc uzvārda:");
        for (i = 0; i < n; i++) {
            System.out.println(A[i]);
        }

        dati.close();
    }
}
