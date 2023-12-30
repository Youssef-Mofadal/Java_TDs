package TD1.Loops;

import java.util.Scanner;

public class Exercice_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le premier entier positif non nul : ");
        int a = sc.nextInt();
        System.out.println("Entrez le deuxième entier positif non nul : ");
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            int pgcd = 0;
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            pgcd = a;
            System.out.println("Le PGCD de a et b est : " + pgcd);
        } else {
            System.out.println("a et b doivent être positifs et non nuls.");
        }
    }
}
