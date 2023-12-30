package TD1.Conditions;

import java.util.Scanner;

public class Exercice_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le numéro du mois : ");
        int mois = sc.nextInt();

        if (mois >= 1 && mois <= 12) {
            int jours = 0;

            switch (mois) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    jours = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    jours = 30;
                    break;
                case 2:
                    System.out.println("Entrez l'année : ");
                    int annee = sc.nextInt();

                    if (annee >= 1900 && annee <= 2100) {
                        if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
                            jours = 29;
                        } else {
                            jours = 28;
                        }
                    } else {
                        System.out.println("Année invalide. Veuillez entrer une année entre 1900 et 2100.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Mois invalide. Veuillez entrer un mois entre 1 et 12.");

                    return;
            }

            System.out.println("Le nombre de jours du mois " + mois + " est : " + jours);
        } else {
            System.out.println("Mois invalide. Veuillez entrer un mois entre 1 et 12.");
        }
    }
}
