package TD1.Loops;

import java.util.Scanner;

public class Exercice_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre entier : ");
        int nombre = sc.nextInt();
        int somme = 0;
        while (nombre > 0) {
            int chiffre = nombre % 10;
            somme = somme + chiffre;
            nombre = nombre / 10;
        }
        System.out.println("La somme des chiffres du nombre est : " + somme);
    }
}
