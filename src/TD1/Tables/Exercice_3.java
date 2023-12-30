package TD1.Tables;

import java.util.Scanner;

public class Exercice_3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double[] moyennes = {12.5, 15.3, 10.7, 8.9, 14.2, 13.4, 11.8, 9.6, 16.1, 17.5};
            double seuil = 0;
            System.out.println("Entrez le seuil : ");
            seuil = sc.nextDouble();
            int compteur = 0;
            for (int i = 0; i < moyennes.length; i++) {
                if (moyennes[i] >= seuil) {
                    compteur++;
                }
            }
            System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est : " + compteur);
        }

}
