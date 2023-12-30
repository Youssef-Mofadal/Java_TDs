package TD1.Conditions;

import java.util.Scanner;

public class Exercice_3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez le premier nombre entier : ");
            int a = sc.nextInt();
            System.out.println("Entrez le deuxième nombre entier : ");
            int b = sc.nextInt();


            System.out.println("Choisissez une option : ");
            System.out.println("1. Savoir si la somme a + b est paire");
            System.out.println("2. Savoir si le produit ab est pair");
            System.out.println("3. Connaître le signe de la somme a + b");
            System.out.println("4. Connaître le signe du produit ab");
            int option = sc.nextInt();


            if (option == 1) {
                if ((a + b) % 2 == 0) {
                    System.out.println("La somme a + b est paire.");
                } else {
                    System.out.println("La somme a + b est impaire.");
                }
            } else if (option == 2) {
                if ((a * b) % 2 == 0) {
                    System.out.println("Le produit ab est pair.");
                } else {
                    System.out.println("Le produit ab est impair.");
                }
            } else if (option == 3) {
                if (a + b > 0) {
                    System.out.println("La somme a + b est positive.");
                } else if (a + b < 0) {
                    System.out.println("La somme a + b est négative.");
                } else {
                    System.out.println("La somme a + b est nulle.");
                }
            } else if (option == 4) {
                if (a * b > 0) {
                    System.out.println("Le produit ab est positif.");
                } else if (a * b < 0) {
                    System.out.println("Le produit ab est négatif.");
                } else {
                    System.out.println("Le produit ab est nul.");
                }
            } else {
                System.out.println("Option invalide. Veuillez choisir entre 1 et 4.");
            }
        }
    }
