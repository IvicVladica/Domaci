package Nedelja5.Zivotinje;

public class Zaba implements Oglasavanje,Kretanje{
    private String ime;

    public Zaba(String ime) {
        this.ime = ime;
    }

    @Override
    public int kreciSe() {
        return SKACE | PLIVA | GNJURI;
    }

    @Override
    public void oglasiSe() {
        System.out.println("Kre! Kre!");
    }

    @Override
    public void oglasiSeULjutnji() {
        System.out.println("Kreeeeee!");
    }

    @Override
    public String toString() {
        return "Zaba{" +
                "ime='" + ime + '\'' +
                '}';
    }
}




