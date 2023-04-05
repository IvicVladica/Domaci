package Nedelja4.Nedelja4_ZadaciNedelja;

public class VinskaBoca extends Boca{
    String nazivVina;

    VinskaBoca(double zapremina, String nazivVina) {
        super(zapremina);
        this.nazivVina = nazivVina;
    }
    VinskaBoca(){};

    public String getNazivVina() {
        return nazivVina;
    }

    public void setNazivVina(String nazivVina) {
        this.nazivVina = nazivVina;
    }

    @Override
    public String toString() {
        return "Naziv vina je: " + nazivVina + ", " + super.toString();
    }
}
