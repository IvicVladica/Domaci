package Nedelja4.Nedelja4_ZadaciNedelja;//2. Napraviti 3 klase
//        i. klasu Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.Boca
//        ii. klasu Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.VinskaBoca nasleuje klasu Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.Boca
//        iii. klasu Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.RonilackaBoca nasleuje klasu Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.Boca
//        a) Klasa Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.Boca ima atribut zapremina
//        b) Klasa Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.VinskaBoca ima atribut nazivVina
//        c) Klasa Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.RonilackaBoca ima atribut masa
//        Sve tri klase imaju sopstvene konstruktore. U svim klasama napraviti metodu toString(), klasa
//        Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.Boca ima svoju metodu toString do klase Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.VinskaBoca i Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.RonilackaBoca nasleuju klasu boca i njene
//        atribute i metode. Za svaku bocu se moze proveriti da li je identicna nekoj drugoj boci, boce su
//        identicne ako imaju iste zapremine (ne moraju biti iste vrste).

public class Boca {
    double zapremina;

    Boca(double zapremina){
        this.zapremina = zapremina;
    }
    Boca(){};

    public double getZapremina() {
        return zapremina;
    }
    public void setZapremina(double zapremina) {
        this.zapremina = zapremina;
    }

    @Override
    public String toString() {
        return "Zapremina boce je: " + zapremina;
    }

}

