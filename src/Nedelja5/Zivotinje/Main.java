package Nedelja5.Zivotinje;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Kretanje zivotinje[] = {new Pas("Borko", "nemacki ovcar"),
                new Macka("Rambo", "domestic"),
                new Riba("Nemo", "riba klovn"),
                new Kokoska("Mica", "domaca kokoska"),
                new Delfin("Pera"),
                new Pingvin("Linux")};

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Kretanje zivotinja = zivotinje[random.nextInt(zivotinje.length)];
            System.out.println((i + 1) + " . " + zivotinja + ": ");
            TestInterfejs.ispisujeKretanja(zivotinja.kreciSe());

            if (zivotinja instanceof Oglasavanje) {
                ((Oglasavanje) zivotinja).oglasiSe();
                ((Oglasavanje) zivotinja).oglasiSeULjutnji();
            }
        }
    }
}