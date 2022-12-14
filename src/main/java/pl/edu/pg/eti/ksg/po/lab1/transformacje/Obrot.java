package pl.edu.pg.eti.ksg.po.lab1.transformacje;
import java.lang.Math;

public class Obrot implements Transformacja{
    private final double Alfa;

    public Obrot(double Alfa) {
        this.Alfa = Alfa;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Obrot(-this.Alfa);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt( (Math.cos(this.Alfa) * p.getX() -
                           Math.sin(this.Alfa) * p.getY()) ,
                          (Math.cos(this.Alfa) * p.getX() -
                           Math.sin(this.Alfa) * p.getY()) );
    }

    public double getAlfa() {
        return Alfa;
    }

    public double getSkalaY() {
        return Alfa;
    }

    @Override
    public String toString() {
        return "Obrót o "+this.Alfa+" stopni";
    }
}
