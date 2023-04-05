package Nedelja5.Nedelja5_ZadatakSreda;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class KombinacijaZnakova {
    private int velicina;
    private ArrayList<String> kombinacija;

        // Конструктор који прима величину

    public KombinacijaZnakova(int velicina) {
        this.velicina = velicina;
        kombinacija = new ArrayList<>();
    }

    // void setter за комбинацију
    public void setKombinacija(){
        Scanner sc = new Scanner(System.in);
        System.out.println("x ".repeat(velicina));
        kombinacija.clear();

        for(int i = 0; i < velicina; i++){
            var znak = sc.next();
            kombinacija.add(znak);
            // else{ // “Premature optimization is the root of all evil”
            //     System.out.println("Дозвољена поља: " + Znakovi.dozvoljeniZnakovi);
            //     sc.nextLine();
            //     setKombinacija(); // Рекурзија
            //     return;
            // }
        }

        if(!Znakovi.dozvoljeniZnakovi.containsAll(kombinacija)){
            System.out.println("Дозвољена поља: " + Znakovi.dozvoljeniZnakovi);
            setKombinacija();
        }
    }

    public ArrayList<String> getKombinacija() {
        return kombinacija;
    }

    // void setRandom за комбинацију
    public void setRandom(){
        kombinacija.clear();
        // random број од 0 до velicina
        for(int i = 0; i < velicina; i++){
            var index = (int) (Math.random() * Znakovi.dozvoljeniZnakovi.size());
            kombinacija.add(Znakovi.dozvoljeniZnakovi.get(index));
        }
    }

    public boolean isEqual(KombinacijaZnakova kz){
        for(int i = 0; i < this.kombinacija.size(); i++){
            if(!this.kombinacija.get(i).equals(kz.kombinacija.get(i))){
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KombinacijaZnakova that = (KombinacijaZnakova) o;
        return Objects.equals(kombinacija, that.kombinacija);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kombinacija);
    }

    public void porediKombinacije(KombinacijaZnakova kz){
        int brojTacnih = 0;

        for(int i = 0; i < this.kombinacija.size(); i++){
            if(this.kombinacija.get(i).equals(kz.kombinacija.get(i))){
                brojTacnih++;
            }
        }

        System.out.println(":) ".repeat(brojTacnih));
        if (brojTacnih == velicina) {
            System.out.println("Bravo! Pogodili ste trazenu kombinaciju! ");
        }

    }

    // broj pogodjenih ali na pogresnom mestu
    // ☻ ☻ ☻ ☺
}