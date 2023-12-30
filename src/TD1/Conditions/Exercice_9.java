package TD1.Conditions;

import java.util.Scanner;

public class Exercice_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la première variable : ");
        int a = sc.nextInt();
        System.out.println("Entrez la deuxième variable : ");
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
                   a = b;
                b = temp;
        }

        System.out.println("Les variables dans l'ordre croissant sont : " + a + " et " + b);
    }
}