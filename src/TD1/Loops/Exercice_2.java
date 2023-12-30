package TD1.Loops;

import java.util.Scanner;

public class Exercice_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un entier N : ");
        int N = sc.nextInt();

        int somme = 0;
        for (int i = 1; i < N; i++) {
            if (i % 2 != 0) {
                somme = somme + i;
            }
        }
        System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);
    }
}
