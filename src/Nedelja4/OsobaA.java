//Klasa Osoba
//atribute: ime, prezime, godRodjenja, zanimanje
//konstruktori, get/set metode za ove atribute, toString
//Klasa SuperHeroj nasleđuje klasu Osoba, superMoc, superHerojIme
//konstruktori, get/set metode za ove atribute, toString

package Nedelja4;

public class OsobaA {
    String ime;
    String prezime;
    int godRodjenja;
    String zanimanje;

    static {
        System.out.println("Osoba nema super moci!");
    }

    OsobaA(String ime, String prezime, int godRodjenja, String zanimanje) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodjenja = godRodjenja;
        this.zanimanje = zanimanje;
    }
    OsobaA(){};

    public String getIme() {return ime;}
    public String getPrezime() {return prezime;}
    public int getGodRodjenja() {return godRodjenja;}
    public String getZanimanje() {return zanimanje;}

    public void setIme(String ime) {this.ime = ime;}
    public void setPrezime(String prezime) {this.prezime = prezime;}
    public void setGodRodjenja(int godRodjenja) {this.godRodjenja = godRodjenja;}
    public void setZanimanje(String zanimanje) {this.zanimanje = zanimanje;}
    @Override
    public String toString(){
        return ime + " " + prezime + " " + godRodjenja + " " + zanimanje;
    }

}
