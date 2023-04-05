package Nedelja5.Zivotinje;

public class Riba implements Kretanje{
    private String ime;
    private String rasa;

    public Riba(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {
        return PLIVA;
    }

    @Override
    public String toString() {
        return "Riba{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}
