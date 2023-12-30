package TD1.Loops;

import java.util.Scanner;

public class Exercice_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un entier positif n : ");
        int n = sc.nextInt();

        if (n >= 0) {
            int f1 = 0;
            int f2 = 1;
            int fn = 0;

            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    fn = 0;
                } else if (i == 1) {
                    fn = 1;
                } else {
                    fn = f1 + f2;
                    f1 = f2;
                    f2 = fn;
                }
            }
            System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + fn);
        } else {
            System.out.println("n doit être positif ou nul.");
        }
    }
}
