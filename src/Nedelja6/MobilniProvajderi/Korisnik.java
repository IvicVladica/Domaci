package Nedelja6.MobilniProvajderi;

public abstract class Korisnik {
    private String brojTel;

    public Korisnik(String brojTel) {
        this.brojTel = brojTel;
    }
    public Korisnik(Korisnik k) {
        this(k.brojTel);
    }
    public String getBrojTel() {
        return brojTel;
    }
    public abstract void azuriraj_racun_razgovor(Razgovor razgovor);
    public abstract void azuriraj_racun_SMS();

    public static boolean proveraBroja (String broj) {
        for (int i=0; i<broj.length();i++)
            if(!Character.isDigit(broj.charAt(i)))
                return false;
        return (broj.length() == 9 || broj.length() == 10) && ((broj.charAt(0) == '0' && broj.charAt(1) == '6'
                && (broj.charAt(2) == '4' || broj.charAt(2) == '5' || broj.charAt(2) == '6')));
    }

    @Override
    public String toString() {
        return "Korisnik: " + brojTel + ", ";
    }
}
