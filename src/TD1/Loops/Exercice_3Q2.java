package TD1.Loops;

import java.util.Scanner;

public class Exercice_3Q2 {

    public void afficherMaximum20EtPosition(Scanner sc) {
        int max = 0;
        int pos = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Entrez le nombre " + i + " : ");
            int nombre = sc.nextInt();
            if (nombre > max) {
                max = nombre;
                pos = i;
            }
        }
        System.out.println("Le maximum des 20 nombres est : " + max);
        System.out.println("Il a été saisi en position " + pos);
    }
}
