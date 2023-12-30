package TD1.Tables;

import java.util.Scanner;

public class Exercice_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] T = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        System.out.println("Tableau initial : ");
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();

        char dernier = T[T.length - 1];

        for (int i = T.length - 1; i > 0; i--) {
            T[i] = T[i - 1];
        }
        T[0] = dernier;

        System.out.println("Tableau modifié : ");
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();
    }
}
