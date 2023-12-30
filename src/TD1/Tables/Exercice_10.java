package TD1.Tables;

import java.util.Scanner;

public class Exercice_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la taille des matrices carrées : ");
        int n = sc.nextInt();

        if (n > 0) {
            double[][] A = new double[n][n];
            double[][] B = new double[n][n];

            System.out.println("Entrez les éléments de la première matrice : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Entrez la valeur de l'élément " + i + "," + j + " : ");
                    A[i][j] = sc.nextDouble();
                }
            }

            System.out.println("Entrez les éléments de la deuxième matrice : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Entrez la valeur de l'élément " + i + "," + j + " : ");
                    B[i][j] = sc.nextDouble();
                }
            }

            double[][] C = new double[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }

            System.out.println("La somme des matrices est : ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("n doit être positif.");
        }
    }
}
