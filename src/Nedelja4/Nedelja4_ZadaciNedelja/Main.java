package Nedelja4.Nedelja4_ZadaciNedelja;

public class Main {
    public static void main(String[] args) {
        Biblioteka knjiga1 = new Biblioteka(1, "Viktor Igo", "Vandeja se buni");
        Biblioteka knjiga2 = new Biblioteka(2, "Fjodor Dostojevski", "Braca Karamazovi");
        Biblioteka knjiga3 = new Biblioteka(3, "Dzordz Orvel", "1984");
        Biblioteka knjiga4 = new Biblioteka(4, "Mihail Ljermontov", "Junak naseg doba");
        Biblioteka knjiga5 = new Biblioteka(5, "Borisav Pekic", "Novi Jerusalim");

        knjiga1.ispisiPodatke();
        knjiga2.ispisiPodatke();
        knjiga3.ispisiPodatke();
        knjiga4.ispisiPodatke();
        knjiga5.ispisiPodatke();

    }
}
