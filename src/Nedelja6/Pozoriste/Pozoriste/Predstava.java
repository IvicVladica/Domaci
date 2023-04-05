package Nedelja6.Pozoriste.Pozoriste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Predstava {

    //atribute:
    //naziv predstave
    //Pozorište kao atribut
    //listu zaposlenih

    String nazivPredstave;
    String pozoriste;
    List<Zaposleni> ListaZaposlenih;

    //konstruktor (naziv, Pozoriste, reditelja koji se dodaje u listu zaposlenih)

    public Predstava(String nazivPredstave, String pozoriste, Zaposleni reditelj) {
        this.nazivPredstave = nazivPredstave;
        this.pozoriste = pozoriste;
        this.ListaZaposlenih = new LinkedList<>();
        ListaZaposlenih.add(reditelj);
    }



    //TODO samo za onoga ko zeli ! nije obavezno!
    // TODO: dodaj(Glumac glumac) - boolean
    // da li vec postoji isti glumac  zaposleni.contains(glumac)
    // this.zaposleni.add(glumac);
    //
    // TODO: dodaj(Kostimograf k) - boolean

    //get naziv i pozoriste metode

    public String getNazivPredstave() {
        return nazivPredstave;
    }

    public String getPozoriste() {
        return pozoriste;
    }
    //to string metodu


    @Override
    public String toString() {
        return "Predstava{" +
                "nazivPredstave='" + nazivPredstave + '\'' +
                ", pozoriste='" + pozoriste + '\'' +
                ", ListaZaposlenih=" + ListaZaposlenih +
                '}';
    }
}

