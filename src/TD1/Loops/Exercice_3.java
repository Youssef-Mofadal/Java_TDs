package TD1.Loops;

import java.util.Scanner;

public class Exercice_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Exercice_3Q1 q1 = new Exercice_3Q1();
        q1.afficherMaximum20(sc);

        Exercice_3Q2 q2 = new Exercice_3Q2();
        q2.afficherMaximum20EtPosition(sc);

        Exercice_3Q3 q3 = new Exercice_3Q3();
        q3.afficherMaximumSuite(sc);

        class Exercice_3Q1 extends Exercice_3 {
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

        class Exercice_3Q2 extends Exercice_3 {

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

        class Exercice_3Q3 extends Exercice_3 {
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


    }

}
