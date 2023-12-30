package TD1.Conditions;

import java.util.Scanner;

public class Exercice_5 {


    // la deuxième partie, avec la demande de choix de la langue : //

    public static class Exercice_5_1 {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);


                System.out.println("Entrez l'heure : ");
                int heure = sc.nextInt();

                if (heure >= 0 && heure < 18) {
                    System.out.println("Bonjour");
                } else if (heure >= 18 && heure < 22) {
                    System.out.println("Bonsoir");
                } else if (heure >= 22 || heure < 0) {
                    System.out.println("Bonne nuit");
                } else {
                    System.out.println("Heure invalide. Veuillez entrer une heure entre 0 et 23.");
                }
            }
        }



    public static class Exercice_5_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Entrez l'heure : ");
            int heure = sc.nextInt();

            System.out.println("Choisissez la langue : ");
            System.out.println("f pour français");
            System.out.println("a pour anglais");
            char lang = sc.next().charAt(0);

            if (heure >= 0 && heure < 18) {
                switch (lang) {
                    case 'f':
                        System.out.println("Bonjour");
                        break;
                    case 'a':
                        System.out.println("Good Morning");
                        break;
                    default:
                        System.out.println("Langue invalide. Veuillez choisir entre f et a.");
                        break;
                }
            } else if (heure >= 18 && heure < 22) {
                switch (lang) {
                    case 'f':
                        System.out.println("Bonsoir");
                        break;
                    case 'a':
                        System.out.println("Good Evening");
                        break;
                    default:
                        System.out.println("Langue invalide. Veuillez choisir entre f et a.");
                        break;
                }
            } else if (heure >= 22 || heure < 0) {
                switch (lang) {
                    case 'f':
                        System.out.println("Bonne nuit");
                        break;
                    case 'a':
                        System.out.println("Good Night");
                        break;
                    default:
                        System.out.println("Langue invalide. Veuillez choisir entre f et a.");
                        break;
                }
            } else {
                System.out.println("Heure invalide. Veuillez entrer une heure entre 0 et 23.");
            }
        }

    }
}

