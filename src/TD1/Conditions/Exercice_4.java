package TD1.Conditions;

import java.util.Scanner;

public class Exercice_4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez la moyenne de l'étudiant : ");
            double moyenne = sc.nextDouble();


            if (moyenne >= 16) {
                System.out.println("La mention est Très Bien.");
            } else if (moyenne >= 14) {
                System.out.println("La mention est Bien.");
            } else if (moyenne >= 12) {
                System.out.println("La mention est Assez Bien.");
            } else if (moyenne >= 10) {
                System.out.println("La mention est Passable.");
            } else {
                System.out.println("L'étudiant est ajourné.");
            }
        }
    }
