package Nedelja6.Pozoriste.Pozoriste;

public class Pozoriste {

    //Ima atribute:
    // next_id koji je jedinstveni za svaki objekat
    // ima id koji prepisuje unikatni id napravljen za svaki objekat
    //ima naziv pozorišta

    static int next_id;
    int id;
    String pozoriste;

    //konstruktor sa nazivom, gde se prosledi samo naziv a dobija unikatni id

    public Pozoriste(String nazivPozorista) {
        this.id = next_id;
        next_id ++;
    }

    //metode:
    //getID
    //getNaziv
    //tostring

    public int getId() {
        return id;
    }

    public String getNazivPozorista() {
        return pozoriste;
    }

    @Override
    public String toString() {
        return "Pozoriste{" +
                "id=" + id +
                ", nazivPozorista='" + pozoriste + '\'' +
                '}';
    }


}
