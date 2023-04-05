package Nedelja6.MobilniProvajderi;

public class Application {
    public static void main(String[] args) {

        Postpaid psp1 = new Postpaid("0641171588");
        psp1.racun = 0;
        System.out.println(psp1);
        Prepaid prp1 = new Prepaid("06412345678", "0661111111", "0642222222", "0653333333");
        prp1.kredit = 250;
        prp1.dopuniKredit(200);
        System.out.println(prp1);
        Vreme v1 = new Vreme(1,2,15);
        Razgovor r1 = new Razgovor("0641234567", v1);
        System.out.println(r1.getObracunatoTrajanje());
        psp1.azuriraj_racun_razgovor(r1);
        System.out.println(psp1);
    }
}
