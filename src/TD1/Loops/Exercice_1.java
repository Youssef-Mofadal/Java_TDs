package TD1.Loops;

import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un entier naturel N : ");
        int N = sc.nextInt();

        if (N >= 0) {
            int fact = 1;
            for (int i = 1; i <= N; i++) {
                fact = fact * i;
            }
            System.out.println("Le factoriel de " + N + " est : " + fact);
        } else {
            System.out.println("N doit être positif ou nul.");
        }
    }
}
