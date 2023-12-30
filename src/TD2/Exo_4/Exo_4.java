package TD2.Exo_4;

public class Exo_4 {

    public static void main(String[] args) {
        Temps t = new Temps(3,10,10);
        System.out.println(t.toString());
        t.ajouterMinutes(180);
        System.out.println(t);
        t.ajouterSecondes(3660);
        System.out.println(t);}
}
