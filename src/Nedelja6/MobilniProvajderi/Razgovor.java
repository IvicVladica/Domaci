package Nedelja6.MobilniProvajderi;

public class Razgovor {
    private String pozvaniBroj;
    private Vreme trajanjeRazgovora;
    private int obracunatoTrajanje;
    public Razgovor (String pozvaniBroj, Vreme trajanjeRazgovora) {
        this.pozvaniBroj = pozvaniBroj;
        this.trajanjeRazgovora = new Vreme(trajanjeRazgovora);
    }
    public Razgovor (Razgovor r) {
        this(r.pozvaniBroj, r.trajanjeRazgovora);
    }
    public String getPozvaniBroj() {
        return pozvaniBroj;
    }

    public int getObracunatoTrajanje() {
        return (trajanjeRazgovora.getSekund() + trajanjeRazgovora.getMinut()*60 + trajanjeRazgovora.getSat()*3600);
    }
}
