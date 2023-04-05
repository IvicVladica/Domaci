package Nedelja5.Nedelja5_ZadatakSreda;

public class Application {
    public static void main(String[] args) {
        var igra = new Skocko(4); // ...
        //
       do { igra.pokusaj(); } while (!igra.jeGotova());
       if (igra.isGameOver()) {System.out.println("Istekao je broj pokusaja!");}
    }
}


