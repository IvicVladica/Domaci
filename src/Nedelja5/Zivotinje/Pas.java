package Nedelja5.Zivotinje;

public class Pas implements Oglasavanje,Kretanje {
    private String ime;
    private String rasa;

    public Pas(String ime, String rasa){
        this.ime = ime;
        this.rasa = rasa;
    }

    @Override
    public int kreciSe() {
        return HODA | SKACE;
    }

    @Override
    public void oglasiSe() {
        System.out.println("Av! Av!");
    }

    @Override
    public String toString() {
        return "Pas{" +
                "ime='" + ime + '\'' +
                ", rasa='" + rasa + '\'' +
                '}';
    }

    @Override
    public void oglasiSeULjutnji() {
        System.out.println("Grrrr!");
    }
}




