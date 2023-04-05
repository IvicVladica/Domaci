package Nedelja5.Nedelja5_ZadatakSreda;

public class Skocko {
    private int maxBrPokusaja;
    private int brPokusaja;
    private KombinacijaZnakova trazenaKombinacija;
    private KombinacijaZnakova trenutnaKombinacija;



        // Конструктор
    public Skocko(int maxBrPokusaja) {
        this.maxBrPokusaja = maxBrPokusaja;
        trazenaKombinacija = new KombinacijaZnakova(4);
        trazenaKombinacija.setRandom();

    }



    public void pokusaj() {

        System.out.println(trazenaKombinacija.getKombinacija());


        // brPokusaja++
        brPokusaja++;

        // Унесемо тренутну комбинацију
     //   trenutnaKombinacija = new KombinacijaZnakova(4);

        trenutnaKombinacija = new KombinacijaZnakova(4);
        trenutnaKombinacija.setKombinacija();

        // Испишемо ☺ ☺ ☺
        trenutnaKombinacija.porediKombinacije(trazenaKombinacija);
    }
    public boolean jeGotova(){
        // Провера дал је исто
        if (trenutnaKombinacija.equals(trazenaKombinacija)) {
            return true;
        }
        if (brPokusaja == maxBrPokusaja) {return true;}
        return false;
    }
    // boolean isGameOver()
    boolean isGameOver(){
        if (brPokusaja == maxBrPokusaja)
        {return true;}
        else return false;
    }

}