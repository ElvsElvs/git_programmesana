import java.util.Scanner;
import java.text.DecimalFormat;

public class Praktiskaistest{

    public static void main(String[] args) {
        int studSk, kritSk;
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        // Get the number of students
        do {
            System.out.println("Cik studentiem aprēķināt gala atzīmi?");
            while (!scan.hasNextInt()) {
                System.out.println("Lūdzu, ievadiet derīgu skaitli!");
                scan.next();
            }
            studSk = scan.nextInt();
        } while (studSk < 1);

        String[] studenti = new String[studSk];

        // Get the number of criteria
        do {
            System.out.println("Kāds būs kritēriju skaits?");
            while (!scan.hasNextInt()) {
                System.out.println("Lūdzu, ievadiet derīgu skaitli!");
                scan.next();
            }
            kritSk = scan.nextInt();
        } while (kritSk < 1);

        String[] kriteriji = new String[kritSk];
        int[] kritSvars = new int[kritSk];
        int[][] kritVertejumi = new int[studSk][kritSk];
        double[] semVert = new double[studSk];

        // Input criteria names and weights
        for (int i = 0; i < kritSk; i++) {
            System.out.println("Ievadiet " + (i + 1) + ". kritērija nosaukumu:");
            kriteriji[i] = scan.next();
            
            System.out.println("Ievadiet " + kriteriji[i] + " svaru procentos (5-100):");
            int weight;
            do {
                while (!scan.hasNextInt()) {
                    System.out.println("Lūdzu, ievadiet derīgu skaitli svaram!");
                    scan.next();
                }
                weight = scan.nextInt();
                if (weight < 5 || weight > 100) {
                    System.out.println("Svars jābūt no 5 līdz 100.");
                }
            } while (weight < 5 || weight > 100);
            kritSvars[i] = weight;
        }

        // Check if the total weight does not exceed 100%
        int totalWeight = 0;
        for (int weight : kritSvars) {
            totalWeight += weight;
        }
        if (totalWeight > 100) {
            System.out.println("Kritēriju svars pārsniedz 100%. Lūdzu, pārbaudiet svarus un mēģiniet vēlreiz.");
            scan.close();
            return;
        }

        // Input student names and scores for each criterion
        for (int i = 0; i < studSk; i++) {
            System.out.println("Ievadiet " + (i + 1) + ". studenta vārdu:");
            studenti[i] = scan.next();

            for (int j = 0; j < kritSk; j++) {
                System.out.println("Ievadiet vērtējumu (no 0 līdz 10) priekš " + kriteriji[j] + " priekš " + studenti[i] + ":");
                int score;
                do {
                    while (!scan.hasNextInt()) {
                        System.out.println("Lūdzu, ievadiet derīgu skaitli vērtējumam!");
                        scan.next();
                    }
                    score = scan.nextInt();
                    if (score < 0 || score > 10) {
                        System.out.println("Vērtējumam jābūt no 0 līdz 10.");
                    }
                } while (score < 0 || score > 10);
                kritVertejumi[i][j] = score;
            }
        }

        // Calculate and display each student's final grade
        System.out.println("\nGala atzīmes:");
        for (int i = 0; i < studSk; i++) {
            double finalGrade = 0.0;
            for (int j = 0; j < kritSk; j++) {
                finalGrade += (kritSvars[j] / 100.0) * kritVertejumi[i][j];
            }
            semVert[i] = finalGrade;
            System.out.println(studenti[i] + "'s gala atzīme: " + df.format(finalGrade));
        }

        scan.close();
    }
}
