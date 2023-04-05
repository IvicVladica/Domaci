package Nedelja4;

public class Osoba {
    String ime;
    String prezime;
    int godinaRodjenja;
    String pol;

    Osoba(){};

    public Osoba(String ime, String prezime, int godinaRodjenja, String pol){};

    public String getIme () {
        return ime;
    }
    public String getPrezime () {
        return prezime;
    }
    public int getGodinaRodjenja () {
        return godinaRodjenja;
    }
    public String getPol () {
        return pol;
    }
    public void setIme (String ime) {
        this.ime = ime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }
    public void setGodinaRodjenja (int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void setPol (String pol) {
        this.pol = pol;
    }
}
