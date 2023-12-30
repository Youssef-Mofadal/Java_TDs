package TD1.Conditions;

import java.util.Scanner;

public class Exercice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la première variable : ");
        int a = sc.nextInt();
        System.out.println("Entrez la deuxième variable : ");
        int b = sc.nextInt();
        System.out.println("Entrez la troisième variable : ");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        System.out.println("Le maximum des trois variables est : " + max);
    }
}
