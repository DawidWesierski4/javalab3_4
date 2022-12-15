package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTranformacji implements Transformacja {
    private Transformacja[] transformacje = new Transformacja[5];

    public ZlozenieTranformacji(Transformacja[] transformacje) {
        this.transformacje = transformacje;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna()
        throws BrakTransformacjiOdwrotnejException {
        throw new BrakTransformacjiOdwrotnejException("Ta funkcja" + 
            "Nie obsługuję tranformacji odwrotnej");
    }

    @Override
    public Punkt transformuj(Punkt p) {

        Punkt output = p;
        for (Transformacja t : transformacje) {
            output = t.transformuj(output);
        }

    return output;
    }
}
