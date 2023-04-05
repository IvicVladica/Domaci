package Nedelja6.Pozoriste.Pozoriste;

//kostimograf nasledjuje zaposlenog
public class Kostimograf extends Zaposleni {


    public Kostimograf(String imeZaposlenog, Pozoriste pozoriste) {
        super(imeZaposlenog, pozoriste);
    }

    @Override
    public String imePosla() {
        return "kostimograf";
    }

    //ima konstruktor gde se prosledjuje ime, Pozoriste

    // metodu @Override imaPosla i vraća "kostimograf"
}
