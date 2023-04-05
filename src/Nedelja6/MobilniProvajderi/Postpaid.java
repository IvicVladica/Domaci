package Nedelja6.MobilniProvajderi;

public class Postpaid extends Korisnik {
     double racun;


    public Postpaid (String brojTel) {
            super(brojTel);
    }
    @Override
    public void azuriraj_racun_razgovor(Razgovor razgovor) {
        int duzinaSec = razgovor.getObracunatoTrajanje();
        if (razgovor.getPozvaniBroj().startsWith("064")) {
            racun = racun + (2.5  + duzinaSec * 2.8)*1.18;
        } else {
            racun = racun + (2.5  + duzinaSec * 5.8)*1.18;
        }
        System.out.println(racun);
    }

    @Override
    public void azuriraj_racun_SMS() {
        racun = (racun + 2.2)*1.18;
    }

    @Override
    public String toString() {
        return super.toString() + "Racun je: " + (racun+150);
    }
}
