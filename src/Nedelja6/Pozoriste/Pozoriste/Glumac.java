package Nedelja6.Pozoriste.Pozoriste;

//nasledjuje Zaposleni
public class Glumac extends Zaposleni {

    //konstruktor gde se prosledjuju ime i Pozoriste

    public Glumac(String imeZaposlenog, Pozoriste pozoriste) {
        super(imeZaposlenog, pozoriste);
    }

    @Override
    public String imePosla() {
        return "Glumac";
    }


    // metoda @Override imePosla "Glumac"
}
