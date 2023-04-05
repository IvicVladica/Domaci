package Nedelja5.Zivotinje;

public class Kokoska implements Oglasavanje,Kretanje{
    String ime;
    String rasa;

    public Kokoska(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {
        return HODA | LETI;
    }

    @Override
    public void oglasiSe() {
        System.out.println("Ko-ko-da!");
    }

    @Override
    public void oglasiSeULjutnji() {
        System.out.println("KOKODAAAA!");
    }

    @Override
    public String toString() {
        return "Kokoska{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}

