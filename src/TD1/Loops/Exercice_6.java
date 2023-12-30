package TD1.Loops;

import java.util.Scanner;

public class Exercice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Affichage de toutes les possibilités d’obtenir un total de 15 en ajoutant trois entiers choisis entre 1 et 9 : ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {

                    if (i + j + k == 15) {
                        System.out.println(i + " + " + j + " + " + k + " = 15");
                    }
                }
            }
        }
    }
}
