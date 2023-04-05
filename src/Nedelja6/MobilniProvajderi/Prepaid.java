package Nedelja6.MobilniProvajderi;

public class Prepaid extends Korisnik{
    double kredit;
    String ff1;
    String ff2;
    String ff3;

    public Prepaid (String brojTel, String ff1, String ff2, String ff3) {
        super(brojTel);
        this.ff1 = ff1;
        this.ff2 = ff2;
        this.ff3 = ff3;
    }

    public void dopuniKredit (double dopuna) {
        kredit = kredit + dopuna;
    }


    //novo obracunato trajanje da se napravi
    @Override
    public void azuriraj_racun_razgovor(Razgovor razgovor) {
        int duzinaSec = razgovor.getObracunatoTrajanje();
        if (razgovor.getPozvaniBroj().equals(ff1) || razgovor.getPozvaniBroj().equals(ff2)
                || razgovor.getPozvaniBroj().equals(ff3)) {
            kredit = kredit - (2.8  + duzinaSec * 4.5)*1.18;
        }
         else {
            kredit = kredit + (2.8  + duzinaSec * 7.8)*1.18;
        }
        System.out.println(kredit);


    }
    @Override
    public void azuriraj_racun_SMS() {
    }

    @Override
    public String toString() {
        return super.toString() + "Kredit: " + kredit + "\n" +
                "Friends&Family 1: " + ff1 + "\n" +
                "Friends&Family 2: " + ff2 + "\n" +
                "Friends&Family 3: " + ff3;
    }
}
