package TD3.Exo_1;

public class PointExo_1 {

    public void PointExo_1(int x, int y) { this.x = x ; this.y = y ; }
    public void deplace (int dx, int dy) { x += dx ; y += dy ; }
    public int getX() { return x ; }
    public int getY() { return y ; }
    private int x, y ;
}

class PointA extends PointExo_1 {
    void affiche()
    { System.out.println ("Coordonnees : " + getX() + " " + getY()) ;
    }
    public static void main (String args[])
    { PointExo_1 p = new PointExo_1 () ;
        p.PointExo_1 (2, 5);
        System.out.println ("Coordonnees : " + p.getX() + " " + p.getY() ) ;
        PointA pa = new PointA () ;
        pa.PointExo_1 (1, 8);
        pa.affiche() ;}
}