package TD1.Loops;

import java.util.Scanner;

public class Exercice_7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez le nombre de lignes : ");
            int lignes = sc.nextInt();

            for (int i = 1; i <= lignes; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}
