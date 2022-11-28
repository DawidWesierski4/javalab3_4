package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Punkt {
    /*
    * Słowo kluczowe final oznacza, że po pierwszym przypisaniu
    * zawartość pól x oraz y nie może zostać zmieniona
    * w tym miejscu jest to odpowiednik słowa kluczowego const
    * z języka C++.
    */
    private final double x,y;
    public Punkt(double x, double y) {
        this.y = y;
        this.x = x;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Punkt)) {
            return false;
        }

        Punkt aux = (Punkt) obj;
        if(aux.x == this.x && aux.y == this.y ) {
            return true;
        } else {
            return false;
        }
    }
    // @Override
    // public int hashCode() {
    // /*
    // * TODO
    // */
    // }
    // @Override
    // public String toString() {
    // /*
    // * TODO
    // */
    // }
    // /**
    //  * Początek układu współrzędnych.
    //  * W tym miejscu słowo kluczowe final oznacza, że statyczne
    //  * pole klasy Punkt nie może zostać zmienione.
    //  * Dotyczy to jednak samej referencji, a nie obiektu, na który
    //  * wskazuje.
    //  */
    // public static final Punkt O = new Punkt(0, 0);
    // /**
    //  * Punkt (1,0) w układzie współrzędnych
    //  */
    // public static final Punkt E_X = new Punkt(1, 0);
    
    // /**
    //  * Punkt (0,1) w układzie współrzędnych
    //  */
    // public static final Punkt E_Y = new Punkt(0, 1);

}
