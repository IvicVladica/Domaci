//Napraviti klasu Knjiga koja opisuje knjigu. Od privatnih polja, klasa sadrzi:
//        • String naslov, naslov knjige
//        • Autor autor, autora knjige
//        • double ocena, prosecna ocena knjige, najmanje 0, najvise 10
//        Konstruktor za klasu je oblika:
//        • Knjiga(String naslov, Autor autor, double ocena)
//        Od metoda, klasa sadrzi:
//        • String getNaslov()
//        • Autor getAutor()
//        • double getOcena()
//        • String toString(), koji vraca stringovnu reprezentaciju knjige.
//        Obezbediti funkciju String toString() koja knjigu ispisuje kao:
//        > Knjiga: Zenica Sveta
//        > Ocena: 9.7
//        > Autor: Robert Dzordan
//        > Godina rodjenja: 1948
//        (ispisivanje može biti i linearno)
//        Napisati funkciju main u kojoj je potrebno napraviti sledece knjige1:
//        • Robert Dzordan, Zenica Sveta, 9.7
//        • Daniel Suarez, Demon, 9.5
//        • Daniel Suarez, Sloboda, 9.1
//        A pomenuti autori su:
//        • Robert Dzordan rodjen 1948.
//        • Daniel Suarez rodjen 1964.
//        *** Napraviti klasu Superknjiga koja nasleđuje klasu Knjiga
//        klasa ima sve atribute klase Knjiga i kao dodat atribut ISBN(int)
//        klasa nasleđuje sve metode klase Knjiga i ima sopstvenu metode za set/get za sam ISBN

package Nedelja4;
public class Knjiga {
    String naslov;
    String autor;
    double ocena;
    int godinaRodjenja;

    public Knjiga (String naslov, String autor, double ocena) {
        this.naslov = naslov;
        this.autor = autor;
        this.ocena = ocena;
    }
    Knjiga(){};
    public String getNaslov() {return naslov;}
    public String getAutor() {return autor;}
    public double getOcena() {return ocena;}

    public void ispisiString(){
        System.out.println("Knjiga: " + getNaslov());
        System.out.println("Ocena: " + getOcena());
        System.out.println("Autor: " + getAutor());
    }
}






