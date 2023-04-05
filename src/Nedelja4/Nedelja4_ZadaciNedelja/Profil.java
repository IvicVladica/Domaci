package Nedelja4.Nedelja4_ZadaciNedelja;

public class Profil {
    String ime;
    String prezime;
    int godRodjenja;
    String zanimanje;

    public Profil(String i, String p, int g, String z) {
        this.ime = i;
        this.prezime = p;
        this.godRodjenja = g;
        this.zanimanje = z;
    }

    Profil() {
    }

    ;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public String getZanimanje() {
        return zanimanje;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void setZanimanje(String zanimanje) {
        this.zanimanje = zanimanje;
    }

    public String toString() {
        return ime + " " + prezime + " " + godRodjenja + " " + zanimanje;
    }
}
