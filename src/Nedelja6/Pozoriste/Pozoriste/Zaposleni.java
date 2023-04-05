package Nedelja6.Pozoriste.Pozoriste;

//apstraktna klasa
public abstract class Zaposleni {

    //ima atribute ime zaposlenog i Pozoriste gde zaposleni radi

    String imeZaposlenog;
    Pozoriste pozoristeZaposlenog;

    //konstruktor koji prosleđuje ime i Pozorište u kom zaposleni radi

    public Zaposleni (String imeZaposlenog, Pozoriste pozoristeZaposlenog) {
        this.imeZaposlenog = imeZaposlenog;
        this.pozoristeZaposlenog = pozoristeZaposlenog;
    }

    // Свака поткласа (која није апстрактна) мора да
    // имплементира ову методу
    public abstract String imePosla();

    //metodu getIme

    public String getImeZaposlenog() {
        return imeZaposlenog;
    }

    //metodu get pozoriste koja vraca Pozoriste


    public Pozoriste getPozoristeZaposlenog() {
        return pozoristeZaposlenog;
    }
}
