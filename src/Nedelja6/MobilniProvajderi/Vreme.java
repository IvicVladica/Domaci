package Nedelja6.MobilniProvajderi;

public class Vreme {
    private int sat;
    private int minut;
    private int sekund;
    int obracunatoVremeSec;

    public Vreme(int sat, int minut, int sekund) {
        this.sat = sat;
        this.minut = minut;
        this.sekund = sekund;
    }
    public Vreme (Vreme o) {
        this(o.sat, o.minut, o.sekund);
    }
    public int getSat() {
        return sat;
    }
    public int getMinut() {
        return minut;
    }
    public int getSekund() {
        return sekund;
    }
    public Vreme sledeciSat() {
        if (minut+1 < 59) {
            return new Vreme(sat, minut+1, 0);
        }
        else return new Vreme(sat+1, 0, 0);
    }
    public static boolean validan(int sat, int minut,int sekunda){
        return sat >= 0 && minut >= 0 && minut <= 59 && sekunda >= 0 && sekunda <=59;
    }

    public int getObracunatoVremeSec() {
        return (sekund + minut*60 + sat*3600);
    }

    @Override
    public String toString() {
        return "Vreme: " +
                "sat=" + sat +
                ", minut=" + minut +
                ", sekund=" + sekund +
                '}';
    }

}
