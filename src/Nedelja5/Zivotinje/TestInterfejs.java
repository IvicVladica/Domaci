package Nedelja5.Zivotinje;

public class TestInterfejs {
    public static void ispisujeKretanja(int nacinKretanja) {
        if ((nacinKretanja & Kretanje.HODA) == Kretanje.HODA)
            System.out.println("Hoda");
        if ((nacinKretanja & Kretanje.SKACE) == Kretanje.SKACE)
            System.out.println("Skace");
        if ((nacinKretanja & Kretanje.PLIVA) == Kretanje.PLIVA)
            System.out.println("Pliva");
        if ((nacinKretanja & Kretanje.GNJURI) == Kretanje.GNJURI)
            System.out.println("Gnjuri");
        if ((nacinKretanja & Kretanje.LETI) == Kretanje.LETI)
            System.out.println("Leti");
        }
    }

