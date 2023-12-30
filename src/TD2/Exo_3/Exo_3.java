package TD2.Exo_3;

public class Exo_3 {
    public static void main(String[] args) {
        Livre l = new Livre("Cours","Mehdi",0.0f,2022);
        System.out.println(l.toString());
        Livre l2 = new Livre(l);
        System.out.println(l2.toString());}
}
