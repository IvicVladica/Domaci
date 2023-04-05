package Nedelja6.Pozoriste.Pozoriste;


//reditelj je specijalni zaposleni ima sve kao zaposleni ali je reditelj
// ima metodu imePosla koja vraća "Reditelj"

public class Reditelj extends Zaposleni{

    public Reditelj(String imeZaposlenog, Pozoriste pozoriste) {
        super(imeZaposlenog, pozoriste);
    }

    @Override
    public String imePosla() {
        return "reditelj";
    }
}
