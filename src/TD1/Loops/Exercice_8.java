package TD1.Loops;

import java.util.Scanner;

public class Exercice_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Affichage d'un ensemble d'étoiles sous cette forme : ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
