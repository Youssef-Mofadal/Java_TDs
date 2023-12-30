package TD1.Conditions;

import java.util.Scanner;

public class Exercice_6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez le premier nombre entier : ");
            int A = sc.nextInt();
            System.out.println("Entrez le deuxième nombre entier : ");
            int B = sc.nextInt();


            if (A > 0 && B > 0 || A < 0 && B < 0) {
                System.out.println("Le produit de A et B est positif.");
            } else if (A > 0 && B < 0 || A < 0 && B > 0) {
                System.out.println("Le produit de A et B est négatif.");
            } else {
                System.out.println("Le produit de A et B est nul.");
            }
        }
}
