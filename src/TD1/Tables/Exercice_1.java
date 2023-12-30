package TD1.Tables;

import java.util.Scanner;

public class Exercice_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nombre d'éléments du tableau (entre 10 et 50) : ");
        int N = sc.nextInt();

        if (N >= 10 && N <= 50) {
            int[] T = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.println("Entrez la valeur de l'élément " + i + " : ");
                T[i] = sc.nextInt();
            }
            int max = T[0];
            int min = T[0];
            for (int i = 1; i < N; i++) {
                if (T[i] > max) {
                    max = T[i];
                }

                if (T[i] < min) {
                    min = T[i];
                }
            }
            System.out.println("La valeur maximale du tableau est : " + max);
            System.out.println("La valeur minimale du tableau est : " + min);
        } else {
            System.out.println("N doit être compris entre 10 et 50.");
        }
    }
}
