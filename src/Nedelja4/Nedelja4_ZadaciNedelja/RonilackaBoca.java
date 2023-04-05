package Nedelja4.Nedelja4_ZadaciNedelja;

public class RonilackaBoca extends Boca {
    double masa;

    RonilackaBoca(double zapremina, double masa) {
        super(zapremina);
        this.masa = masa;
    }
    RonilackaBoca (){};

    public double getMasa() {
        return masa;
    }
    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String toString() {
        return "Masa ronilacke boce je: " + masa + ", " + super.toString();
    }
}

