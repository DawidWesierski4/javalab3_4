package pl.edu.pg.eti.ksg.po.lab1;

import pl.edu.pg.eti.ksg.po.lab1.transformacje.Punkt;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Translacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Skalowanie;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Obrot;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.BrakTransformacjiOdwrotnejException;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Transformacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.ZlozenieTranformacji;

public class Test {

    public static void atest()
    {
        A a = new A(5);
        System.out.println("Pobieranie liczby:");
        System.out.println(a.getLiczba());
        System.out.println("Drukowanie całego obiektu:");
        System.out.println(a);
        a.setLiczba(6);
        System.out.println("Drukowanie całego obiektu po ustawieniu liczby:");
        System.out.println(a);
        A a1 = new A(6);
        System.out.println("Porównywanie referencji: a == a");
        System.out.println(a == a);
        System.out.println("Porównywanie referencji: a == a1");
        System.out.println(a == a1);
        System.out.println("Metoda equals: a.equals(a)");
        System.out.println(a.equals(a));
        System.out.println("Metoda equals: a.equals(a1)");
        System.out.println(a.equals(a1));
        System.out.println("Metoda hashCode: a.hashCode()");
        System.out.println(a.hashCode());
        System.out.println("Metoda hashCode: a1.hashCode()");
        System.out.println(a1.hashCode());
    }

    public static void btest()
    {
        B b = new B(2.5);
        System.out.println("Pobieranie liczby:");
        System.out.println(b.getLiczba());
        System.out.println("Drukowanie całego obiektu:");
        System.out.println(b);
        b.setLiczba(3.14);
        System.out.println("Drukowanie całego obiektu po ustawieniu liczby:");
        System.out.println(b);
        B b1 = new B(3.14);
        System.out.println("Porównywanie referencji: b == b");
        System.out.println(b == b);
        System.out.println("Porównywanie referencji: b == b1");
        System.out.println(b == b1);
        System.out.println("Metoda equals: b.equals(b)");
        System.out.println(b.equals(b));
        System.out.println("Metoda equals: b.equals(b1)");
        System.out.println(b.equals(b1));
        System.out.println("Metoda hashCode: b.hashCode()");
        System.out.println(b.hashCode());
        System.out.println("Metoda hashCode: b1.hashCode()");
        System.out.println(b1.hashCode());
    }


    public static void pkttest()
    {
        Punkt p = new Punkt(2,5);
        System.out.println("Pobieranie liczby x:");
        System.out.println(p.getX());
        System.out.println("Pobieranie liczby x:");
        System.out.println(p.getY());
        System.out.println("Drukowanie całego obiektu:");
        System.out.println(p);
        System.out.println("Drukowanie całego obiektu po ustawieniu liczby:");
        System.out.println(p);
        Punkt p1 = new Punkt(3,14);
        System.out.println("Porównywanie referencji: b == b");
        System.out.println(p == p);
        System.out.println("Porównywanie referencji: b == b1");
        System.out.println(p == p1);
        System.out.println("Metoda equals: b.equals(b)");
        System.out.println(p.equals(p));
        System.out.println("Metoda equals: b.equals(b1)");
        System.out.println(p.equals(p1));
        System.out.println("Metoda hashCode: b.hashCode()");
        System.out.println(p.hashCode());
        System.out.println("Metoda hashCode: b1.hashCode()");
        System.out.println(p1.hashCode());
    }


    /*
    * Listning 14
    *
    * Konstrukcja językowa try {} catch (...){} służy do
    * obsługi wyjątków. Kod w bloku try jest monitorowany
    * pod kątem wystąpienia wyjątku bądź wyjątków
    * wspomnianych na początku bloku/bloków catch.
    * Jeżeli gdzieś w bloku try wystąpi wyjątek, to sterowanie
    * zostanie natychmiast przeniesione do bloku catch.
    * Tam powinien znajdować się kod obsługujący wyjątek.
    * Może to być np. wypisanie stosu wywołań na wyjście błędów
    * lub zapisanie wyjątku w logach, lub wyrzucenie (zgłoszenie)
    * innego wyjątku lepiej opisującego sytuacje (można załączyć
    * wyjątek który zainicjował to zdarzenie patrz. Konstruktor
    * klasy java.lang.Exception)
    */
    public static void testTranslacjaAndSkalowanie()
    {

        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        } catch (BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        System.out.println();

        try {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        } catch(BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        System.out.println();

        try {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        } catch(BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        System.out.println();
    }

    public static void testObrot()
    {
        try {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Obrot(5);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        } catch(BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
    }

    public static void testZlozenieTranformacji()
    {
        try {
            Punkt p1 = new Punkt(2, 2);
            Transformacja[] tab = {
                new Obrot(10),
                new Obrot(20),
                new Obrot(30),
                new Obrot(40)
                
            };



            Transformacja tr2 = new ZlozenieTranformacji(tab);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        } catch(BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
    }

}
