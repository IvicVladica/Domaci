package Nedelja5.Zivotinje;

public class Pingvin implements Kretanje{
    String ime;

    public Pingvin(String ime) {
        this.ime = ime;
    }

    @Override
    public int kreciSe() {
        return HODA | PLIVA | GNJURI;
    }

    @Override
    public String toString() {
        return "Pingvin{" +
                "ime='" + ime + '\'' +
                '}';
    }
}
