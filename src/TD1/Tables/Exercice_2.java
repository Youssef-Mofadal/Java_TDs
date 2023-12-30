package TD1.Tables;

import java.util.Scanner;

public class Exercice_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un entier N : ");
        int N = sc.nextInt();
        String binaire = "";
        while (N > 0) {
            int reste = N % 2;
            binaire = reste + binaire;
            N = N / 2;
        }
        System.out.println("La représentation binaire de N est : " + binaire);
    }
}
