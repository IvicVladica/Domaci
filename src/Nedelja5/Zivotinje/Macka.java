package Nedelja5.Zivotinje;

public class Macka implements Oglasavanje,Kretanje{
    private String ime;
    private String rasa;

    public Macka(String ime, String rasa) {
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {
        return HODA | SKACE;
    }

    @Override
    public void oglasiSe() {
        System.out.println("Mnjauuu!");
    }

    @Override
    public void oglasiSeULjutnji() {
        System.out.println("MNJAUUUUUUUU!");
    }

    @Override
    public String toString() {
        return "Macka{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }
}


