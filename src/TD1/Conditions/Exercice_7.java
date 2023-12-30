package TD1.Conditions;

import java.util.Scanner;

public class Exercice_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre entier de trois chiffres non nuls : ");
        int N = sc.nextInt();

        String s = String.valueOf(N);

        if (s.length() == 3 && !s.contains("0")) {
            System.out.println("Les nombres formés par les chiffres de N sont : ");

            for (int i = 0; i < 3; i++) {
                char c1 = s.charAt(i);

                for (int j = 0; j < 3; j++) {
                    char c2 = s.charAt(j);

                    if (c2 != c1) {
                        char c3 = s.charAt(3 - i - j);

                        System.out.println(c1 + "" + c2 + "" + c3);
                    }
                }
            }
        } else {
            System.out.println("Nombre invalide. Veuillez entrer un nombre entier de trois chiffres non nuls.");
        }
    }
}
