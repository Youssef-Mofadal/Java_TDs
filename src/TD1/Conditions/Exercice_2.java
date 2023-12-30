package TD1.Conditions;

import java.util.Scanner;

public class Exercice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la valeur de a : ");
        double a = sc.nextDouble();
        System.out.println("Entrez la valeur de b : ");
        double b = sc.nextDouble();
        System.out.println("Entrez la valeur de c : ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;


        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("L'équation a deux solutions réelles : ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);

            System.out.println("L'équation a une solution réelle : ");
            System.out.println("x = " + x);
        } else {
            System.out.println("L'équation n'a pas de solution réelle.");
        }
    }
}
