package TD1.Loops;

import java.util.Scanner;

public class Exercice_3Q3 {
    public void afficherMaximumSuite(Scanner sc) {
        int max = 0;
        int pos = 0;
        int nombre = 0;
        int compteur = 0;
        do {
            System.out.println("Entrez un nombre (0 pour terminer) : ");
            nombre = sc.nextInt();
            if (nombre != 0) {
                compteur++;
                if (nombre > max) {
                    max = nombre;
                    pos = compteur;
                }
            }
        } while (nombre != 0);
        System.out.println("Le maximum de la suite est : " + max);
        System.out.println("Il a été saisi en position " + pos);
    }
}
