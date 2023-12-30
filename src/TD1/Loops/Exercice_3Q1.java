package TD1.Loops;

import java.util.Scanner;

public class Exercice_3Q1 {
    public void afficherMaximum20(Scanner sc) {
        int max = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrez le nombre " + i + " : ");
            int nombre = sc.nextInt();
            if (nombre > max) {
                max = nombre;
            }
        }
        System.out.println("Le maximum des 20 nombres est : " + max);
    }
}

